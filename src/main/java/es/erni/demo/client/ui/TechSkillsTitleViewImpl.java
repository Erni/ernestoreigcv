package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class TechSkillsTitleViewImpl implements TechSkillsTitleView {

	private static TechSkillsTitleViewImplUiBinder uiBinder = GWT.create(TechSkillsTitleViewImplUiBinder.class);

	interface TechSkillsTitleViewImplUiBinder extends UiBinder<HTMLPanel, TechSkillsTitleViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public TechSkillsTitleViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}

