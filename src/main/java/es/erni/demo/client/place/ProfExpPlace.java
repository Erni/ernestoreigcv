package es.erni.demo.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ProfExpPlace extends Place {
	
  @Prefix("pe")
  public static class Tokenizer implements PlaceTokenizer<ProfExpPlace> {

    public ProfExpPlace getPlace(String token) {
      return new ProfExpPlace();
    }

    public String getToken(ProfExpPlace place) {
      return "pe";
    }
  }

}
