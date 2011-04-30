package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.activity.DefaultActivity;
import es.erni.demo.client.ui.DefaultView;

public class DefaultActivityProvider implements Provider<DefaultActivity> {
	
  private final DefaultView view;
  
  @Inject
  public DefaultActivityProvider(DefaultView view) {
    this.view = view;
  }

	public DefaultActivity get() {
    return new DefaultActivity(view);
  }

}
