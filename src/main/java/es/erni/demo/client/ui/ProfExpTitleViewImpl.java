package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class ProfExpTitleViewImpl implements ProfExpTitleView {

	private static ProfExpTitleViewImplUiBinder uiBinder = GWT.create(ProfExpTitleViewImplUiBinder.class);

	interface ProfExpTitleViewImplUiBinder extends UiBinder<HTMLPanel, ProfExpTitleViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public ProfExpTitleViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}

