package com.express.spring_basic.spring_basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.express.config.AppConfig;
import com.express.model.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	context.getBean("player", Player.class).playGame();
    	
    	
    }
}
