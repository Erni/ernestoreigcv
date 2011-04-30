package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.DefaultView;

public class DefaultViewImpl implements DefaultView {

	private static DefaultViewImplUiBinder uiBinder = GWT.create(DefaultViewImplUiBinder.class);

	interface DefaultViewImplUiBinder extends UiBinder<HTMLPanel, DefaultViewImpl> {}
	
	HTMLPanel panel;

	public DefaultViewImpl() {
		panel = uiBinder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return panel;
  }

}
