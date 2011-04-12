package es.erni.demo.client.ioc;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.activity.CareerOverviewActivity;
import es.erni.demo.client.ui.CareerOverviewView;

public class CareerOverviewActivityProvider implements Provider<CareerOverviewActivity> {
  private final CareerOverviewView view;

  @Inject
  public CareerOverviewActivityProvider(CareerOverviewView view) {
    this.view = view;
  }

  public CareerOverviewActivity get() {
    return new CareerOverviewActivity(view);
  }
}
