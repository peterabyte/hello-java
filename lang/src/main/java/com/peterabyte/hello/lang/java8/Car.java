package com.peterabyte.hello.lang.java8;

import java.util.Objects;

public class Car implements Vehicle {
    private final String licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String apply(LicensePlateConsumer f) {
        return f.method(licensePlate);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((licensePlate == null) ? 0 : licensePlate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Car car) {
            return Objects.equals(this.licensePlate, car.licensePlate);
        }
        return false;
    }
}
