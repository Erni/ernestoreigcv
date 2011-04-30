package es.erni.demo.client.mobile.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import es.erni.demo.client.ui.CareerOverviewView;

public class CareerOverviewViewMobileImpl implements CareerOverviewView {

	private static CareerOverviewViewMobileImplUiBinder uiBinder = GWT.create(CareerOverviewViewMobileImplUiBinder.class);

	interface CareerOverviewViewMobileImplUiBinder extends UiBinder<HTMLPanel, CareerOverviewViewMobileImpl> {}
	
	HTMLPanel panel;
	
	Presenter presenter;

	public CareerOverviewViewMobileImpl() {
		panel = uiBinder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return panel;
  }

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
  }

}
