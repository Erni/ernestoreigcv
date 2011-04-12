package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.activity.KeyStrengthsActivity;
import es.erni.demo.client.ui.KeyStrengthsView;

public class KeyStrengthsActivityProvider implements Provider<KeyStrengthsActivity> {
  private final KeyStrengthsView view;

  @Inject
  public KeyStrengthsActivityProvider(KeyStrengthsView view) {
    this.view = view;
  }

  public KeyStrengthsActivity get() {
    return new KeyStrengthsActivity(view);
  }
}
