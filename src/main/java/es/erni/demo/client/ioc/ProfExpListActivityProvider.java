package es.erni.demo.client.ioc;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import es.erni.demo.client.activity.ProfExpListActivity;
import es.erni.demo.client.ui.ProfExpListView;

public class ProfExpListActivityProvider implements Provider<ProfExpListActivity> {
	
  private final EventBus eventBus;
  private final PlaceController placeController;
  private final ProfExpListView view;
  
  @Inject
  public ProfExpListActivityProvider(ProfExpListView view, PlaceController placeController, EventBus eventBus) {
    this.eventBus = eventBus;
    this.placeController = placeController;
    this.view = view;
  }

  public ProfExpListActivity get() {
    return new ProfExpListActivity(view, placeController, eventBus);
  }

}
