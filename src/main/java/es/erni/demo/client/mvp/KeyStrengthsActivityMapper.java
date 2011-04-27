package es.erni.demo.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.KeyStrengthsListActivity;
import es.erni.demo.client.place.KeyStrengthsPlace;

public class KeyStrengthsActivityMapper implements ActivityMapper {
  private final Provider<KeyStrengthsListActivity> keyStrengthsListActivityProvider;

  @Inject
  public KeyStrengthsActivityMapper(
      Provider<KeyStrengthsListActivity> keyStrengthsListActivityProvider) {
    this.keyStrengthsListActivityProvider = keyStrengthsListActivityProvider;
  }

  public Activity getActivity(Place place) {
    if (place instanceof KeyStrengthsPlace) {
    	KeyStrengthsListActivity activity = keyStrengthsListActivityProvider.get();
      return activity;
    }

    return null;
  }
}
