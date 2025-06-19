package com.peterabyte.hello.antlr.expr;

import com.peterabyte.hello.antlr.context.ExpressionContext;
import com.peterabyte.hello.antlr.context.PrintService;

import java.util.List;

public class Print implements Expression {
    private final List<Expression> args;

    public Print(List<Expression> args) {
        this.args = args;
    }

    @Override
    public Object exec(ExpressionContext context) {
        PrintService printService = context.getPrintService();
        for (Expression argExpr : args) {
            printService.print(argExpr.exec(context));
        }
        return null;
    }
}
