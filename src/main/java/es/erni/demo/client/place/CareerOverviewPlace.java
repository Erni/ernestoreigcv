package es.erni.demo.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class CareerOverviewPlace extends Place {

  @Prefix("co")
  public static class Tokenizer implements PlaceTokenizer<CareerOverviewPlace> {

    public CareerOverviewPlace getPlace(String token) {
      return new CareerOverviewPlace();
    }

    public String getToken(CareerOverviewPlace place) {
      return "co";
    }
  }

}
