package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main (String[] args) {

		ApplicationContext context =
			new ClassPathXmlApplicationContext (
				new String [] { "beans.xml" });

		Module printModule =
			context.getBean ("printModule", Module.class);

		printModule.doYourThing ("helloModule");
	}

}
