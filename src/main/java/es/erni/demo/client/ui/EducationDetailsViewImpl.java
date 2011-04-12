package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class EducationDetailsViewImpl implements EducationDetailsView {

	private static EducationDetailsViewImplUiBinder uiBinder = GWT.create(EducationDetailsViewImplUiBinder.class);

	interface EducationDetailsViewImplUiBinder extends UiBinder<HTMLPanel, EducationDetailsViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;
  
  @UiField DisclosurePanel educationDiscPanel;

	public EducationDetailsViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
		educationDiscPanel.setAnimationEnabled(true);
	}

	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
