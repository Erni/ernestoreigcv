package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

import es.erni.demo.client.ui.DemoShell;

import static com.google.gwt.dom.client.Style.Unit.PCT;

public class DemoShellImpl implements DemoShell {

	private static DemoShellImplUiBinder uiBinder = GWT.create(DemoShellImplUiBinder.class);

	interface DemoShellImplUiBinder extends UiBinder<LayoutPanel, DemoShellImpl> {}
	
	/**
	 * As said in http://tbroyer.posterous.com/gwt-21-activities-nesting-yagni
	 * "using a LayoutPanel you can easily animate transitions between layouts, with a single line of code!"
	 */
	private final LayoutPanel mainLayoutPanel;
	
  private static final int TITLE_HEIGHT = 10;
	private static final int MAINMENU_HEIGHT = 5;
	private static final int HMASTER_HEIGHT = 23;
	private static final int VLEFT_WIDTH = 12;
	private static final int VRIGHT_WIDTH = 12;
  
  @UiField SimplePanel titlePanel;
  @UiField SimplePanel menuPanel;
  @UiField SimplePanel masterHorizontalPanel;
  @UiField SimplePanel mainPanel;
  @UiField SimplePanel vertLeftPanel;
  @UiField SimplePanel vertRightPanel;
  
  @UiField(provided = true)
  MainMenuViewImpl mainMenu;

  @Inject
	public DemoShellImpl(MainMenuViewImpl mainMenu) {
    this.mainMenu = mainMenu;
		mainLayoutPanel = uiBinder.createAndBindUi(this);
//		setCareerOverviewLayout();
	}

	public LayoutPanel getMainLayoutPanel() {
		return mainLayoutPanel;
  }

