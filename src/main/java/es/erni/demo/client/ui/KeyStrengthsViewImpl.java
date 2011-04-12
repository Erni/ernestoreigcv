package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class KeyStrengthsViewImpl implements KeyStrengthsView {

	private static KeyStrengthsViewImplUiBinder uiBinder = GWT.create(KeyStrengthsViewImplUiBinder.class);

	interface KeyStrengthsViewImplUiBinder extends UiBinder<HTMLPanel, KeyStrengthsViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public KeyStrengthsViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}

