package com.m2i.formation.jsf.managedBeans;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class Test {

	public static void main(String[] args) throws ServiceException, RemoteException {

		HelloService service = new HelloServiceServiceLocator().getHelloService();

		String s = service.getHello();
		System.out.println(s);

		BookBean book = service.getBook(1, "Enquete dans le brouillard", 9.5);
		System.out.println("MyId=" + book.getId());
		System.out.println("Titre=" + book.getTitle());
		System.out.println("Price=" + book.getPrice());
		System.out.println("Category=" + book.getCategory());

		/*BookBean book1 = service.getBookById(2);
		System.out.println("MyId=" + book.getId());
		System.out.println("Titre=" + book1.getTitle());
		System.out.println("Price=" + book1.getPrice());*/

	}

}
