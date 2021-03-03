package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Component extends Data {

    private String componentId;
    private String type;
    private String name;
    private String abbreviation;
    private String description;

}
