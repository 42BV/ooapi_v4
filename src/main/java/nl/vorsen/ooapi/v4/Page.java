package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Page<T> extends Data {

    private int pageNumber;
    private int pageSize;

    private List<T> items = new ArrayList<>();

}
