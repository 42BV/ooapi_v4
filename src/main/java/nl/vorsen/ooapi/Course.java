package nl.vorsen.ooapi;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class Course {

  private String courseId;
  private String name;
  private String abbreviation;
  private BigDecimal ects;
  private String description;
  private String learningOutcomes;
  private String goals;
  private String requirements;
  private String level;
  private Set<String> format = new HashSet<>();
  private String modeOfDelivery;
  private String mainLanguage;
  private String enrollment;
  private String resources;
  private String exams;
  private String schedule;
  private String link;
  private Map<String, Object> _links = new HashMap<>();

}
