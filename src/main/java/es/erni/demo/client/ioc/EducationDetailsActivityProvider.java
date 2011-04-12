package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.activity.EducationDetailsActivity;
import es.erni.demo.client.ui.EducationDetailsView;

public class EducationDetailsActivityProvider implements Provider<EducationDetailsActivity> {
	
  private final EducationDetailsView view;

  @Inject
  public EducationDetailsActivityProvider(EducationDetailsView view) {
    this.view = view;
  }

  public EducationDetailsActivity get() {
    return new EducationDetailsActivity(view);
  }

}
