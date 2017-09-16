package kz;

import org.apache.wicket.core.request.handler.BookmarkableListenerInterfaceRequestHandler;
import org.apache.wicket.core.request.handler.ListenerInterfaceRequestHandler;
import org.apache.wicket.core.request.mapper.MountedMapper;
import org.apache.wicket.request.IRequestHandler;
import org.apache.wicket.request.Url;
import org.apache.wicket.request.component.IRequestablePage;
import org.apache.wicket.request.mapper.parameter.PageParametersEncoder;

public class MyMoubter extends MountedMapper{

	public MyMoubter(String mountPath, Class<? extends IRequestablePage> pageClass) {
		super(mountPath, pageClass, new PageParametersEncoder());
	}

	@Override
	public Url mapHandler(IRequestHandler arg0) {
		if(arg0 instanceof ListenerInterfaceRequestHandler || arg0 instanceof BookmarkableListenerInterfaceRequestHandler){
			return null;
		}else
			return super.mapHandler(arg0);
	}

	
	
}
