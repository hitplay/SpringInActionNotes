package org.sia.springidol;

import org.sia.springidol.instrument.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Guitarist implements IPerform{

	@Override
	public String perform() {
		return "I am a Guitarist and I am playing a " + guitar;
	}

	public Instrument getGuitar() {
		return guitar;
	}
	
	@Autowired
	public void setGuitar(Instrument guitar) {
		this.guitar = guitar;
	}

	private Instrument guitar;
	
	
}
