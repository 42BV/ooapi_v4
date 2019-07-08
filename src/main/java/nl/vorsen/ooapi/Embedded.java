package nl.vorsen.ooapi;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Embedded<T> {

  private List<T> items = new ArrayList<>();

}
