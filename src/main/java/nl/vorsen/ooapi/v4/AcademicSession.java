package nl.vorsen.ooapi.v4;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import nl.vorsen.ooapi.v4.json.DateSerializer;

import java.time.LocalDate;

@Getter
@Setter
public class AcademicSession extends Data {

    private String academicSessionId;
    private String name;

    @JsonSerialize(using = DateSerializer.class)
    private LocalDate startDate;

    @JsonSerialize(using = DateSerializer.class)
    private LocalDate endDate;

    private AcademicSession year;
    private AcademicSession parent;

}
