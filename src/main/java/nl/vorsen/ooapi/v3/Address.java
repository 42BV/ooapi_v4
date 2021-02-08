package nl.vorsen.ooapi.v3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String street;
    private String additional;
    private String city;
    private String zip;
    private String countryCode;

}
