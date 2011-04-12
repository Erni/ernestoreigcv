package es.erni.demo.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.AdditionalInfoTitleLeftActivity;
import es.erni.demo.client.activity.ProfExpTitleActivity;
import es.erni.demo.client.place.AdditionalInfoPlace;
import es.erni.demo.client.place.ProfExpPlace;

public class VerticalMasterActivityMapper implements ActivityMapper {
	private final Provider<ProfExpTitleActivity> profExpTitleActivityProvider;
	private final Provider<AdditionalInfoTitleLeftActivity> additionalInfoTitleLeftActivityProvider;

  @Inject
  public VerticalMasterActivityMapper(Provider<ProfExpTitleActivity> profExpTitleActivityProvider,
  		Provider<AdditionalInfoTitleLeftActivity> additionalInfoTitleLeftActivityProvider) {
    this.profExpTitleActivityProvider = profExpTitleActivityProvider;
    this.additionalInfoTitleLeftActivityProvider = additionalInfoTitleLeftActivityProvider;
  }

  public Activity getActivity(Place place) {
    if (place instanceof ProfExpPlace) {
      return profExpTitleActivityProvider.get();
    } else if(place instanceof AdditionalInfoPlace) {
    	AdditionalInfoTitleLeftActivity activity = additionalInfoTitleLeftActivityProvider.get();
    	return activity;
    }

    return null;
  }
  
}
