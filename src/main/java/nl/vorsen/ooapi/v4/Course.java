package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Course extends Data {

    private String courseId;
    private String name;
    private String abbreviation;
    private BigDecimal ects;
    private String description;
    private Set<String> learningOutcomes = new HashSet<>();
    private String requirements;
    private String level;
    private Set<String> modeOfDelivery = new HashSet<>();
    private String enrollment;
    private Set<String> resources = new HashSet<>();
    private String assessment;
    private String link;

}
