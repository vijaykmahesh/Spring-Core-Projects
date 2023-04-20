package com.seleniumexpress.fistspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class App3 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	ExpressionParser expressionParser = new SpelExpressionParser();
    	
    	StandardEvaluationContext context = new StandardEvaluationContext();
    	context.setBeanResolver(new BeanFactoryResolver(container));
    	
    	
    	String playerName = (String)expressionParser.parseExpression("@player.playerName").getValue(context);
    	System.out.println("player name : "+ playerName);
    	
    	String age = (String)expressionParser.parseExpression("@player.playerAge").getValue(context);
    	System.out.println(age);
    	
    	String playerCountryName = (String)expressionParser.parseExpression("@player.playerCountryName").getValue(context);
    	System.out.println(playerCountryName);
    	
    	String state = (String)expressionParser.parseExpression("@player.state").getValue(context);
    	System.out.println("state is : " + state);
    }
}

















