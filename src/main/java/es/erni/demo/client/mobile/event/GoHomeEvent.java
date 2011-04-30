package es.erni.demo.client.mobile.event;

import com.google.gwt.event.shared.GwtEvent;

public class GoHomeEvent extends GwtEvent<GoHomeEventHandler> {
		
	public static Type<GoHomeEventHandler> TYPE = new Type<GoHomeEventHandler>();

	@Override
	public Type<GoHomeEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoHomeEventHandler handler) {
		handler.onGoHome();
	}

}
