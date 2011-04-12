package es.erni.demo.client.ui;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.LayoutPanel;

public interface DemoShell {
	
	LayoutPanel getMainLayoutPanel();
	
	AcceptsOneWidget getMainContainer();
	
	AcceptsOneWidget getHorizontalMasterContainer();
	
	AcceptsOneWidget getVerticalMasterContainer();
	
	AcceptsOneWidget getSideContainer();
	
	void setCareerOverviewLayout();
	
	void setKeyStrengthsLayout();
	
  void setTechSkillsLayout();
  
  void setProfExpLayout();
  
  void setEducationLayout();
  
  void setAdditionalInfoLayout();
  
  void setPublicationsLayout();

}
