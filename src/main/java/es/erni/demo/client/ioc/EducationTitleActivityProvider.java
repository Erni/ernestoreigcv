package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.EducationTitleActivity;
import es.erni.demo.client.ui.EducationTitleView;

public class EducationTitleActivityProvider implements Provider<EducationTitleActivity> {
  private final EducationTitleView view;

  @Inject
  public EducationTitleActivityProvider(EducationTitleView view) {
    this.view = view;
  }

  public EducationTitleActivity get() {
    return new EducationTitleActivity(view);
  }

}
