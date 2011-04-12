package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class AdditionalInfoTitleLeftViewImpl implements AdditionalInfoTitleLeftView {

	private static AdditionalInfoTitleLeftViewImplUiBinder uiBinder = GWT.create(AdditionalInfoTitleLeftViewImplUiBinder.class);

	interface AdditionalInfoTitleLeftViewImplUiBinder extends UiBinder<HTMLPanel, AdditionalInfoTitleLeftViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public AdditionalInfoTitleLeftViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
