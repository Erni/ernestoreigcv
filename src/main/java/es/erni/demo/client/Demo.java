package es.erni.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import es.erni.demo.client.ioc.AppGinjector;

public class Demo implements EntryPoint {
	
	private final AppGinjector injector = GWT.create(AppGinjector.class);

	public void onModuleLoad() {
		DemoApp app = injector.getDemoApp();
		app.run();
	}

}
