package es.erni.demo.client.mobile;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.inject.Inject;

import es.erni.demo.client.DemoApp;
import es.erni.demo.client.mobile.event.GoHomeEvent;
import es.erni.demo.client.mobile.event.GoHomeEventHandler;
import es.erni.demo.client.mobile.place.DefaultMobilePlace;
import es.erni.demo.client.mobile.ui.MainMenuViewMobileImpl;
import es.erni.demo.client.place.AdditionalInfoPlace;
import es.erni.demo.client.place.CareerOverviewPlace;
import es.erni.demo.client.place.EducationPlace;
import es.erni.demo.client.place.KeyStrengthsPlace;
import es.erni.demo.client.place.ProfExpPlace;
import es.erni.demo.client.place.PublicationsPlace;
import es.erni.demo.client.place.TechSkillsPlace;
import es.erni.demo.client.ui.DemoShell;

public class MobileDemoAppImpl implements DemoApp {
	
	private Place currentPlace;
	private final PlaceHistoryHandler placeHistoryHandler;
	private final PlaceController placeController;
	private final DemoShell shell;
	private final EventBus eventBus;
	
  /**
   * All parameters are injected by GIN
   *
   * @param placeController            the application's PlaceController
   * @param eventBus                   the application's EventBus
   * @param placeHistoryHandler        the application's PlaceHistoryHandler
   * @param shell                      this is the application's main panel
   * @param mainMenuView               this is the application's navigation top bar
   * @param mobileActivityManagerInitializer unused parameter, it's here just to force GIN's initialization of ActivityManagers
   */
  @Inject
  public MobileDemoAppImpl(PlaceController placeController,
			EventBus eventBus, PlaceHistoryHandler placeHistoryHandler,
			DemoShell shell, MainMenuViewMobileImpl mainMenuView, MobileActivityManagerInitializer mobileActivityManagerInitializer) {
  	this.placeHistoryHandler = placeHistoryHandler;
  	this.placeController = placeController;
  	this.shell = shell;
  	this.eventBus = eventBus;
//		mainMenuView.setPresenter(this);
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceLayoutHandler());
	}

//	public void gotoCareerOverviewPlace() {
//	  placeController.goTo(new CareerOverviewPlace());
//  }
//
//	public void gotoKeyStrengthsPlace() {
//		placeController.goTo(new KeyStrengthsPlace());
//  }
//
//	public void gotoTechnicalSkillsPlace() {
//		placeController.goTo(new TechSkillsPlace());
//  }
//
//	public void gotoProfessionalExperiencePlace() {
//		placeController.goTo(new ProfExpPlace());
//  }
//
//	public void gotoEducationPlace() {
//		placeController.goTo(new EducationPlace());
//  }
//
//	public void gotoAdditionalInfoPlace() {
//		placeController.goTo(new AdditionalInfoPlace());
//  }
//
//	public void gotoPublicationsPlace() {
//		placeController.goTo(new PublicationsPlace());
//  }

	public void run() {
    /*=========== EventBus handlers ================*/
    eventBus.addHandler(GoHomeEvent.TYPE, new GoHomeEventHandler() {
			public void onGoHome() {
				placeController.goTo(new DefaultMobilePlace());
      }
    });
    /*==============================================*/
		
		RootLayoutPanel.get().add(shell.getMainLayoutPanel());
		placeHistoryHandler.handleCurrentHistory();
  }
	
  private final class PlaceLayoutHandler implements PlaceChangeEvent.Handler {
    public void onPlaceChange(PlaceChangeEvent event) {
      Place newPlace = event.getNewPlace();
      if (newPlace != currentPlace) {
        if (newPlace instanceof KeyStrengthsPlace) {
          shell.setKeyStrengthsLayout();
        } else if (newPlace instanceof TechSkillsPlace) {
          shell.setTechSkillsLayout();
        } else if (newPlace instanceof ProfExpPlace) {
          shell.setProfExpLayout();
        } else if (newPlace instanceof EducationPlace) {
          shell.setEducationLayout();
        } else if (newPlace instanceof AdditionalInfoPlace) {
          shell.setAdditionalInfoLayout();
        } else if (newPlace instanceof PublicationsPlace) {
          shell.setPublicationsLayout();
        } else if (newPlace instanceof CareerOverviewPlace) {
        	shell.setCareerOverviewLayout();
        } else shell.setDefaultLayout();
        
        currentPlace = newPlace;
      }
    }
  }

}
