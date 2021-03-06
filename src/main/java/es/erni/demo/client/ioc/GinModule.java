package es.erni.demo.client.ioc;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import es.erni.demo.client.DemoApp;
import es.erni.demo.client.DemoAppImpl;
import es.erni.demo.client.activity.AdditionalInfoDetailsActivity;
import es.erni.demo.client.activity.AdditionalInfoTitleLeftActivity;
import es.erni.demo.client.activity.AdditionalInfoTitleRightActivity;
import es.erni.demo.client.activity.CareerOverviewActivity;
import es.erni.demo.client.activity.DefaultActivity;
import es.erni.demo.client.activity.EducationDetailsActivity;
import es.erni.demo.client.activity.EducationTitleActivity;
import es.erni.demo.client.activity.KeyStrengthsActivity;
import es.erni.demo.client.activity.KeyStrengthsListActivity;
import es.erni.demo.client.activity.ProfExpDetailsActivity;
import es.erni.demo.client.activity.ProfExpListActivity;
import es.erni.demo.client.activity.ProfExpTitleActivity;
import es.erni.demo.client.activity.PublicationsDetailsActivity;
import es.erni.demo.client.activity.PublicationsTitleActivity;
import es.erni.demo.client.activity.TechSkillsDetailsActivity;
import es.erni.demo.client.activity.TechSkillsTitleActivity;
import es.erni.demo.client.mobile.activity.DefaultMobileActivity;
import es.erni.demo.client.mobile.ioc.DefaultMobileActivityProvider;
import es.erni.demo.client.mobile.ui.MainMenuViewMobileImpl;
import es.erni.demo.client.mvp.AppPlaceHistoryMapper;
import es.erni.demo.client.mvp.HorizontalMasterActivityMapper;
import es.erni.demo.client.mvp.MainContentActivityMapper;
import es.erni.demo.client.mvp.SideContainerActivityMapper;
import es.erni.demo.client.mvp.VerticalMasterActivityMapper;
import es.erni.demo.client.place.DefaultPlace;
import es.erni.demo.client.ui.AdditionalInfoDetailsView;
import es.erni.demo.client.ui.AdditionalInfoTitleLeftView;
import es.erni.demo.client.ui.AdditionalInfoTitleRightView;
import es.erni.demo.client.ui.CareerOverviewView;
import es.erni.demo.client.ui.DefaultView;
import es.erni.demo.client.ui.DemoShell;
import es.erni.demo.client.ui.EducationDetailsView;
import es.erni.demo.client.ui.EducationTitleView;
import es.erni.demo.client.ui.KeyStrengthsListView;
import es.erni.demo.client.ui.KeyStrengthsView;
import es.erni.demo.client.ui.MainMenuView;
import es.erni.demo.client.ui.ProfExpDetailsView;
import es.erni.demo.client.ui.ProfExpListView;
import es.erni.demo.client.ui.ProfExpTitleView;
import es.erni.demo.client.ui.PublicationsDetailsView;
import es.erni.demo.client.ui.PublicationsTitleView;
import es.erni.demo.client.ui.TechSkillsDetailsView;
import es.erni.demo.client.ui.TechSkillsTitleView;
import es.erni.demo.client.ui.desktop.AdditionalInfoDetailsViewImpl;
import es.erni.demo.client.ui.desktop.AdditionalInfoTitleLeftViewImpl;
import es.erni.demo.client.ui.desktop.AdditionalInfoTitleRightViewImpl;
import es.erni.demo.client.ui.desktop.CareerOverviewViewImpl;
import es.erni.demo.client.ui.desktop.DefaultViewImpl;
import es.erni.demo.client.ui.desktop.DemoShellImpl;
import es.erni.demo.client.ui.desktop.EducationDetailsViewImpl;
import es.erni.demo.client.ui.desktop.EducationTitleViewImpl;
import es.erni.demo.client.ui.desktop.KeyStrengthsListViewImpl;
import es.erni.demo.client.ui.desktop.KeyStrengthsViewImpl;
import es.erni.demo.client.ui.desktop.MainMenuViewImpl;
import es.erni.demo.client.ui.desktop.ProfExpDetailsViewImpl;
import es.erni.demo.client.ui.desktop.ProfExpListViewImpl;
import es.erni.demo.client.ui.desktop.ProfExpTitleViewImpl;
import es.erni.demo.client.ui.desktop.PublicationsDetailsViewImpl;
import es.erni.demo.client.ui.desktop.PublicationsTitleViewImpl;
import es.erni.demo.client.ui.desktop.TechSkillsDetailsViewImpl;
import es.erni.demo.client.ui.desktop.TechSkillsTitleViewImpl;

public class GinModule extends AbstractGinModule {

