package es.erni.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import es.erni.demo.client.ioc.InjectorWrapper;

public class Demo implements EntryPoint {
	
//	private final AppGinjector injector = GWT.create(AppGinjector.class);
	
	private final InjectorWrapper injectorWrapper = GWT.create(InjectorWrapper.class);

	public void onModuleLoad() {
//		DemoApp app = injector.getDemoApp();
		DemoApp app = injectorWrapper.getInjector().getDemoApp();
		app.run();
	}

}
