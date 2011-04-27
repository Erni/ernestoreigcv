package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.PublicationsTitleView;
import es.erni.demo.client.ui.PublicationsTitleView.Presenter;

public class PublicationsTitleViewImpl implements PublicationsTitleView {

	private static PublicationsTitleViewImplUiBinder uiBinder = GWT.create(PublicationsTitleViewImplUiBinder.class);

	interface PublicationsTitleViewImplUiBinder extends UiBinder<HTMLPanel, PublicationsTitleViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public PublicationsTitleViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
