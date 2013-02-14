package org.js.chp1.readers;

public class FtpReader implements IReader{
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	@Override
	public String read() {
		return "Read data from an FTP";
	}
	
	private String host;
	private int port;
}
