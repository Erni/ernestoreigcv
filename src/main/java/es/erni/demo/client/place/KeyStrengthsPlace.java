package es.erni.demo.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class KeyStrengthsPlace extends Place {
	
  @Prefix("ks")
  public static class Tokenizer implements PlaceTokenizer<KeyStrengthsPlace> {

    public KeyStrengthsPlace getPlace(String token) {
      return new KeyStrengthsPlace();
    }

    public String getToken(KeyStrengthsPlace place) {
      return "ks";
    }
  }

}
