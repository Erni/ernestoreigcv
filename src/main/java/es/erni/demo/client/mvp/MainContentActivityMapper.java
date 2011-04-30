package es.erni.demo.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.AdditionalInfoDetailsActivity;
import es.erni.demo.client.activity.CareerOverviewActivity;
import es.erni.demo.client.activity.DefaultActivity;
import es.erni.demo.client.activity.EducationDetailsActivity;
import es.erni.demo.client.activity.ProfExpDetailsActivity;
import es.erni.demo.client.activity.PublicationsDetailsActivity;
import es.erni.demo.client.activity.TechSkillsDetailsActivity;
import es.erni.demo.client.mobile.activity.DefaultMobileActivity;
import es.erni.demo.client.mobile.place.DefaultMobilePlace;
import es.erni.demo.client.place.AdditionalInfoPlace;
import es.erni.demo.client.place.CareerOverviewPlace;
import es.erni.demo.client.place.DefaultPlace;
import es.erni.demo.client.place.EducationPlace;
import es.erni.demo.client.place.JobDetailPlace;
import es.erni.demo.client.place.KeyStrengthsPlace;
import es.erni.demo.client.place.PublicationsPlace;
import es.erni.demo.client.place.TechSkillsPlace;

public class MainContentActivityMapper implements ActivityMapper {
	
	private final Provider<CareerOverviewActivity> careerOverviewActivityProvider;
	private final KeyStrengthsActivityMapper keyStrengthsActivityMapper;
	private final Provider<TechSkillsDetailsActivity> techSkillsDetailsActivityProvider;
	private final Provider<ProfExpDetailsActivity> profExpDetailsActivityProvider;
	private final Provider<EducationDetailsActivity> educationDetailsActivityProvider;
	private final Provider<AdditionalInfoDetailsActivity> additionalInfoDetailsActivityProvider;
	private final Provider<PublicationsDetailsActivity> publicationsDetailsActivityProvider;
	private final Provider<DefaultMobileActivity> defaultMobileActivityProvider;
	private final Provider<DefaultActivity> defaultActivityProvider;
	
	@Inject
	public MainContentActivityMapper(Provider<CareerOverviewActivity> careerOverviewActivityProvider,
			KeyStrengthsActivityMapper keyStrengthsActivityMapper,
			Provider<TechSkillsDetailsActivity> techSkillsDetailsActivityProvider,
			Provider<ProfExpDetailsActivity> profExpDetailsActivityProvider,
			Provider<EducationDetailsActivity> educationDetailsActivityProvider,
			Provider<AdditionalInfoDetailsActivity> additionalInfoDetailsActivityProvider,
			Provider<PublicationsDetailsActivity> publicationsDetailsActivityProvider,
			Provider<DefaultMobileActivity> defaultMobileActivityProvider,
			Provider<DefaultActivity> defaultActivityProvider) {
		this.careerOverviewActivityProvider = careerOverviewActivityProvider;
		this.keyStrengthsActivityMapper = keyStrengthsActivityMapper;
		this.techSkillsDetailsActivityProvider = techSkillsDetailsActivityProvider;
		this.profExpDetailsActivityProvider = profExpDetailsActivityProvider;
		this.educationDetailsActivityProvider = educationDetailsActivityProvider;
		this.additionalInfoDetailsActivityProvider = additionalInfoDetailsActivityProvider;
		this.publicationsDetailsActivityProvider = publicationsDetailsActivityProvider;
		this.defaultMobileActivityProvider = defaultMobileActivityProvider;
		this.defaultActivityProvider = defaultActivityProvider;
	}

  public Activity getActivity(Place place) {
  	if(place instanceof CareerOverviewPlace) {
  		CareerOverviewActivity activity = careerOverviewActivityProvider.get();
  		return activity;
  	} else if(place instanceof KeyStrengthsPlace) {
  		return keyStrengthsActivityMapper.getActivity(place);
  	} else if(place instanceof TechSkillsPlace) {
  		TechSkillsDetailsActivity activity = techSkillsDetailsActivityProvider.get();
  		return activity;
  	} else if(place instanceof JobDetailPlace) {
  		ProfExpDetailsActivity activity = profExpDetailsActivityProvider.get();
  		activity.setPlace((JobDetailPlace)place);
  		return activity;
  	} else if(place instanceof EducationPlace) {
  		EducationDetailsActivity activity = educationDetailsActivityProvider.get();
  		return activity;
  	} else if(place instanceof AdditionalInfoPlace) {
  		AdditionalInfoDetailsActivity activity = additionalInfoDetailsActivityProvider.get();
  		return activity;
  	} else if(place instanceof PublicationsPlace) {
  		PublicationsDetailsActivity activity = publicationsDetailsActivityProvider.get();
  		return activity;
  	} else if(place instanceof DefaultMobilePlace) {
  		DefaultMobileActivity activity = defaultMobileActivityProvider.get();
  		return activity;
  	} else if(place instanceof DefaultPlace) {
  		DefaultActivity activity = defaultActivityProvider.get();
  		return activity;
  	}
  	
    return null;
  }
}
