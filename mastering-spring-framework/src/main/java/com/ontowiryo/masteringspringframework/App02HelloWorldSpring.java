package com.ontowiryo.masteringspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ontowiryo.masteringspringframework.game.GameRunner;
import com.ontowiryo.masteringspringframework.game.MarioGame;
import com.ontowiryo.masteringspringframework.game.PacmanGame;
import com.ontowiryo.masteringspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1. Launch a spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		
		//2. Configure the things that we want Sprint to manage - @Configuration
		System.out.println(context.getBean("name"));
		if(context.containsBean("ngawur")) {
			System.out.println(context.getBean("ngawur"));
		}
		
		

	}

}
