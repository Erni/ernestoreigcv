package es.erni.demo.client.ioc;

import com.google.gwt.core.client.GWT;

public class DesktopInjectorWrapper implements InjectorWrapper {

	public AppGinjector getInjector() {
		return GWT.create(DesktopInjector.class);
  }

}
