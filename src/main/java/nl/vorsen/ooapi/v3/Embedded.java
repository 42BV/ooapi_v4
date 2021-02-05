package nl.vorsen.ooapi.v3;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Embedded<T> {

  private List<T> items = new ArrayList<>();

}
