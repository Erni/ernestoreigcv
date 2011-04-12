package es.erni.demo.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import es.erni.demo.client.ui.EducationDetailsView;

public class EducationDetailsActivity extends AbstractActivity implements EducationDetailsView.Presenter {
	
  private final EducationDetailsView view;

  public EducationDetailsActivity(EducationDetailsView view) {
    this.view = view;
  }

  public void start(AcceptsOneWidget panel, EventBus eventBus) {
    view.setPresenter(this);
    panel.setWidget(view.asWidget());
  }

}
