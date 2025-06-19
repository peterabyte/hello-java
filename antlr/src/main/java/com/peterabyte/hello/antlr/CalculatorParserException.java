package com.peterabyte.hello.antlr;

public class CalculatorParserException extends RuntimeException {
    public CalculatorParserException(String message) {
        super(message);
    }

    public CalculatorParserException(String message, Throwable cause) {
        super(message, cause);
    }
}
