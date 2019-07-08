package nl.vorsen.ooapi;

import java.util.HashMap;
import java.util.Map;

public class CourseOffering {

  private String courseOfferingId;
  private Course course;
  private int maxNumberStudents;
  private int currentNumberStudents;
  private String academicYear;
  private String period;
  private Map<String, Object> _links = new HashMap<>();

}
