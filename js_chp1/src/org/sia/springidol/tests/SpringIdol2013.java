package org.sia.springidol.tests;

import org.sia.springidol.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdol2013 {
	private ApplicationContext ctx = null;

	public SpringIdol2013() {
		ctx = new ClassPathXmlApplicationContext("resource/springidol-beans.xml");
	}

	public Stage getStage() {
		Stage eventStage = (Stage) ctx.getBean("springIdolStage");
		return eventStage;
	}

	public void startTheShow(){
		Stage idolStage = getStage();
		idolStage.startTheShow();
	}
	public static void main(String[] args) {
		SpringIdol2013 springIdol2013 = new SpringIdol2013();
		springIdol2013.startTheShow();
	}
}