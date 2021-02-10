package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Association {

    public static final String TYPE_PROGRAM = "programOfferingAssociation";
    public static final String TYPE_COURSE = "courseOfferingAssociation";
    public static final String TYPE_COMPONENT = "componentOfferingAssociation";

    public static final String STATE_PENDING = "pending";
    public static final String STATE_CANCELED = "canceled";
    public static final String STATE_DENIED = "denied";
    public static final String STATE_ASSOCIATED = "associated";

    private String associationId;
    private String type;
    private String role;
    private String state;
    private List<Person> persons = new ArrayList<>();
    private Offering offering;
    private Map<String, Object> ext = new HashMap<>();

}
