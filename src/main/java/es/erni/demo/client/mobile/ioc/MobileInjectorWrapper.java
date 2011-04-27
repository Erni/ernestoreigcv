package es.erni.demo.client.mobile.ioc;

import com.google.gwt.core.client.GWT;

import es.erni.demo.client.ioc.AppGinjector;
import es.erni.demo.client.ioc.InjectorWrapper;

public class MobileInjectorWrapper implements InjectorWrapper {
	
	public AppGinjector getInjector() {
		return GWT.create(MobileInjector.class);
  }

}
