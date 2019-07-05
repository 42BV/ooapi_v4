package nl.vorsen.ooapi;

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
