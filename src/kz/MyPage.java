package kz;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

@SuppressWarnings("serial")
public class MyPage extends WebPage{

	
	
	public MyPage(){
//		setVersioned(false);
		String ss = null;//(String)getSession().getAttribute("xx");
		if(ss==null)ss="ruslan";
		add(new Label("xx",ss).setOutputMarkupId(true));
		AjaxLink l = new AjaxLink<Void>("lnk") {

			@Override
			public void onClick(AjaxRequestTarget arg0) {
				System.out.println("ookkkkkk ");
				
				Label xxx = new Label("xx","PASSSSSS");
				getSession().setAttribute("xx", "PASSSSSS");
				xxx.setOutputMarkupId(true);
				MyPage.this.get("xx").replaceWith(xxx);
				arg0.add(xxx);
				
			}
		};
		add(l);
		
		Link l2 = new Link<Void>("lnk2") {

			@Override
			public void onClick() {
				System.out.println("OOKK");
			}
		};
		add(l2);
	}
}
