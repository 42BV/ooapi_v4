package nl.vorsen.ooapi;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Page<T> {

  private int pageSize;
  private int pageNumber;
  private Embedded<T> _embedded = new Embedded<>();
  private Map<String, Object> _links = new HashMap<>();

}
