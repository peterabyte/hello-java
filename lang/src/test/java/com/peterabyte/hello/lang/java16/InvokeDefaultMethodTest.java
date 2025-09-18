package com.peterabyte.hello.lang.java16;

import static java.lang.ClassLoader.getSystemClassLoader;
import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

public class InvokeDefaultMethodTest {
    @Test
    public void givenProxyShouldInvokeDefaultMEthod() throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        Object proxy = Proxy.newProxyInstance(
            getSystemClassLoader(),
            new Class<?>[] { HelloWorld.class },
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (method.isDefault()) {
                        return InvocationHandler.invokeDefault(proxy, method, args);
                    }
                    return 42;
                }
            }
        );

        Method hello = proxy.getClass().getMethod("hello");

        assertThat(hello.invoke(proxy)).isEqualTo("world");
    }
}
