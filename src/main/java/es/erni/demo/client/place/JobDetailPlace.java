package es.erni.demo.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class JobDetailPlace extends ProfExpPlace {
	
  private String jobId;
  
  public JobDetailPlace(String token) {
    this.jobId = token;
  }
  
  public String getJobId() {
  	return this.jobId;
  }
  
  @Prefix("job")
  public static class Tokenizer implements PlaceTokenizer<JobDetailPlace> {

    public JobDetailPlace getPlace(String token) {
      return new JobDetailPlace(token);
    }

    public String getToken(JobDetailPlace place) {
      return place.getJobId();
    }
  }

}
