package org.js.chp1.services;

import org.js.chp1.readers.IReader;

public class ReaderService {
	
	private IReader reader;

	public IReader getReader() {
		return reader;
	}

	public void setReader(IReader reader) {
		this.reader = reader;
	}
	
	public String fetchData(){
		return reader.read();
	}
}
