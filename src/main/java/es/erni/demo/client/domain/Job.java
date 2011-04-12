package es.erni.demo.client.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Job {
	
	private final int id;
	private String started;
	private String finished;
	private String title;
	private String company;
	
	public Job(int id, String started, String finished, String title, String company) {
		this.id = id;
		this.started = started;
		this.finished = finished;
		this.title = title;
		this.company = company;
	}
	
  public int getId() {
    return id;
  }
	public void setStarted(String started) {
	  this.started = started;
  }
	public String getStarted() {
	  return started;
  }
	public void setFinished(String finished) {
	  this.finished = finished;
  }
	public String getFinished() {
	  return finished;
  }
	public void setTitle(String title) {
	  this.title = title;
  }
	public String getTitle() {
	  return title;
  }
	public void setCompany(String company) {
	  this.company = company;
  }
	public String getCompany() {
	  return company;
  }
	
  private static HashMap<Integer, Job> bunchOfJobs = new HashMap<Integer, Job>();

  static {
    bunchOfJobs.put(1, new Job(1, "January 2007", "Present", "EHR Research and Development Software Engineer", "IBIME"));
    bunchOfJobs.put(2, new Job(2, "June 2006", "January 2007", "Software Engineer", "INORME SL"));
    bunchOfJobs.put(3, new Job(3, "May 2006", "June 2006", "Computer Science Teacher", "Commercial Agents Association"));
    bunchOfJobs.put(4, new Job(4, "June 2005", "September 2005", "Web Developer", "La Virgen de los Lirios Hospital"));
  }

  public static class JOBLIST {
    private static List<Job> list = new ArrayList<Job>(bunchOfJobs.values());

    public static List<Job> getJobList() {
      return list;
    }

    public static Job getJob(int id) {
      return bunchOfJobs.get(id);
    }

  }

}
