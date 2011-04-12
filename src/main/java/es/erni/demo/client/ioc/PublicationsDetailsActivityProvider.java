package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.activity.PublicationsDetailsActivity;
import es.erni.demo.client.ui.PublicationsDetailsView;

public class PublicationsDetailsActivityProvider implements Provider<PublicationsDetailsActivity> {
	
  private final PublicationsDetailsView view;

  @Inject
  public PublicationsDetailsActivityProvider(PublicationsDetailsView view) {
    this.view = view;
  }

  public PublicationsDetailsActivity get() {
    return new PublicationsDetailsActivity(view);
  }

}
