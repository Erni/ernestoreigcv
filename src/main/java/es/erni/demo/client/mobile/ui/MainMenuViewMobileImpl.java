package es.erni.demo.client.mobile.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.style.Styles;
import es.erni.demo.client.ui.MainMenuView;

public class MainMenuViewMobileImpl implements MainMenuView {

	private static MainMenuViewMobileImplUiBinder uiBinder = GWT.create(MainMenuViewMobileImplUiBinder.class);

	interface MainMenuViewMobileImplUiBinder extends UiBinder<VerticalPanel, MainMenuViewMobileImpl> {}
	
	Presenter presenter;
	
	VerticalPanel panel;
	
	@UiField Button careeroverview;
	@UiField Button keystrengths;
	@UiField Button technicalskills;
	@UiField Button professionalexperience;
	@UiField Button education;
	@UiField Button additionalinfo;
	@UiField Button publications;
	
	public MainMenuViewMobileImpl() {
		panel = uiBinder.createAndBindUi(this);
		
		careeroverview.setHTML(AbstractImagePrototype.create(Styles.resources().debian48()).getHTML() + " Career Overview");
		keystrengths.setHTML(AbstractImagePrototype.create(Styles.resources().facecool48()).getHTML() + " Key Strengths");
		technicalskills.setHTML(AbstractImagePrototype.create(Styles.resources().techskills48()).getHTML() + " Technical Skills");
		professionalexperience.setHTML(AbstractImagePrototype.create(Styles.resources().profexp48()).getHTML() + " Professional Experience");
		education.setHTML(AbstractImagePrototype.create(Styles.resources().education48()).getHTML() + " Education");
		additionalinfo.setHTML(AbstractImagePrototype.create(Styles.resources().userinfo48()).getHTML() + " Additional Information");
		publications.setHTML(AbstractImagePrototype.create(Styles.resources().science48()).getHTML() + " Publications");
		
		careeroverview.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				presenter.gotoCareerOverviewPlace();
			}
		});
		
		keystrengths.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				presenter.gotoKeyStrengthsPlace();
			}
		});
		
		technicalskills.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				presenter.gotoTechnicalSkillsPlace();
			}
		});
		
		professionalexperience.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				presenter.gotoProfessionalExperiencePlace();
			}
		});
		
		education.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				presenter.gotoEducationPlace();
			}
		});
		
		additionalinfo.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				presenter.gotoAdditionalInfoPlace();
			}
		});
		
		publications.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				presenter.gotoPublicationsPlace();
			}
		});
		
	}

	public Widget asWidget() {
		return panel;
  }

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
  }

}
