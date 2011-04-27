package es.erni.demo.client.mobile.ui;

import com.google.gwt.core.client.GWT;
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
		
		careeroverview.setHTML(AbstractImagePrototype.create(Styles.resources().debian()).getHTML() + " Career Overview");
		keystrengths.setHTML(AbstractImagePrototype.create(Styles.resources().facecool()).getHTML() + " Key Strengths");
		technicalskills.setHTML(AbstractImagePrototype.create(Styles.resources().techskills()).getHTML() + " Technical Skills");
		professionalexperience.setHTML(AbstractImagePrototype.create(Styles.resources().profexp()).getHTML() + " Professional Experience");
		education.setHTML(AbstractImagePrototype.create(Styles.resources().education()).getHTML() + " Education");
		additionalinfo.setHTML(AbstractImagePrototype.create(Styles.resources().userinfo()).getHTML() + " Additional Information");
		publications.setHTML(AbstractImagePrototype.create(Styles.resources().science()).getHTML() + " Publications");
	}

	public Widget asWidget() {
		return panel;
  }

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
  }

}
