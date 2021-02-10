package nl.vorsen.ooapi.v4.parameters;

import lombok.Getter;
import lombok.Setter;
import nl.vorsen.ooapi.Paged;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class PersonQuery implements Paged {

    @Min(0L)
    @Max(250L)
    private int pageSize = 10;

    @Min(0L)
    private int pageNumber = 0;

    private String q;
    private String affiliations;
    private String sort;

}
