package es.erni.demo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;

public class PublicationsDetailsViewImpl implements PublicationsDetailsView {

	private static PublicationsDetailsViewImplUiBinder uiBinder = GWT.create(PublicationsDetailsViewImplUiBinder.class);

	interface PublicationsDetailsViewImplUiBinder extends UiBinder<ScrollPanel, PublicationsDetailsViewImpl> {}
	
	private final ScrollPanel scrollPanel;
  private Presenter presenter;
  
  @UiField DisclosurePanel pub1;
  @UiField DisclosurePanel pub2;
  @UiField DisclosurePanel pub3;
  @UiField DisclosurePanel pub4;
  @UiField DisclosurePanel pub5;
  @UiField DisclosurePanel pub6;
  @UiField DisclosurePanel pub7;
  @UiField DisclosurePanel pub8;
  @UiField DisclosurePanel pub9;
  @UiField DisclosurePanel pub10;
  @UiField DisclosurePanel pub11;
  @UiField DisclosurePanel pub12;
  @UiField DisclosurePanel pub13;
  @UiField DisclosurePanel pub14;

	public PublicationsDetailsViewImpl() {
		scrollPanel = uiBinder.createAndBindUi(this);

		pub1.setAnimationEnabled(true);
		pub2.setAnimationEnabled(true);
		pub3.setAnimationEnabled(true);
		pub4.setAnimationEnabled(true);
		pub5.setAnimationEnabled(true);
		pub6.setAnimationEnabled(true);
		pub7.setAnimationEnabled(true);
		pub8.setAnimationEnabled(true);
		pub9.setAnimationEnabled(true);
		pub10.setAnimationEnabled(true);
		pub11.setAnimationEnabled(true);
		pub12.setAnimationEnabled(true);
		pub13.setAnimationEnabled(true);
		pub14.setAnimationEnabled(true);
	}
	
	public Widget asWidget() {
		return scrollPanel;
  }
	
	public void setPresenter(Presenter presenter) {
	  this.presenter = presenter;
  }

}
