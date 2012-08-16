package demo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ModuleManagerImpl
	implements
		InitializingBean,
		ModuleManager {

	@Resource ModuleManagerProxy moduleManagerProxy;

	@Resource Map<String,Module> modulesByName =
		new HashMap<String,Module> ();

	@Override
	public void afterPropertiesSet ()
		throws Exception {

		moduleManagerProxy.setTarget (this);
	}

	@Override
	public Module getModuleByName (String name) {
		return modulesByName.get (name);
	}
}
