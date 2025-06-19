package com.peterabyte.hello.antlr.expr;

import com.peterabyte.hello.antlr.context.ExpressionContext;

public class Number implements Expression {
    private final double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public Object exec(ExpressionContext context) {
        return number;
    }
}
