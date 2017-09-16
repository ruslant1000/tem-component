package zz;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.settings.RequestCycleSettings.RenderStrategy;

public class MyExampleApplication extends WebApplication{

	
	@Override
	protected void init() {
		super.init();
		getMarkupSettings().setStripWicketTags(true);

		
		getRequestCycleSettings().setRenderStrategy(RenderStrategy.ONE_PASS_RENDER);
//		mount(new MyMount("aaa", MyExamplePage.class));
	}



	@Override
	public Class<? extends Page> getHomePage() {
		
		return MyExamplePage.class;
	}

	
	
}
