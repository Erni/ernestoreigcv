package es.erni.demo.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import es.erni.demo.client.ui.DemoShell;

/**
 * This class is responsible for ActivityManager instantiations through GIN,
 * it also associate every ActivityManager with the corresponding display region
 */
public class ActivityManagerInitializer {

  @Inject
  public ActivityManagerInitializer(DemoShell shell,
                                    @Named("HorizontalMasterRegion") ActivityManager horizontalMasterActivityManager,
                                    @Named("VerticalMasterRegion") ActivityManager verticalMasterActivityManager,
                                    @Named("SideContainerRegion") ActivityManager sideContainerActivityManager,
                                    @Named("MainContentRegion") ActivityManager mainContentActivityManager) {
    horizontalMasterActivityManager.setDisplay(shell.getHorizontalMasterContainer());
    verticalMasterActivityManager.setDisplay(shell.getVerticalMasterContainer());
    sideContainerActivityManager.setDisplay(shell.getSideContainer());
    mainContentActivityManager.setDisplay(shell.getMainContainer());
  }

}
