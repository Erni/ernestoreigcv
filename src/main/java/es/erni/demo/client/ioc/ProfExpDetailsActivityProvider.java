package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;

import es.erni.demo.client.activity.ProfExpDetailsActivity;
import es.erni.demo.client.ui.ProfExpDetailsView;

public class ProfExpDetailsActivityProvider implements Provider<ProfExpDetailsActivity> {
  private final ProfExpDetailsView view;

  @Inject
  public ProfExpDetailsActivityProvider(ProfExpDetailsView view) {
    this.view = view;
  }

  public ProfExpDetailsActivity get() {
    return new ProfExpDetailsActivity(view);
  }
}
