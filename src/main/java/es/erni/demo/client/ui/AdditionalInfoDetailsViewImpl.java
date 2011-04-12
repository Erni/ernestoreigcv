package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class AdditionalInfoDetailsViewImpl implements AdditionalInfoDetailsView {

	private static AdditionalInfoDetailsViewImplUiBinder uiBinder = GWT.create(AdditionalInfoDetailsViewImplUiBinder.class);

	interface AdditionalInfoDetailsViewImplUiBinder extends UiBinder<HTMLPanel, AdditionalInfoDetailsViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public AdditionalInfoDetailsViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
