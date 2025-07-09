package com.peterabyte.hello.lang.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.junit.Test;

public class CarTest {
    private static final Random RANDOM = new Random();

    @Test
    public void instanceReferenceShouldReturnTheSame() {
        List<Vehicle> vehicles = Collections.singletonList(givenCarWithLicensePlate());

        boolean resultViaInstanceRef = vehicles.stream().allMatch(Vehicle::hasLicensePlate);
        boolean resultViaMethodCall = vehicles.stream().allMatch(vehicle -> vehicle.hasLicensePlate());

        assertThat(resultViaInstanceRef).isTrue();
        assertThat(resultViaMethodCall).isTrue();
    }

    @Test
    public void staticMethodReferenceShouldReturnTheSame() {
        List<String> licensePlates = Collections.singletonList("ABCD1234");

        boolean resultViaStaticMethodRef = licensePlates.stream().allMatch(Vehicle::isLicensePlateValid);
        boolean resultViaStaticMethodCall = licensePlates.stream().allMatch(licensePlate -> Vehicle.isLicensePlateValid(licensePlate));

        assertThat(resultViaStaticMethodRef).isTrue();
        assertThat(resultViaStaticMethodCall).isTrue();
    }

    @Test
    public void newMethodReferenceShouldCreateTheSame() {
        List<String> licensePlates = Collections.singletonList("ABCD1234");

        List<Car> carsViaNewMethodReference = licensePlates.stream().map(Car::new).toList();
        List<Car> carsViaConstructorMethodCall = licensePlates.stream().map(licensePlate -> new Car(licensePlate)).toList();

        assertThat(carsViaNewMethodReference).hasSameElementsAs(carsViaConstructorMethodCall);
    }

    @Test
    public void functionalInterfaceShouldReturnResult() {
        Car car = new Car("ABCD1234");
        
        String licensePlateResult = car.apply(licensePlate -> new StringBuilder(licensePlate).reverse().toString());

        assertThat(licensePlateResult).isEqualTo("4321DCBA");
    }

    @Test
    public void optionalCarShouldReturnFalseIfNotPresent() {
        Optional<Car> car = Optional.ofNullable(null);

        assertThat(car.isPresent()).isFalse();
    }

    @Test
    public void optionalCarShouldReturnIfNotNull() {
        Optional<Vehicle> car = Optional.ofNullable(givenCarWithLicensePlate());

        assertThat(car.isPresent()).isTrue();
        assertThat(car.get()).isNotNull();
    }

    private Vehicle givenCarWithLicensePlate() {
        return new Car(String.valueOf(RANDOM.nextInt()));
    }
}
