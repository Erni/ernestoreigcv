package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.TechSkillsTitleActivity;
import es.erni.demo.client.ui.TechSkillsTitleView;

public class TechSkillsTitleActivityProvider implements Provider<TechSkillsTitleActivity> {
  private final TechSkillsTitleView view;

  @Inject
  public TechSkillsTitleActivityProvider(TechSkillsTitleView view) {
    this.view = view;
  }

  public TechSkillsTitleActivity get() {
    return new TechSkillsTitleActivity(view);
  }
}
