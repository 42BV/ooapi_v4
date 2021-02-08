package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Component {

    private String componentId;
    private String type;
    private String name;
    private String abbreviation;
    private String description;
    private Map<String, Object> ext = new HashMap<>();

}
