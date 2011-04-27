package es.erni.demo.client.ioc;

import com.google.gwt.inject.client.Ginjector;

import es.erni.demo.client.DemoApp;

/**
 * This is the application ginjector.
 * It defines the method our EntryPoint will use to initialize GIN dependecy graph
 * and the GIN module where binding is defined
 */
//@GinModules(GinModule.class)
public interface AppGinjector extends Ginjector {
  DemoApp getDemoApp();
}
