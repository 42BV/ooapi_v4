package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Organization extends Data {

    private String organizationId;
    private String name;
    private String shortName;
    private String description;
    private String type;
    private List<Address> addresses = new ArrayList<>();
    private String link;
    private String logo;
    private String brin;

}
