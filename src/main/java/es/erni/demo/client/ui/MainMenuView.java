package es.erni.demo.client.ui;

import com.google.gwt.user.client.ui.IsWidget;

public interface MainMenuView extends IsWidget {

  void setPresenter(Presenter presenter);

  public interface Presenter {
    
  	void gotoCareerOverviewPlace();
  	void gotoKeyStrengthsPlace();
  	void gotoTechnicalSkillsPlace();
  	void gotoProfessionalExperiencePlace();
  	void gotoEducationPlace();
  	void gotoAdditionalInfoPlace();
  	void gotoPublicationsPlace();
  	
  }
}
