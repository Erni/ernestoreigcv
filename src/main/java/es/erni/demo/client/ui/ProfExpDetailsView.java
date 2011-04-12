package es.erni.demo.client.ui;

import com.google.gwt.user.client.ui.IsWidget;

public interface ProfExpDetailsView extends IsWidget {
	
  void setPresenter(Presenter presenter);
  
  void setSelectedJob(int selectedJob);

  public interface Presenter {
  }

}
