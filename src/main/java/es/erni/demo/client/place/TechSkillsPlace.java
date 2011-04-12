package es.erni.demo.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class TechSkillsPlace extends Place {
	
  @Prefix("ts")
  public static class Tokenizer implements PlaceTokenizer<TechSkillsPlace> {

    public TechSkillsPlace getPlace(String token) {
      return new TechSkillsPlace();
    }

    public String getToken(TechSkillsPlace place) {
      return "ts";
    }
  }

}
