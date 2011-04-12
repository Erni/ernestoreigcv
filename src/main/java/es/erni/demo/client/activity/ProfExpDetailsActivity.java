package es.erni.demo.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import es.erni.demo.client.place.JobDetailPlace;
import es.erni.demo.client.ui.ProfExpDetailsView;

public class ProfExpDetailsActivity extends AbstractActivity implements ProfExpDetailsView.Presenter {

  private final ProfExpDetailsView view;
  private int selectedJob;

  public ProfExpDetailsActivity(ProfExpDetailsView view) {
    this.view = view;
  }

  public void start(AcceptsOneWidget panel, EventBus eventBus) {
    view.setPresenter(this);
    if(selectedJob != 0) {
    	view.setSelectedJob(selectedJob);
    } else {
//    	view.setMatchingOptionList(new ArrayList<MatchingOption>());
    }
    panel.setWidget(view.asWidget());
  }
  
  public void setPlace(JobDetailPlace place) {
  	selectedJob = (place == null) ? 0 : Integer.valueOf(place.getJobId());
  }
  
  public int getSelectedJob() {
  	return selectedJob;
  }

}
