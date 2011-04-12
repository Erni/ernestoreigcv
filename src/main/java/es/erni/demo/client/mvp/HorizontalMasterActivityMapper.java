package es.erni.demo.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.EducationTitleActivity;
import es.erni.demo.client.activity.KeyStrengthsActivity;
import es.erni.demo.client.activity.ProfExpListActivity;
import es.erni.demo.client.activity.PublicationsTitleActivity;
import es.erni.demo.client.place.EducationPlace;
import es.erni.demo.client.place.KeyStrengthsPlace;
import es.erni.demo.client.place.ProfExpPlace;
import es.erni.demo.client.place.PublicationsPlace;

public class HorizontalMasterActivityMapper implements ActivityMapper {
	private final Provider<KeyStrengthsActivity> keyStrengthstActivityProvider;
	private final Provider<ProfExpListActivity> profExpListActivityProvider;
	private final Provider<EducationTitleActivity> educationTitleActivityProvider;
	private final Provider<PublicationsTitleActivity> publicationsTitleActivityProvider;

  @Inject
  public HorizontalMasterActivityMapper(Provider<KeyStrengthsActivity> keyStrengthstActivityProvider,
  		Provider<ProfExpListActivity> profExpListActivityProvider,
  		Provider<EducationTitleActivity> educationTitleActivityProvider,
  		Provider<PublicationsTitleActivity> publicationsTitleActivityProvider) {
  	this.keyStrengthstActivityProvider = keyStrengthstActivityProvider;
  	this.profExpListActivityProvider = profExpListActivityProvider;
  	this.educationTitleActivityProvider = educationTitleActivityProvider;
  	this.publicationsTitleActivityProvider = publicationsTitleActivityProvider;
  }

  public Activity getActivity(Place place) {
    if (place instanceof KeyStrengthsPlace) {
      return keyStrengthstActivityProvider.get();
    } else if(place instanceof ProfExpPlace) {
    	return profExpListActivityProvider.get();
    } else if(place instanceof EducationPlace) {
    	return educationTitleActivityProvider.get();
    } else if(place instanceof PublicationsPlace) {
    	return publicationsTitleActivityProvider.get();
    }

    return null;
  }
}
