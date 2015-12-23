package com.m2i.formation.jsf.webService;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class TestMax {

	public static void main(String[] args) throws ServiceException, RemoteException {

		HelloService maxservice = new HelloServiceServiceLocator().getHelloService();

		String s = maxservice.getHello();
		System.out.println(s);

		BookTO book = maxservice.getBook(1, "Enquete dans le brouillard", 9.5);
		System.out.println("MyId=" + book.getId());
		System.out.println("Titre=" + book.getTitle());
		System.out.println("Price=" + book.getPrice());

		BookTO book1 = maxservice.getById(2);
		System.out.println("Titre1=" + book1.getTitle());
		System.out.println("Price1=" + book1.getPrice());

	}
}
