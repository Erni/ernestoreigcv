package es.erni.demo.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class EducationPlace extends Place {

  @Prefix("edu")
  public static class Tokenizer implements PlaceTokenizer<EducationPlace> {

    public EducationPlace getPlace(String token) {
      return new EducationPlace();
    }

    public String getToken(EducationPlace place) {
      return "edu";
    }
  }
  
}
