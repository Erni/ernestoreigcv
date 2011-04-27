package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;

import es.erni.demo.client.style.Styles;
import es.erni.demo.client.ui.MainMenuView;
import es.erni.demo.client.ui.MainMenuView.Presenter;

public class MainMenuViewImpl extends Composite implements MainMenuView {

	private static MainMenuViewImplUiBinder uiBinder = GWT.create(MainMenuViewImplUiBinder.class);

	interface MainMenuViewImplUiBinder extends UiBinder<FlowPanel, MainMenuViewImpl> {}
	
	private Presenter presenter;
	
	@UiField MenuBar menuBar;
	@UiField MenuItem careeroverview;
	@UiField MenuItem keystrengths;
	@UiField MenuItem technicalskills;
	@UiField MenuItem professionalexperience;
	@UiField MenuItem education;
	@UiField MenuItem additionalinfo;
	@UiField MenuItem publications;

	@Inject
	public MainMenuViewImpl() {
		FlowPanel panel = uiBinder.createAndBindUi(this);
		initWidget(panel);
		
		// insert some separators
		menuBar.insertSeparator(1);
		menuBar.insertSeparator(3);
		menuBar.insertSeparator(5);
		menuBar.insertSeparator(7);
		menuBar.insertSeparator(9);
		menuBar.insertSeparator(11);
		
		menuBar.setAutoOpen(true);
		menuBar.setAnimationEnabled(true);
		
		// attach commands to a menu item
		careeroverview.setCommand(careeroverviewCmd);
		keystrengths.setCommand(keystrengthsCmd);
		technicalskills.setCommand(technicalskillsCmd);
		professionalexperience.setCommand(professionalexperienceCmd);
		education.setCommand(educatimdonCmd);
		additionalinfo.setCommand(additionalinfoCmd);
		publications.setCommand(publicationsCmd);
		
		/** @todo this should be done with i18n and icons */
		careeroverview.setHTML(AbstractImagePrototype.create(Styles.resources().debian()).getHTML() + " Career Overview");
		keystrengths.setHTML(AbstractImagePrototype.create(Styles.resources().facecool()).getHTML() + " Key Strengths");
		technicalskills.setHTML(AbstractImagePrototype.create(Styles.resources().techskills()).getHTML() + " Technical Skills");
		professionalexperience.setHTML(AbstractImagePrototype.create(Styles.resources().profexp()).getHTML() + " Professional Experience");
		education.setHTML(AbstractImagePrototype.create(Styles.resources().education()).getHTML() + " Education");
		additionalinfo.setHTML(AbstractImagePrototype.create(Styles.resources().userinfo()).getHTML() + " Additional Information");
		publications.setHTML(AbstractImagePrototype.create(Styles.resources().science()).getHTML() + " Publications");
	}

	// Commands executed when the user clicks on MenuItem's
	Command careeroverviewCmd = new Command() {
		public void execute() {
			presenter.gotoCareerOverviewPlace();
		}
	};
	
	Command keystrengthsCmd = new Command() {
		public void execute() {
			presenter.gotoKeyStrengthsPlace();
		}
	};
	
	Command technicalskillsCmd = new Command() {
		public void execute() {
			presenter.gotoTechnicalSkillsPlace();
		}
	};
	
	Command professionalexperienceCmd = new Command() {
		public void execute() {
			presenter.gotoProfessionalExperiencePlace();
		}
	};
	
	Command educatimdonCmd = new Command() {
		public void execute() {
			presenter.gotoEducationPlace();
		}
	};
	
	Command additionalinfoCmd = new Command() {
		public void execute() {
			presenter.gotoAdditionalInfoPlace();
		}
	};
	
	Command publicationsCmd = new Command() {
		public void execute() {
			presenter.gotoPublicationsPlace();
		}
	};

	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
