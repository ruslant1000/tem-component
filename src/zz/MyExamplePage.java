package zz;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

@SuppressWarnings("serial")
public class MyExamplePage extends WebPage {

	public MyExamplePage(){
		System.out.println("...");
		add(new Label("txt","GGHH"));
		 
		
		AjaxLink s = new AjaxLink<Void>("s") {


			@Override
			public void onClick(AjaxRequestTarget arg0) {
				System.out.println("dfgg");
				
			}  
			
		}; 
		add(s);
		}

	
}
