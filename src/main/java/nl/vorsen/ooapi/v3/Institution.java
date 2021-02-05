package nl.vorsen.ooapi.v3;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Institution {

    private String institutionId;
    private String brin;
    private String name;
    private String description;
    private AcademicCalendar academicCalendar = new AcademicCalendar();
    private Address address = new Address();
    private String logo;
    private Map<String, Object> _links = new HashMap<>();

}
