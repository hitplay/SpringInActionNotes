package org.sia.springidol;

import org.sia.springidol.instrument.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Saxophonist implements IPerform{

	@Override
	public String perform() {
		return "I am A Saxophonist and I am Playing The : "+ saxophone;
	}

	public Instrument getSaxophone() {
		return saxophone;
	}
	
	@Autowired
	public void setSaxophone(Instrument saxophone) {
		this.saxophone = saxophone;
	}
	
	private Instrument saxophone;
}
