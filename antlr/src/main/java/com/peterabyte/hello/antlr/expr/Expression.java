package com.peterabyte.hello.antlr.expr;

import com.peterabyte.hello.antlr.context.ExpressionContext;

public interface Expression {
    Object exec(ExpressionContext context);
}
