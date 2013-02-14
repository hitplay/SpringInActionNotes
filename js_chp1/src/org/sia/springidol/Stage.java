package org.sia.springidol;

import java.util.List;

public class Stage {
	
	public void startTheShow(){
		for(IPerform performer : performers)
			System.out.println(performer.perform());
	}
	
	public List<IPerform> getPerformers() {
		return performers;
	}

	public void setPerformers(List<IPerform> performers) {
		this.performers = performers;
	}

	private List<IPerform> performers;
}
