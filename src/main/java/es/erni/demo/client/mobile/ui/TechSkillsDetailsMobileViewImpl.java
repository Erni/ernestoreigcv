package es.erni.demo.client.mobile.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.TechSkillsDetailsView;

public class TechSkillsDetailsMobileViewImpl implements TechSkillsDetailsView {

	private static TechSkillsDetailsMobileViewImplUiBinder uiBinder = GWT.create(TechSkillsDetailsMobileViewImplUiBinder.class);

	interface TechSkillsDetailsMobileViewImplUiBinder extends UiBinder<ScrollPanel, TechSkillsDetailsMobileViewImpl> {	}
	
	private final ScrollPanel scrollPanel;
  private Presenter presenter;

	public TechSkillsDetailsMobileViewImpl() {
		scrollPanel = uiBinder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return scrollPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
