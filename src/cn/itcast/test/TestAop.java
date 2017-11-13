package cn.itcast.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.aop.Book;

public class TestAop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		
		Book book = (Book) context.getBean("book");
		book.add();

	}

}
