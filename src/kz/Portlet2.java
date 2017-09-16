package kz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class Portlet2 extends GenericPortlet{

	
	
	@RenderMode(name="VIEW")
	public void view(RenderRequest request, RenderResponse responce) throws PortletException,IOException{
		PrintWriter pw = responce.getWriter();
		pw.write("Hello world!!---");
		 
	}


}
