package nl.vorsen.ooapi.v3;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class CourseOffering {

  private String courseOfferingId;
  private Course course;
  private int maxNumberStudents;
  private int currentNumberStudents;
  private String academicYear;
  private String period;
  private Map<String, Object> _links = new HashMap<>();

}
