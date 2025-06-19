package com.peterabyte.hello.antlr;

import com.peterabyte.hello.antlr.expr.Abs;
import com.peterabyte.hello.antlr.expr.Add;
import com.peterabyte.hello.antlr.expr.Assign;
import com.peterabyte.hello.antlr.expr.Expression;
import com.peterabyte.hello.antlr.expr.ExprSeq;
import com.peterabyte.hello.antlr.expr.Max;
import com.peterabyte.hello.antlr.expr.Min;
import com.peterabyte.hello.antlr.expr.Variable;
import com.peterabyte.hello.antlr.expr.Number;
import com.peterabyte.hello.antlr.expr.Print;
import com.peterabyte.hello.antlr.expr.Sub;

import java.util.ArrayList;
import java.util.List;

public class CalculatorExpressionVisitor extends CalculatorBaseVisitor<Expression> {
    @Override
    public Expression visitExpressions(CalculatorParser.ExpressionsContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        for (CalculatorParser.ExprContext exprCtx :ctx.expr()) {
            expressions.add(visit(exprCtx));
        }
        return new ExprSeq(expressions);
    }

    @Override
    public Expression visitBinaryExpr(CalculatorParser.BinaryExprContext ctx) {
        switch (ctx.op.getType()) {
            case CalculatorParser.ADD:
                return new Add(visit(ctx.left), visit(ctx.right));
            case CalculatorParser.SUB:
                return new Sub(visit(ctx.left), visit(ctx.right));
            default:
                throw new CalculatorParserException("Failed to create binary expression! Unsupported binary operation: " + ctx);
        }
    }

    @Override
    public Expression visitNumberExpr(CalculatorParser.NumberExprContext ctx) {
        try {
            double number = Double.parseDouble(ctx.NUMBER().getText());
            return new Number(number);
        } catch (NumberFormatException ex) {
            throw new CalculatorParserException("Failed to read number! " + ctx, ex);
        }
    }

    @Override
    public Expression visitIdExpr(CalculatorParser.IdExprContext ctx) {
        return new Variable(ctx.IDENTIFIER().getText());
    }

    @Override
    public Expression visitAssignExpr(CalculatorParser.AssignExprContext ctx) {
        return new Assign(ctx.IDENTIFIER().getText(), visit(ctx.value));
    }

    @Override
    public Expression visitFunctionExprMultiArgs(CalculatorParser.FunctionExprMultiArgsContext ctx) {
        List<Expression> args = new ArrayList<>();
        for (CalculatorParser.ExprContext exprContext : ctx.args) {
            args.add(visit(exprContext));
        }
        switch (ctx.name.getType()) {
            case CalculatorParser.PRINT:
                return new Print(args);
            case CalculatorParser.MIN:
                return new Min(args);
            case CalculatorParser.MAX:
                return new Max(args);
            default:
                throw new CalculatorParserException("Failed to create calculator function! " + ctx);
        }
    }

    @Override
    public Expression visitFunctionExprSingleArg(CalculatorParser.FunctionExprSingleArgContext ctx) {
        switch (ctx.name.getType()) {
            case CalculatorParser.ABS:
                return new Abs(visit(ctx.arg));
            default:
                throw new CalculatorParserException("Failed to create calculator function! " + ctx);
        }
    }
}
