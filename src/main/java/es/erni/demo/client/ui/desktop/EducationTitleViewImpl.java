package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.EducationTitleView;
import es.erni.demo.client.ui.EducationTitleView.Presenter;

public class EducationTitleViewImpl implements EducationTitleView {

	private static EducationTitleViewImplUiBinder uiBinder = GWT.create(EducationTitleViewImplUiBinder.class);

	interface EducationTitleViewImplUiBinder extends UiBinder<HTMLPanel, EducationTitleViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public EducationTitleViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return htmlPanel;
  }

	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
