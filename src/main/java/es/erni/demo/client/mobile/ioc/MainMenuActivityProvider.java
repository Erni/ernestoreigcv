package es.erni.demo.client.mobile.ioc;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.mobile.activity.MainMenuActivity;
import es.erni.demo.client.ui.MainMenuView;

public class MainMenuActivityProvider implements Provider<MainMenuActivity> {
	
  private final MainMenuView view;
  private final PlaceController placeController;

  @Inject
  public MainMenuActivityProvider(MainMenuView view,PlaceController placeController) {
    this.view = view;
    this.placeController = placeController;
  }

  public MainMenuActivity get() {
    return new MainMenuActivity(view,placeController);
  }

}
