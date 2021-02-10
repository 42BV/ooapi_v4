package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class Person {

    public static final String EMPLOYEE = "employee";

    private String personId;
    private String givenName;
    private String surname;
    private String displayName;
    private Set<String> affiliations = new HashSet<>();
    private String mail;
    private Map<String, Object> ext = new HashMap<>();

}
