package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.AdditionalInfoDetailsActivity;
import es.erni.demo.client.ui.AdditionalInfoDetailsView;

public class AdditionalInfoDetailsActivityProvider implements Provider<AdditionalInfoDetailsActivity> {
	
  private final AdditionalInfoDetailsView view;

  @Inject
  public AdditionalInfoDetailsActivityProvider(AdditionalInfoDetailsView view) {
    this.view = view;
  }

  public AdditionalInfoDetailsActivity get() {
    return new AdditionalInfoDetailsActivity(view);
  }

}
