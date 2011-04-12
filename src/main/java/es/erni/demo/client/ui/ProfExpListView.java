package es.erni.demo.client.ui;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;

import es.erni.demo.client.domain.Job;

public interface ProfExpListView extends IsWidget {
	
	void setJobList(List<Job> jobList);
	
  void setPresenter(Presenter presenter);

  public interface Presenter {
    void jobSelected(int id);
  }

}