	public void setCareerOverviewLayout() {
    int height = 100 - MAINMENU_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(titlePanel, 0, PCT, TITLE_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(menuPanel, TITLE_HEIGHT, PCT, MAINMENU_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(masterHorizontalPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetTopHeight(vertLeftPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetRightWidth(vertRightPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, TITLE_HEIGHT + MAINMENU_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetLeftWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.animate(500);
  }
	
	public void setKeyStrengthsLayout() {
    int height = 100 - TITLE_HEIGHT - MAINMENU_HEIGHT - HMASTER_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(titlePanel, 0, PCT, TITLE_HEIGHT, PCT);
    
    mainLayoutPanel.setWidgetTopHeight(menuPanel, TITLE_HEIGHT, PCT, MAINMENU_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(masterHorizontalPanel, TITLE_HEIGHT + MAINMENU_HEIGHT, PCT, HMASTER_HEIGHT, PCT);
//    mainLayoutPanel.setWidgetTopHeight(vertLeftPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetLeftWidth(vertLeftPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, MAINMENU_HEIGHT + TITLE_HEIGHT + HMASTER_HEIGHT, PCT, height, PCT);
//    mainLayoutPanel.setWidgetLeftWidth(mainPanel, VLEFT_WIDTH, PCT, 100 - VLEFT_WIDTH, PCT);
    mainLayoutPanel.setWidgetRightWidth(vertRightPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetRightWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setTechSkillsLayout() {
    int height = 100 - MAINMENU_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(titlePanel, 0, PCT, TITLE_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(menuPanel, TITLE_HEIGHT, PCT, MAINMENU_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(masterHorizontalPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetLeftWidth(vertLeftPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetTopHeight(vertRightPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetRightWidth(vertRightPanel, 0, PCT, VRIGHT_WIDTH, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetRightWidth(mainPanel, VRIGHT_WIDTH, PCT, 100 - VRIGHT_WIDTH, PCT);
    mainLayoutPanel.animate(500);
  }
	
	public void setProfExpLayout() {
    int height = 100 - MAINMENU_HEIGHT - TITLE_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(titlePanel, 0, PCT, TITLE_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(menuPanel, TITLE_HEIGHT, PCT, MAINMENU_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(vertLeftPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetLeftWidth(vertLeftPanel, 0, PCT, VLEFT_WIDTH, PCT);
    mainLayoutPanel.setWidgetTopHeight(masterHorizontalPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, HMASTER_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, MAINMENU_HEIGHT + TITLE_HEIGHT + HMASTER_HEIGHT, PCT, height - HMASTER_HEIGHT, PCT);
    mainLayoutPanel.setWidgetLeftWidth(mainPanel, VLEFT_WIDTH, PCT, 100 - VLEFT_WIDTH, PCT);
    mainLayoutPanel.setWidgetRightWidth(vertRightPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setEducationLayout() {
    int height = 100 - TITLE_HEIGHT - MAINMENU_HEIGHT - HMASTER_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(titlePanel, 0, PCT, TITLE_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(menuPanel, TITLE_HEIGHT, PCT, MAINMENU_HEIGHT, PCT);
    
    mainLayoutPanel.setWidgetTopHeight(masterHorizontalPanel, TITLE_HEIGHT + MAINMENU_HEIGHT, PCT, HMASTER_HEIGHT, PCT);
//    mainLayoutPanel.setWidgetTopHeight(vertLeftPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
//    mainLayoutPanel.setWidgetLeftWidth(vertLeftPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, MAINMENU_HEIGHT + TITLE_HEIGHT + HMASTER_HEIGHT, PCT, height, PCT);
//    mainLayoutPanel.setWidgetLeftWidth(mainPanel, VLEFT_WIDTH, PCT, 100 - VLEFT_WIDTH, PCT);
    mainLayoutPanel.setWidgetLeftWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.setWidgetLeftWidth(vertLeftPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetRightWidth(vertRightPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setAdditionalInfoLayout() {
		int height = 100 - TITLE_HEIGHT - MAINMENU_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(titlePanel, 0, PCT, TITLE_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(menuPanel, TITLE_HEIGHT, PCT, MAINMENU_HEIGHT, PCT);
		
    mainLayoutPanel.setWidgetTopHeight(masterHorizontalPanel, 0, PCT, 0, PCT);
    
    mainLayoutPanel.setWidgetTopHeight(vertLeftPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetLeftWidth(vertLeftPanel, 0, PCT, VLEFT_WIDTH, PCT);
    
    mainLayoutPanel.setWidgetTopHeight(vertRightPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetRightWidth(vertRightPanel, 0, PCT, VRIGHT_WIDTH, PCT);
    
    mainLayoutPanel.setWidgetTopHeight(mainPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetLeftWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.animate(500);
  }

	public void setPublicationsLayout() {
    int height = 100 - TITLE_HEIGHT - MAINMENU_HEIGHT - HMASTER_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(titlePanel, 0, PCT, TITLE_HEIGHT, PCT);
    
    mainLayoutPanel.setWidgetTopHeight(menuPanel, TITLE_HEIGHT, PCT, MAINMENU_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(masterHorizontalPanel, TITLE_HEIGHT + MAINMENU_HEIGHT, PCT, HMASTER_HEIGHT, PCT);
//    mainLayoutPanel.setWidgetTopHeight(vertLeftPanel, MAINMENU_HEIGHT + TITLE_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.setWidgetLeftWidth(vertLeftPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, MAINMENU_HEIGHT + TITLE_HEIGHT + HMASTER_HEIGHT, PCT, height, PCT);
//    mainLayoutPanel.setWidgetLeftWidth(mainPanel, VLEFT_WIDTH, PCT, 100 - VLEFT_WIDTH, PCT);
    mainLayoutPanel.setWidgetRightWidth(vertRightPanel, 0, PCT, 0, PCT);
    mainLayoutPanel.setWidgetLeftWidth(mainPanel, 0, PCT, 100, PCT);
    mainLayoutPanel.animate(500);
  }

	public AcceptsOneWidget getMainContainer() {
		return new AcceptsOneWidget() {
			public void setWidget(IsWidget w) {
				Widget widget = Widget.asWidgetOrNull(w);
				mainPanel.setWidget(widget);
			}
		};
  }

	public AcceptsOneWidget getVerticalMasterContainer() {
    return new AcceptsOneWidget() {
      public void setWidget(IsWidget w) {
        Widget widget = Widget.asWidgetOrNull(w);
        vertLeftPanel.setWidget(widget);
      }
    };
  }

	public AcceptsOneWidget getSideContainer() {
    return new AcceptsOneWidget() {
      public void setWidget(IsWidget w) {
        Widget widget = Widget.asWidgetOrNull(w);
        vertRightPanel.setWidget(widget);
      }
    };
  }

	public AcceptsOneWidget getHorizontalMasterContainer() {
    return new AcceptsOneWidget() {
      public void setWidget(IsWidget w) {
        Widget widget = Widget.asWidgetOrNull(w);
        masterHorizontalPanel.setWidget(widget);
      }
    };
  }

	public void setDefaultLayout() {
	  // TODO Auto-generated method stub
	  
  }

}
