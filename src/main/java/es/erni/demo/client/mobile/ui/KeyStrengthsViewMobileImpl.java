package es.erni.demo.client.mobile.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.KeyStrengthsView;

public class KeyStrengthsViewMobileImpl implements KeyStrengthsView {

	private static KeyStrengthsViewMobileImplUiBinder uiBinder = GWT.create(KeyStrengthsViewMobileImplUiBinder.class);

	interface KeyStrengthsViewMobileImplUiBinder extends UiBinder<HTMLPanel, KeyStrengthsViewMobileImpl> {}
	
	HTMLPanel panel;
	
	Presenter presenter;

	public KeyStrengthsViewMobileImpl() {
		panel = uiBinder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return panel;
  }

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
  }

}
