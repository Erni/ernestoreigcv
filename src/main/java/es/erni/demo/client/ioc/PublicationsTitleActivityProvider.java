package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.PublicationsTitleActivity;
import es.erni.demo.client.ui.PublicationsTitleView;

public class PublicationsTitleActivityProvider  implements Provider<PublicationsTitleActivity> {
	
  private final PublicationsTitleView view;

  @Inject
  public PublicationsTitleActivityProvider(PublicationsTitleView view) {
    this.view = view;
  }

  public PublicationsTitleActivity get() {
    return new PublicationsTitleActivity(view);
  }

}
