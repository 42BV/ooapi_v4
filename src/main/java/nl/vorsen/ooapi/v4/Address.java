package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address extends Data {

    private String type;
    private String street;
    private String streetNumber;
    private String additional;
    private String postalCode;
    private String countryCode;
    private Geolocation geolocation;

}
