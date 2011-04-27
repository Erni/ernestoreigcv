package es.erni.demo.client.mobile.ui;

import static com.google.gwt.dom.client.Style.Unit.PCT;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;

import es.erni.demo.client.ui.DemoShell;

public class MobileDemoShellImpl implements DemoShell {

	private static MobileDemoShellImplUiBinder uiBinder = GWT.create(MobileDemoShellImplUiBinder.class);

	interface MobileDemoShellImplUiBinder extends UiBinder<LayoutPanel, MobileDemoShellImpl> {}
	
	private final LayoutPanel mainLayoutPanel;
	
  private static final int NAVIGBAR_HEIGHT = 10;
	
	@UiField SimplePanel navigBarPanel;
	@UiField SimplePanel mainPanel;

	public MobileDemoShellImpl() {
		mainLayoutPanel = uiBinder.createAndBindUi(this);
//		setDefaultLayout();
	}

	public LayoutPanel getMainLayoutPanel() {
		return mainLayoutPanel;
  }

	public AcceptsOneWidget getMainContainer() {
		return mainPanel;
  }

	public AcceptsOneWidget getHorizontalMasterContainer() {
	  // TODO Auto-generated method stub
	  return null;
  }

	public AcceptsOneWidget getVerticalMasterContainer() {
	  // TODO Auto-generated method stub
	  return null;
  }

	public AcceptsOneWidget getSideContainer() {
	  // TODO Auto-generated method stub
	  return null;
  }

	public void setCareerOverviewLayout() {
	  // TODO Auto-generated method stub
	  
  }

	public void setKeyStrengthsLayout() {
	  // TODO Auto-generated method stub
	  
  }

	public void setTechSkillsLayout() {
	  // TODO Auto-generated method stub
	  
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

	public void setDefaultLayout() {
    int height = 100 - NAVIGBAR_HEIGHT;
    mainLayoutPanel.setWidgetTopHeight(navigBarPanel, 0, PCT, NAVIGBAR_HEIGHT, PCT);
    mainLayoutPanel.setWidgetTopHeight(mainPanel, NAVIGBAR_HEIGHT, PCT, height, PCT);
    mainLayoutPanel.animate(500);
  }

}