  @Override
  protected void configure() {
    // Views
  	bind(DemoShell.class).to(DemoShellImpl.class).in(Singleton.class);
  	bind(CareerOverviewView.class).to(CareerOverviewViewImpl.class).in(Singleton.class);
  	bind(KeyStrengthsView.class).to(KeyStrengthsViewImpl.class).in(Singleton.class);
  	bind(KeyStrengthsListView.class).to(KeyStrengthsListViewImpl.class).in(Singleton.class);
  	bind(TechSkillsTitleView.class).to(TechSkillsTitleViewImpl.class).in(Singleton.class);
  	bind(TechSkillsDetailsView.class).to(TechSkillsDetailsViewImpl.class).in(Singleton.class);
  	bind(ProfExpTitleView.class).to(ProfExpTitleViewImpl.class).in(Singleton.class);
  	bind(ProfExpDetailsView.class).to(ProfExpDetailsViewImpl.class).in(Singleton.class);
  	bind(ProfExpListView.class).to(ProfExpListViewImpl.class).in(Singleton.class);
  	bind(EducationTitleView.class).to(EducationTitleViewImpl.class).in(Singleton.class);
  	bind(EducationDetailsView.class).to(EducationDetailsViewImpl.class).in(Singleton.class);
  	bind(AdditionalInfoTitleLeftView.class).to(AdditionalInfoTitleLeftViewImpl.class).in(Singleton.class);
  	bind(AdditionalInfoTitleRightView.class).to(AdditionalInfoTitleRightViewImpl.class).in(Singleton.class);
  	bind(AdditionalInfoDetailsView.class).to(AdditionalInfoDetailsViewImpl.class).in(Singleton.class);
  	bind(PublicationsTitleView.class).to(PublicationsTitleViewImpl.class).in(Singleton.class);
  	bind(PublicationsDetailsView.class).to(PublicationsDetailsViewImpl.class).in(Singleton.class);
  	bind(DefaultView.class).to(DefaultViewImpl.class).in(Singleton.class);
  	
//  this is a mobile View, but since the Activity it appears in a mapper, this module has to be aware of
  	bind(MainMenuView.class).to(MainMenuViewMobileImpl.class).in(Singleton.class);

    bind(MainMenuViewImpl.class).in(Singleton.class);

    // Activities
    bind(CareerOverviewActivity.class).toProvider(CareerOverviewActivityProvider.class);
    bind(KeyStrengthsActivity.class).toProvider(KeyStrengthsActivityProvider.class);
    bind(KeyStrengthsListActivity.class).toProvider(KeyStrengthsListActivityProvider.class);
    bind(TechSkillsTitleActivity.class).toProvider(TechSkillsTitleActivityProvider.class);
    bind(TechSkillsDetailsActivity.class).toProvider(TechSkillsDetailsActivityProvider.class);
    bind(ProfExpTitleActivity.class).toProvider(ProfExpTitleActivityProvider.class);
    bind(ProfExpDetailsActivity.class).toProvider(ProfExpDetailsActivityProvider.class);
    bind(ProfExpListActivity.class).toProvider(ProfExpListActivityProvider.class);
    bind(EducationTitleActivity.class).toProvider(EducationTitleActivityProvider.class);
    bind(EducationDetailsActivity.class).toProvider(EducationDetailsActivityProvider.class);
    bind(AdditionalInfoTitleLeftActivity.class).toProvider(AdditionalInfoTitleLeftActivityProvider.class);
    bind(AdditionalInfoTitleRightActivity.class).toProvider(AdditionalInfoTitleRightActivityProvider.class);
    bind(AdditionalInfoDetailsActivity.class).toProvider(AdditionalInfoDetailsActivityProvider.class);
    bind(PublicationsTitleActivity.class).toProvider(PublicationsTitleActivityProvider.class);
    bind(PublicationsDetailsActivity.class).toProvider(PublicationsDetailsActivityProvider.class);
    bind(DefaultActivity.class).toProvider(DefaultActivityProvider.class);
    
//    this is a mobile Activity, but since it appears in a mapper, this module has to be aware of
    bind(DefaultMobileActivity.class).toProvider(DefaultMobileActivityProvider.class);

    // Places
    bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(Singleton.class);

    // Application EventBus
    bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

    // Application Controller
    bind(DemoApp.class).to(DemoAppImpl.class).in(Singleton.class);
  }

  @Provides
  @Singleton
  @Named("HorizontalMasterRegion")
  public ActivityManager getHorizontalMasterRegionActivityMapper(
      HorizontalMasterActivityMapper activityMapper, EventBus eventBus) {
    return new ActivityManager(activityMapper, eventBus);
  }

  @Provides
  @Singleton
  @Named("VerticalMasterRegion")
  public ActivityManager getVerticalMasterRegionActivityMapper(
      VerticalMasterActivityMapper activityMapper, EventBus eventBus) {
    return new ActivityManager(activityMapper, eventBus);
  }

  @Provides
  @Singleton
  @Named("SideContainerRegion")
  public ActivityManager getSideRegionActivityMapper(
      SideContainerActivityMapper activityMapper, EventBus eventBus) {
    return new ActivityManager(activityMapper, eventBus);
  }

  @Provides
  @Singleton
  @Named("MainContentRegion")
  public ActivityManager getMainContentRegionActivityMapper(
      MainContentActivityMapper activityMapper, EventBus eventBus) {
    return new ActivityManager(activityMapper, eventBus);
  }

  @Provides
  @Singleton
  public PlaceController getPlaceController(EventBus eventBus) {
    return new PlaceController(eventBus);
  }

  @Provides
  @Singleton
  public PlaceHistoryHandler getHistoryHandler(PlaceController placeController, PlaceHistoryMapper historyMapper, EventBus eventBus) {
    PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
//    historyHandler.register(placeController, eventBus, new CareerOverviewPlace());
    historyHandler.register(placeController, eventBus, new DefaultPlace());
    return historyHandler;
  }
}
