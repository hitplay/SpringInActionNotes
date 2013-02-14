package org.sia.springidol.instrument;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Saxophone implements Instrument, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9197677933974207444L;

	public String toString(){
		return "Saxohpone";
	}
}
