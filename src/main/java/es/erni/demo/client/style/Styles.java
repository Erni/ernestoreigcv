package es.erni.demo.client.style;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.ImageResource;

// WE should ask how to do this with GIN
public class Styles {
	
	private static Resources resources;
	
	static {
		resources = GWT.create(Resources.class);
	}
	
	public static Common common() {
		return resources.common();
	}
	
	public static Resources resources() {
		return resources;
	}
	
	public interface Common extends CssResource {

	}
	
	public interface Resources extends ClientBundle {
		
		ImageResource debian();
		ImageResource debian32();
		ImageResource debian48();
		ImageResource facecool();
		ImageResource facecool24();
		ImageResource facecool48();
		ImageResource techskills();
		ImageResource techskills48();
		ImageResource profexp();
		ImageResource profexp48();
		ImageResource profexp2();
		ImageResource education();
		ImageResource education48();
		ImageResource userinfo();
		ImageResource userinfo48();
		ImageResource science();
		ImageResource science48();
		ImageResource fish();
		ImageResource monkey();
		ImageResource low24();
		ImageResource world24();
		ImageResource userinfo24();
		ImageResource mailforward24();
		ImageResource phone24();
		ImageResource medium24();
		ImageResource tux24();
		ImageResource pda();
		ImageResource computer();
		ImageResource art();
		ImageResource home();
		
		@NotStrict
		@Source("common.css")
		Common common();
		
	}

}
