package es.erni.demo.test;

import static org.easymock.EasyMock.*;

import org.junit.Test;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Provider;

import junit.framework.TestCase;
import es.erni.demo.client.activity.AdditionalInfoDetailsActivity;
import es.erni.demo.client.activity.EducationDetailsActivity;
import es.erni.demo.client.activity.KeyStrengthsListActivity;
import es.erni.demo.client.activity.ProfExpDetailsActivity;
import es.erni.demo.client.activity.ProfExpListActivity;
import es.erni.demo.client.activity.PublicationsDetailsActivity;
import es.erni.demo.client.activity.TechSkillsDetailsActivity;
import es.erni.demo.client.ioc.AdditionalInfoDetailsActivityProvider;
import es.erni.demo.client.ioc.CareerOverviewActivityProvider;
import es.erni.demo.client.ioc.EducationDetailsActivityProvider;
import es.erni.demo.client.ioc.KeyStrengthsListActivityProvider;
import es.erni.demo.client.ioc.ProfExpDetailsActivityProvider;
import es.erni.demo.client.ioc.PublicationsDetailsActivityProvider;
import es.erni.demo.client.ioc.TechSkillsDetailsActivityProvider;
import es.erni.demo.client.mobile.activity.MainMenuActivity;
import es.erni.demo.client.mobile.ioc.MainMenuActivityProvider;
import es.erni.demo.client.mvp.KeyStrengthsActivityMapper;
import es.erni.demo.client.mvp.MainContentActivityMapper;
import es.erni.demo.client.place.JobDetailPlace;
import es.erni.demo.client.ui.AdditionalInfoDetailsView;
import es.erni.demo.client.ui.CareerOverviewView;
import es.erni.demo.client.ui.EducationDetailsView;
import es.erni.demo.client.ui.KeyStrengthsListView;
import es.erni.demo.client.ui.MainMenuView;
import es.erni.demo.client.ui.ProfExpDetailsView;
import es.erni.demo.client.ui.ProfExpListView;
import es.erni.demo.client.ui.PublicationsDetailsView;
import es.erni.demo.client.ui.TechSkillsDetailsView;

public class SomeActivityTest extends TestCase {
	
	@Test
	public void testProfExp() {
		final ProfExpListView listView = createMock(ProfExpListView.class); 
		final ProfExpDetailsView detailsView = createMock(ProfExpDetailsView.class);
		final CareerOverviewView careerOverviewView = createMock(CareerOverviewView.class);
		final KeyStrengthsListView keyStrengthsListView = createMock(KeyStrengthsListView.class);
		final TechSkillsDetailsView techSkillsDetailsView = createMock(TechSkillsDetailsView.class);
		final ProfExpDetailsView profExpDetailsView = createMock(ProfExpDetailsView.class);
		final EducationDetailsView educationDetailsView = createMock(EducationDetailsView.class);
		final AdditionalInfoDetailsView additionalInfoDetailsView = createMock(AdditionalInfoDetailsView.class);
		final PublicationsDetailsView publicationsDetailsView = createMock(PublicationsDetailsView.class);
		final MainMenuView mainMenuView = createMock(MainMenuView.class);
		
		final EventBus eventBus = new SimpleEventBus();
		
		final PlaceController.Delegate delegate = createMock(PlaceController.Delegate.class);
		
		final PlaceController placeController = new PlaceController(eventBus,delegate);
		
		final Provider<KeyStrengthsListActivity> keyStrengthsListActivityProvider = new KeyStrengthsListActivityProvider(keyStrengthsListView);
		final Provider<TechSkillsDetailsActivity> techSkillsDetailsActivityProvider = new TechSkillsDetailsActivityProvider(techSkillsDetailsView);
		final Provider<PublicationsDetailsActivity> publicationsDetailsActivityProvider = new PublicationsDetailsActivityProvider(publicationsDetailsView);
		final Provider<ProfExpDetailsActivity> profExpDetailsActivityProvider = new ProfExpDetailsActivityProvider(profExpDetailsView);
		final Provider<EducationDetailsActivity> educationDetailsActivityProvider = new EducationDetailsActivityProvider(educationDetailsView);
		final Provider<AdditionalInfoDetailsActivity> additionalInfoDetailsActivityProvider = new AdditionalInfoDetailsActivityProvider(additionalInfoDetailsView);
		final Provider<MainMenuActivity> mainMenuActivityProvider = new MainMenuActivityProvider(mainMenuView,placeController);
		
		final MainContentActivityMapper activityMapper = new MainContentActivityMapper(new CareerOverviewActivityProvider(careerOverviewView),
				new KeyStrengthsActivityMapper(keyStrengthsListActivityProvider),
				techSkillsDetailsActivityProvider, profExpDetailsActivityProvider,
				educationDetailsActivityProvider, additionalInfoDetailsActivityProvider,
				publicationsDetailsActivityProvider, mainMenuActivityProvider);
		
		assertTrue("The activity must be instance of ProfExpDetailsActivity",activityMapper.getActivity(new JobDetailPlace("3")) instanceof ProfExpDetailsActivity);
		
		assertEquals("The job selected must be the same in the Place and eventually in the ProfExpDetailsActivity activity",((ProfExpDetailsActivity)activityMapper.getActivity(new JobDetailPlace("3"))).getSelectedJob(),3);
		
//		final ProfExpListActivity activity = new ProfExpListActivity(listView, placeController, eventBus);
//		activity.jobSelected(1);
//		
//		final ActivityManager mainContentActivityManager = new ActivityManager(activityMapper, eventBus);
//		
//		final ProfExpDetailsActivity detailsActivity = new ProfExpDetailsActivity(detailsView);
//		
//		assertEquals("The jobs must be equal",3, detailsActivity.getSelectedJob());
	}

}
