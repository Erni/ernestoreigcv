package es.erni.demo.client.mobile.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.KeyStrengthsListView;

public class KeyStrengthsListViewMobileImpl implements KeyStrengthsListView {

	private static KeyStrengthsListViewMobileImplUiBinder uiBinder = GWT.create(KeyStrengthsListViewMobileImplUiBinder.class);

	interface KeyStrengthsListViewMobileImplUiBinder extends UiBinder<ScrollPanel, KeyStrengthsListViewMobileImpl> {	}
	
	private final ScrollPanel scrollPanel;
  private Presenter presenter;

	public KeyStrengthsListViewMobileImpl() {
		scrollPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return scrollPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
