package com.seleniumexpress.fistspringapp;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ExpressionParser expressionParser = new SpelExpressionParser();
    	
    	Expression expression = expressionParser.parseExpression("'hello world !!'");
    	
    	String expressionString = expression.getExpressionString();
    	
    	System.out.println("the expression which should be evaluated : " + expressionString );
    	
    	String value = (String)expression.getValue();
    	
    	System.out.println("Value of the expression is : " + value);
    	
    	
    	System.out.println("************");
    	//2nd example
    	
    	Expression expression2 = expressionParser.parseExpression("'hello world '.concat('!!!!!!!!') ");
        String expressionString1 = expression2.getExpressionString();
    	
    	System.out.println("the expression which should be evaluated : " + expressionString1 );
    	
    	String concatString = (String)expression2.getValue();
    	
    	System.out.println("result : " + concatString);
    	
    	
    	
    	
    	System.out.println("*********");
    	
    	Expression parseExpression = expressionParser.parseExpression("'abhi'.length");
    	
        System.out.println(parseExpression.getValue(Integer.class));
    	
    	
    	
    	
    	System.out.println(expressionParser.parseExpression("new String('Ashok').toUpperCase").getValue());
    	
    	
    	System.out.println(expressionParser.parseExpression("10<15").getValue());
    	
    	
    	System.out.println(expressionParser.parseExpression("{1,2,3}").getValue());
    	
    	
    	System.out.println(expressionParser.parseExpression("{1:'RCB',2:'MI',3:'DC'}").getValue());
    	
    	System.out.println(expressionParser.parseExpression("5*6").getValue());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}

















