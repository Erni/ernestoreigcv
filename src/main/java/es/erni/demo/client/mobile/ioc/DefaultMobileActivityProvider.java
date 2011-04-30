package es.erni.demo.client.mobile.ioc;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.mobile.activity.DefaultMobileActivity;
import es.erni.demo.client.ui.MainMenuView;

public class DefaultMobileActivityProvider implements Provider<DefaultMobileActivity> {
	
  private final MainMenuView view;
  private final PlaceController placeController;

  @Inject
  public DefaultMobileActivityProvider(MainMenuView view,PlaceController placeController) {
    this.view = view;
    this.placeController = placeController;
  }

  public DefaultMobileActivity get() {
    return new DefaultMobileActivity(view,placeController);
  }

}
