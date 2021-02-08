package nl.vorsen.ooapi.v4.parameters;

import lombok.Getter;
import lombok.Setter;
import nl.vorsen.ooapi.Paged;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class ComponentQuery implements Paged {

    @Min(0)
    @Max(250)
    private int pageSize = 10;

    @Min(0)
    private int pageNumber = 0;

    private String q;
    private String type;
    private String sort;

}
