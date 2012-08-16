package demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class PrintModule
	implements Module {

	@Resource ModuleManager moduleManager;

	public Object doYourThing (Object data) {

		String targetModuleName =
			(String) data;

		Module otherModule =
			moduleManager.getModuleByName (targetModuleName);

		Object result =
			otherModule.doYourThing (null);

		System.out.println ("Got result: " + result);

		return null;
	}
}
