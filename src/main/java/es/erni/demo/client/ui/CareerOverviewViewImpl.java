package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class CareerOverviewViewImpl implements CareerOverviewView {

	private static CareerOverviewViewImplUiBinder uiBinder = GWT.create(CareerOverviewViewImplUiBinder.class);

	interface CareerOverviewViewImplUiBinder extends UiBinder<HTMLPanel, CareerOverviewViewImpl> {}

	private final HTMLPanel htmlPanel;
  private Presenter presenter;
	
	public CareerOverviewViewImpl() {
		htmlPanel = uiBinder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return htmlPanel;
  }

	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
