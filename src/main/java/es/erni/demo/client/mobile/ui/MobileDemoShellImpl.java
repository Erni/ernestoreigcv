package es.erni.demo.client.mobile.ui;

import static com.google.gwt.dom.client.Style.Unit.PCT;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;

import es.erni.demo.client.mobile.event.GoHomeEvent;
import es.erni.demo.client.style.Styles;
import es.erni.demo.client.ui.DemoShell;

public class MobileDemoShellImpl implements DemoShell {

	private static MobileDemoShellImplUiBinder uiBinder = GWT.create(MobileDemoShellImplUiBinder.class);

	interface MobileDemoShellImplUiBinder extends UiBinder<LayoutPanel, MobileDemoShellImpl> {}
	
	private final LayoutPanel mainLayoutPanel;
	
  private static final int NAVIGBAR_HEIGHT = 10;
  private static final int HMASTER_HEIGHT = 20;
  private static final int SIDE_WIDTH = 20;
	
	@UiField SimplePanel navigBarPanel;
	@UiField SimplePanel horizontalMasterPanel;
	@UiField SimplePanel sidePanel;
	@UiField SimplePanel mainPanel;
	
	@UiField Button home;

	EventBus eventBus;
	
	@Inject
	public MobileDemoShellImpl(final EventBus eventBus) {
		this.eventBus = eventBus;
		mainLayoutPanel = uiBinder.createAndBindUi(this);
		
		home.setHTML(AbstractImagePrototype.create(Styles.resources().home()).getHTML() + " Home");
		home.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new GoHomeEvent());
      }
		});
	}

	public LayoutPanel getMainLayoutPanel() {
		return mainLayoutPanel;
  }

	public AcceptsOneWidget getMainContainer() {
		return mainPanel;
  }

	public AcceptsOneWidget getHorizontalMasterContainer() {
	  return horizontalMasterPanel;
  }

	public AcceptsOneWidget getVerticalMasterContainer() {
	  // TODO Auto-generated method stub
	  return null;
  }

	public AcceptsOneWidget getSideContainer() {
	  return sidePanel;
  }
	
	public void setDefaultLayout() {
    int height = 100 - NAVIGBAR_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(navigBarPanel, 0, PCT, NAVIGBAR_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, NAVIGBAR_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetRightWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setCareerOverviewLayout() {
    int height = 100 - NAVIGBAR_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(navigBarPanel, 0, PCT, NAVIGBAR_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, NAVIGBAR_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetTopHeight(horizontalMasterPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetTopHeight(sidePanel, 0, PCT, 0, PCT);
//    mainLayoutPanel.setWidgetRightWidth(sidePanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetRightWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setKeyStrengthsLayout() {
    int height = 100 - NAVIGBAR_HEIGHT - HMASTER_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(navigBarPanel, 0, PCT, NAVIGBAR_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(horizontalMasterPanel, NAVIGBAR_HEIGHT, PCT, HMASTER_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, NAVIGBAR_HEIGHT + HMASTER_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetRightWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.setWidgetTopHeight(sidePanel, 0, PCT, 0, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setTechSkillsLayout() {
    int height = 100 - NAVIGBAR_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(navigBarPanel, 0, PCT, NAVIGBAR_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, NAVIGBAR_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetTopHeight(horizontalMasterPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetRightWidth(mainPanel, SIDE_WIDTH, PCT, 100 - SIDE_WIDTH, PCT);
    mainLayoutPanel.setWidgetTopHeight(sidePanel, NAVIGBAR_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetRightWidth(sidePanel, 0, PCT, SIDE_WIDTH, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setProfExpLayout() {
	  // TODO Auto-generated method stub
	  
  }

	public void setEducationLayout() {
	  // TODO Auto-generated method stub
	  
  }

	public void setAdditionalInfoLayout() {
	  // TODO Auto-generated method stub
	  
  }

	public void setPublicationsLayout() {
	  // TODO Auto-generated method stub
	  
  }

}
