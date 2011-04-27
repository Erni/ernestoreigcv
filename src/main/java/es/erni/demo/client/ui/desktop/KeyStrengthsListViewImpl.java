package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.KeyStrengthsListView;
import es.erni.demo.client.ui.KeyStrengthsListView.Presenter;

public class KeyStrengthsListViewImpl implements KeyStrengthsListView {

	private static KeyStrengthsListViewImplUiBinder uiBinder = GWT.create(KeyStrengthsListViewImplUiBinder.class);

	interface KeyStrengthsListViewImplUiBinder extends UiBinder<HTMLPanel, KeyStrengthsListViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public KeyStrengthsListViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}

