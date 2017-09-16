package kz;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.settings.RequestCycleSettings.RenderStrategy;

public class MyApplication extends WebApplication{

	
	
	
	@Override
	protected void init() {
		super.init();
		getRequestCycleSettings().setRenderStrategy(RenderStrategy.REDIRECT_TO_BUFFER);
		mount(new MyMoubter("/pg", MyPage.class));
	}



	@Override
	public Class<? extends Page> getHomePage() {
		return MyPage.class;
	}
	
	

}
