package es.erni.demo.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import es.erni.demo.client.domain.Job.JOBLIST;
import es.erni.demo.client.place.JobDetailPlace;
import es.erni.demo.client.ui.ProfExpListView;

public class ProfExpListActivity extends AbstractActivity implements ProfExpListView.Presenter {
	
  private final ProfExpListView view;
  private final PlaceController placeController;
  
  public ProfExpListActivity(ProfExpListView view, PlaceController placeController, EventBus eventBus) {
  	this.view = view;
  	this.placeController = placeController;
//  	eventBus.addHandler(PlaceChangeEvent.TYPE, new MailDetailPlaceChangeHandler());
  }

	public void start(AcceptsOneWidget panel, EventBus eventBus) {
    view.setPresenter(this);
    view.setJobList(JOBLIST.getJobList());
    panel.setWidget(view.asWidget());
  }

	public void jobSelected(int id) {
		placeController.goTo(new JobDetailPlace(Integer.toString(id)));
  }

}
