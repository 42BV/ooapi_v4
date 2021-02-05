package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class Program {

    private String programId;
    private String type;
    private String name;
    private String abbreviation;
    private String description;
    private BigDecimal ects;
    private String qualificationAwarded;
    private int lengthOfProgram;
    private String levelOfQualification;
    private String sector;
    private String fieldsOfStudy;
    private String crohoCreboCode;
    private String profileOfProgram;
    private Set<String> learningOutcomes = new HashSet<>();
    private String admissionRequirements;
    private String qualificationRequirements;
    private String link;
    private Map<String, Object> ext = new HashMap<>();

}
