package com.peterabyte.hello.lang.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Vehicle {
    static boolean isLicensePlateValid(String licensePlate) {
        Pattern pattern = Pattern.compile("[A-Z0-9]+");
        Matcher matcher = pattern.matcher(licensePlate);
        return matcher.matches();
    }

    default boolean hasLicensePlate() {
        return getLicensePlate() != null && !getLicensePlate().isEmpty();
    }

    default String getLicensePlate() {
        return "";
    }

    String apply(LicensePlateConsumer f);
}
