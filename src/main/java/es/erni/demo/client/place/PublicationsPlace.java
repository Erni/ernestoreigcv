package es.erni.demo.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class PublicationsPlace extends Place {
	
  @Prefix("pub")
  public static class Tokenizer implements PlaceTokenizer<PublicationsPlace> {

    public PublicationsPlace getPlace(String token) {
      return new PublicationsPlace();
    }

    public String getToken(PublicationsPlace place) {
      return "pub";
    }
  }

}
