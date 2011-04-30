package es.erni.demo.client.mobile.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.TechSkillsTitleView;

public class TechSkillsTitleViewMobileImpl implements TechSkillsTitleView {

	private static TechSkillsTitleViewMobileImplUiBinder uiBinder = GWT.create(TechSkillsTitleViewMobileImplUiBinder.class);

	interface TechSkillsTitleViewMobileImplUiBinder extends UiBinder<HTMLPanel, TechSkillsTitleViewMobileImpl> {	}
	
	private HTMLPanel panel;
	
	private Presenter presenter;

	public TechSkillsTitleViewMobileImpl() {
		panel = uiBinder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return panel;
  }

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
  }

}
