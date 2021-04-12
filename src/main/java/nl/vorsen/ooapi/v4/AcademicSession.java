package nl.vorsen.ooapi.v4;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AcademicSession extends Data {

    private String academicSessionId;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate endDate;

    private AcademicSession year;
    private AcademicSession parent;

}
