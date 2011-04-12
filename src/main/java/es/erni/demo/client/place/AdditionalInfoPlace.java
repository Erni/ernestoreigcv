package es.erni.demo.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class AdditionalInfoPlace extends Place {
	
  @Prefix("addinf")
  public static class Tokenizer implements PlaceTokenizer<AdditionalInfoPlace> {

    public AdditionalInfoPlace getPlace(String token) {
      return new AdditionalInfoPlace();
    }

    public String getToken(AdditionalInfoPlace place) {
      return "addinf";
    }
  }

}
