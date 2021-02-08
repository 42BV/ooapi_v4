package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Address {

    private String type;
    private String street;
    private String streetNumber;
    private String additional;
    private String postalCode;
    private String countryCode;
    private Geolocation geolocation;
    private Map<String, Object> ext = new HashMap<>();

}
