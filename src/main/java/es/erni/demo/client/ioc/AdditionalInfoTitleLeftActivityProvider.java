package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.AdditionalInfoTitleLeftActivity;
import es.erni.demo.client.ui.AdditionalInfoTitleLeftView;

public class AdditionalInfoTitleLeftActivityProvider implements Provider<AdditionalInfoTitleLeftActivity> {
  private final AdditionalInfoTitleLeftView view;

  @Inject
  public AdditionalInfoTitleLeftActivityProvider(AdditionalInfoTitleLeftView view) {
    this.view = view;
  }

  public AdditionalInfoTitleLeftActivity get() {
    return new AdditionalInfoTitleLeftActivity(view);
  }

}
