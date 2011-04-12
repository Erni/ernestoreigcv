package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.AdditionalInfoTitleRightActivity;
import es.erni.demo.client.ui.AdditionalInfoTitleRightView;

public class AdditionalInfoTitleRightActivityProvider implements Provider<AdditionalInfoTitleRightActivity> {
	
  private final AdditionalInfoTitleRightView view;

  @Inject
  public AdditionalInfoTitleRightActivityProvider(AdditionalInfoTitleRightView view) {
    this.view = view;
  }

  public AdditionalInfoTitleRightActivity get() {
    return new AdditionalInfoTitleRightActivity(view);
  }

}
