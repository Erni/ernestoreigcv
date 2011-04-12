package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.TechSkillsDetailsActivity;
import es.erni.demo.client.ui.TechSkillsDetailsView;

public class TechSkillsDetailsActivityProvider implements Provider<TechSkillsDetailsActivity> {
  private final TechSkillsDetailsView view;

  @Inject
  public TechSkillsDetailsActivityProvider(TechSkillsDetailsView view) {
    this.view = view;
  }

  public TechSkillsDetailsActivity get() {
    return new TechSkillsDetailsActivity(view);
  }
}
