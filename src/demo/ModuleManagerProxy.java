package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ModuleManagerProxy
	implements ModuleManager {

	ModuleManager target;

	public void setTarget (ModuleManager target) {
		this.target = target;
	}

	@Override
	public Module getModuleByName (String name) {
		return target.getModuleByName (name);
	}

	
}
