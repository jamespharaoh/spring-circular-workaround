package demo;

import org.springframework.stereotype.Component;

@Component
public class HelloModule
	implements Module {

	public Object doYourThing (Object data) {
		return "Hello world!";
	}
}
