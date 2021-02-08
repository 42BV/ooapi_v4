package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Organization {

    private String organizationId;
    private String name;
    private String shortName;
    private String description;
    private String type;
    private List<Address> addresses = new ArrayList<>();
    private String link;
    private String logo;
    private String brin;
    private Map<String, Object> ext = new HashMap<>();

}
