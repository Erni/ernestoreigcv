package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.AdditionalInfoTitleRightView;
import es.erni.demo.client.ui.AdditionalInfoTitleRightView.Presenter;

public class AdditionalInfoTitleRightViewImpl implements AdditionalInfoTitleRightView {
	
	private static AdditionalInfoTitleRightViewImplUiBinder uiBinder = GWT.create(AdditionalInfoTitleRightViewImplUiBinder.class);

	interface AdditionalInfoTitleRightViewImplUiBinder extends UiBinder<HTMLPanel, AdditionalInfoTitleRightViewImpl> {	}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public AdditionalInfoTitleRightViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
