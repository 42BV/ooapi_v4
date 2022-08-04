package nl.vorsen.ooapi.v4.parameters;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import nl.vorsen.ooapi.v4.pagination.Paged;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class AssociationQuery implements Paged {

    @Min(0L)
    @Max(250L)
    private int pageSize = 10;

    @Min(0L)
    private int pageNumber = 0;

    private String type;
    private String role;
    private String state;

    @JsonProperty("result-state")
    private String resultState;

    private String sort;

}
