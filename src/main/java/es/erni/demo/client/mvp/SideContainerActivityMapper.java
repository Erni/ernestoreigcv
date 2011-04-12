package es.erni.demo.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.AdditionalInfoTitleRightActivity;
import es.erni.demo.client.activity.TechSkillsTitleActivity;
import es.erni.demo.client.place.AdditionalInfoPlace;
import es.erni.demo.client.place.TechSkillsPlace;

public class SideContainerActivityMapper implements ActivityMapper {
	private final Provider<TechSkillsTitleActivity> techSkillsTitleActivityProvider;
	private final Provider<AdditionalInfoTitleRightActivity> additionalInfoTitleRightActivityProvider;

  @Inject
  public SideContainerActivityMapper(Provider<TechSkillsTitleActivity> techSkillsTitleActivityProvider,
  		Provider<AdditionalInfoTitleRightActivity> additionalInfoTitleRightActivityProvider) {
    this.techSkillsTitleActivityProvider = techSkillsTitleActivityProvider;
    this.additionalInfoTitleRightActivityProvider = additionalInfoTitleRightActivityProvider;
  }

  public Activity getActivity(Place place) {
    if (place instanceof TechSkillsPlace) {
      return techSkillsTitleActivityProvider.get();
    } else if(place instanceof AdditionalInfoPlace) {
    	AdditionalInfoTitleRightActivity activity = additionalInfoTitleRightActivityProvider.get();
    	return activity;
    }

    return null;
  }
  
}
