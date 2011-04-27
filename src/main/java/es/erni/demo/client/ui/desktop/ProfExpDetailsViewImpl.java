package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.ProfExpDetailsView;
import es.erni.demo.client.ui.ProfExpDetailsView.Presenter;

public class ProfExpDetailsViewImpl implements ProfExpDetailsView {

	private static ProfExpDetailsViewImplUiBinder uiBinder = GWT.create(ProfExpDetailsViewImplUiBinder.class);

	interface ProfExpDetailsViewImplUiBinder extends UiBinder<ScrollPanel, ProfExpDetailsViewImpl> {}
	
	private final ScrollPanel scrollPanel;
  private Presenter presenter;
  
  @UiField DisclosurePanel respIbimeDiscPanel;
  @UiField DisclosurePanel achievIbimeDiscPanel;
  @UiField DisclosurePanel respInormeDiscPanel;
  @UiField DisclosurePanel achievInormeDiscPanel;
  @UiField HTMLPanel ibimePanel;
  @UiField HTMLPanel inormePanel;
  @UiField HTMLPanel teacherPanel;
  @UiField HTMLPanel hospitalPanel;

	public ProfExpDetailsViewImpl() {
		scrollPanel = uiBinder.createAndBindUi(this);
//		htmlPanel.setAlwaysShowScrollBars(true);
		
		respIbimeDiscPanel.setAnimationEnabled(true);
		achievIbimeDiscPanel.setAnimationEnabled(true);
		respInormeDiscPanel.setAnimationEnabled(true);
		achievInormeDiscPanel.setAnimationEnabled(true);
	}
	
	public Widget asWidget() {
		return scrollPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

	public void setSelectedJob(int selectedJob) {
		switch(selectedJob) {
		case 1:
			ibimePanel.setVisible(true);
			inormePanel.setVisible(false);
			teacherPanel.setVisible(false);
			hospitalPanel.setVisible(false);
			break;
		case 2:
			ibimePanel.setVisible(false);
			inormePanel.setVisible(true);
			teacherPanel.setVisible(false);
			hospitalPanel.setVisible(false);
			break;
		case 3:
			ibimePanel.setVisible(false);
			inormePanel.setVisible(false);
			teacherPanel.setVisible(true);
			hospitalPanel.setVisible(false);
			break;
		case 4:
			ibimePanel.setVisible(false);
			inormePanel.setVisible(false);
			teacherPanel.setVisible(false);
			hospitalPanel.setVisible(true);
			break;
		}
  }

}

