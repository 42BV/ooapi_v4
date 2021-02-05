package nl.vorsen.ooapi.v3;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class EducationalProgramme {

  private String educationalProgrammeId;
  private String name;
  private String description;
  private String termStartDate;
  private String termEndDate;
  private BigDecimal ects;
  private String mainLanguage;
  private String qualificationAwarded;
  private int lenghtOfProgramme;
  private String levelOfQualification;
  private String fieldsOfStudy;
  private String profileOfProgramme;
  private String programmeLearningOutcomes;
  private String modeOfStudy;
  private Map<String, Object> _links = new HashMap<>();

}
