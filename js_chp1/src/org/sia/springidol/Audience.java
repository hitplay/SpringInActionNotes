package org.sia.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public void takeSeats(){
		System.out.println("The audience is taking their seats");
	}
	
	public void turnOffCellPhones(){
		System.out.println("The Audience is turning off their cellphones");
	}
	
	public void applaud(){
		System.out.println("CLAP CLAP CLAP CLAP!");
	}
	
	public void boo(){
		System.out.println("You Fucking Suck");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		//Before Advice
		takeSeats();
		turnOffCellPhones();
		
		//Get the starting time of the advice
		Long start =System.currentTimeMillis();
		//Proceed with the advince method
		try {
			
		joinPoint.proceed();
		
		//After advice
		Long end = System.currentTimeMillis();
		
		System.out.println(" Clap Clap Clap");
		System.out.println("The Performance took "+(end - start) +"milliseconds");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
