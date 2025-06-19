package com.peterabyte.hello.antlr.expr;

import com.peterabyte.hello.antlr.context.ExpressionContext;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public Object exec(ExpressionContext context) {
        return context.getVariable(name);
    }
}
