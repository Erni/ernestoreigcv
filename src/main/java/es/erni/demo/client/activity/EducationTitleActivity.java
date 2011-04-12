package es.erni.demo.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import es.erni.demo.client.ui.EducationTitleView;

public class EducationTitleActivity extends AbstractActivity implements EducationTitleView.Presenter {
	
  private final EducationTitleView view;

  public EducationTitleActivity(EducationTitleView view) {
    this.view = view;
  }

  public void start(AcceptsOneWidget panel, EventBus eventBus) {
    view.setPresenter(this);
    panel.setWidget(view.asWidget());
  }

}
