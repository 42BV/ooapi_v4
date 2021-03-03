package nl.vorsen.ooapi.v4;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import java.time.ZonedDateTime;

import static nl.vorsen.ooapi.v4.AcademicSession.DATE_PATTERN;

@Getter
@Setter
public class Offering extends Data {

    private String offeringId;
    private String type;
    private AcademicSession academicSession;
    private String name;
    private String abbreviation;
    private String description;
    private String mainLanguage;
    private String modeOfStudy;

    @Min(0)
    private int maxNumberStudents;

    @Min(0)
    private int enrolledNumberStudents;

    @Min(0)
    private int pendingNumberStudents;

    private boolean isLineItem;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    private ZonedDateTime startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    private ZonedDateTime endDate;

    private String resultValueType;
    private int resultWeight;

    private Room room;
    private Component component;
    private Offering courseOffering;
    private Organization organization;

}
