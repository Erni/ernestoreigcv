package es.erni.demo.client.ui.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.TechSkillsDetailsView;
import es.erni.demo.client.ui.TechSkillsDetailsView.Presenter;

public class TechSkillsDetailsViewImpl implements TechSkillsDetailsView {

	private static TechSkillsDetailsViewImplUiBinder uiBinder = GWT.create(TechSkillsDetailsViewImplUiBinder.class);

	interface TechSkillsDetailsViewImplUiBinder extends UiBinder<HTMLPanel, TechSkillsDetailsViewImpl> {}
	
	private final HTMLPanel htmlPanel;
  private Presenter presenter;

	public TechSkillsDetailsViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}
	
	public Widget asWidget() {
		return htmlPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}

