package com.seleniumexpress.fistspringapp;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App2 
{
    public static void main( String[] args )
    {
    	
    	ExpressionParser expressionParser = new SpelExpressionParser();
    	
    	Inventor inObj = new Inventor("RAMESH", "23");
    	
    	Expression expression = expressionParser.parseExpression("name");
    	
    	String name = (String)expression.getValue(inObj);
    	
    	System.out.println(name);
    	
    	
    	String age = (String)expressionParser.parseExpression("age").getValue(inObj);
    	System.out.println(age);
    	
    	
    	
    }
}

















