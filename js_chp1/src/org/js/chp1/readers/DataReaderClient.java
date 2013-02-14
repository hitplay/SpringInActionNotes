package org.js.chp1.readers;

import org.js.chp1.services.ReaderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataReaderClient {

	private ApplicationContext ctx = null;
	private ReaderService service = null;

	public DataReaderClient() {
		ctx = new ClassPathXmlApplicationContext("reader-beans.xml");
	}

	public String getData() {
		service = (ReaderService) ctx.getBean("readerService");
		return service.fetchData();
	}

	public static void main(String[] args) {
		DataReaderClient client = new DataReaderClient();
		System.out.println("Got Data: " + client.getData());
	}
}
