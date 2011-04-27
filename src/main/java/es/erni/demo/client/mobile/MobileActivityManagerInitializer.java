package es.erni.demo.client.mobile;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import es.erni.demo.client.ui.DemoShell;

/**
 * This class is responsible for ActivityManager instantiations through GIN,
 * it also associate every ActivityManager with the corresponding display region
 */
public class MobileActivityManagerInitializer {

  @Inject
  public MobileActivityManagerInitializer(DemoShell shell,
                                    @Named("MainContentRegion") ActivityManager mainContentActivityManager) {
    mainContentActivityManager.setDisplay(shell.getMainContainer());
  }

}
