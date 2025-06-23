package com.peterabyte.hello.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(value = { Mode.AverageTime })
@Warmup(iterations = 4, time = 1000, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 4, time = 1000, timeUnit = TimeUnit.MILLISECONDS)
@Fork(1)
public class ContainerBenchmark {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
            .include(ContainerBenchmark.class.getSimpleName())
            .shouldFailOnError(true)
            .build();
        new Runner(opt).run();
    }

    @State(Scope.Group)
    public static class BenchmarkState {
        private final Random RANDOM = new Random();
        private Container container;
        private int element;

        @Param({"ContainerList", "ContainerSet" })
        public String containerType;

        @Param({"100", "10000", "1000000"})
        public int numOfElements;
        
        @Setup(Level.Iteration)
        public void setupContainer() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
            Class<?> containerClass = Class.forName("com.peterabyte.hello.jmh." + containerType);
            container = (Container) containerClass.getConstructor().newInstance();
            for (int i = 0; i < numOfElements; i++) {
                container.add(i);
            }
        }

        @Setup(Level.Invocation)
        public void setupElement() {
            element = RANDOM.nextInt(numOfElements);
        }
    }

    @Benchmark
    @Group("containerContains")
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public Object containerContains(BenchmarkState state) {
        return state.container.contains(state.element);
    }
}
