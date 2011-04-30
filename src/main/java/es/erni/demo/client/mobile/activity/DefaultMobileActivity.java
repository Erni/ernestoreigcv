package es.erni.demo.client.mobile.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import es.erni.demo.client.place.AdditionalInfoPlace;
import es.erni.demo.client.place.CareerOverviewPlace;
import es.erni.demo.client.place.EducationPlace;
import es.erni.demo.client.place.KeyStrengthsPlace;
import es.erni.demo.client.place.ProfExpPlace;
import es.erni.demo.client.place.PublicationsPlace;
import es.erni.demo.client.place.TechSkillsPlace;
import es.erni.demo.client.ui.MainMenuView;

public class DefaultMobileActivity extends AbstractActivity implements MainMenuView.Presenter {
	
  private final MainMenuView view;
  PlaceController placeController;

  public DefaultMobileActivity(MainMenuView view, PlaceController placeController) {
    this.view = view;
    this.placeController = placeController;
  }

  public void start(AcceptsOneWidget panel, EventBus eventBus) {
    view.setPresenter(this);
    panel.setWidget(view.asWidget());
  }

	public void gotoCareerOverviewPlace() {
	  placeController.goTo(new CareerOverviewPlace());
  }

	public void gotoKeyStrengthsPlace() {
		placeController.goTo(new KeyStrengthsPlace());
  }

	public void gotoTechnicalSkillsPlace() {
		placeController.goTo(new TechSkillsPlace());
  }

	public void gotoProfessionalExperiencePlace() {
		placeController.goTo(new ProfExpPlace());
  }

	public void gotoEducationPlace() {
		placeController.goTo(new EducationPlace());
  }

	public void gotoAdditionalInfoPlace() {
		placeController.goTo(new AdditionalInfoPlace());
  }

	public void gotoPublicationsPlace() {
		placeController.goTo(new PublicationsPlace());
  }
	
}
