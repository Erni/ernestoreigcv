package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.ProfExpTitleActivity;
import es.erni.demo.client.ui.ProfExpTitleView;

public class ProfExpTitleActivityProvider implements Provider<ProfExpTitleActivity> {
  private final ProfExpTitleView view;

  @Inject
  public ProfExpTitleActivityProvider(ProfExpTitleView view) {
    this.view = view;
  }

  public ProfExpTitleActivity get() {
    return new ProfExpTitleActivity(view);
  }
}
