package kz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.PortletConfig;

public class Test {

	private Map<String, String[]> containerRuntimeOptions;
	
	
	public Test(PortletConfig config){
		System.out.println("UUUUUUUUUUUUU");
		containerRuntimeOptions = new HashMap<String, String[]>(config.getContainerRuntimeOptions());
		containerRuntimeOptions.put("aaa",new String[]{"sdsd","fff"});
		containerRuntimeOptions = Collections.unmodifiableMap(containerRuntimeOptions);
		System.out.println("UUUUUUUUUUUUU .");
	}
	public Test(){
		containerRuntimeOptions = new HashMap<String, String[]>();
		containerRuntimeOptions.put("aaa",new String[]{"sdsd","fff"});
		containerRuntimeOptions = Collections.unmodifiableMap(containerRuntimeOptions);
	}
	public static void main(String[] args) {
		new Test();
		System.out.println("ok");
	}
}
