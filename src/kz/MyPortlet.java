package kz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.wicket.portlet.WicketPortlet;

public class MyPortlet extends WicketPortlet{
	
	private Map<String, String[]> containerRuntimeOptions;

	
//	@Override
//	public void init(PortletConfig config) throws PortletException {
//		new Test(config);
//		try{
//			super.init(config);
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}
////		config.getContainerRuntimeOptions();
//	}

//	@RenderMode(name="VIEW")
//	public void view(RenderRequest request, RenderResponse responce) throws PortletException,IOException{
//		super.doView(request, responce);
////		PrintWriter pw = responce.getWriter();
////		pw.write("Hello wicket");
//		 
//	}
	
	
}
