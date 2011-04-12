package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.activity.KeyStrengthsListActivity;
import es.erni.demo.client.ui.KeyStrengthsListView;

public class KeyStrengthsListActivityProvider implements Provider<KeyStrengthsListActivity> {
  private final KeyStrengthsListView view;

  @Inject
  public KeyStrengthsListActivityProvider(KeyStrengthsListView view) {
    this.view = view;
  }

  public KeyStrengthsListActivity get() {
    return new KeyStrengthsListActivity(view);
  }
}
