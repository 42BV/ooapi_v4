package nl.vorsen.ooapi.v4.parameters;

import lombok.Getter;
import lombok.Setter;
import nl.vorsen.ooapi.Paged;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Getter
@Setter
public class OfferingQuery implements Paged {

    @Min(0)
    @Max(250)
    private int pageSize = 10;

    @Min(0)
    private int pageNumber = 0;

    private String q;
    private String mainLanguage;
    private String modeOfStudy;
    private Boolean isLineItem;
    private LocalDate since;
    private LocalDate until;
    private String sort;

}
