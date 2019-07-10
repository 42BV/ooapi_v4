package nl.vorsen.ooapi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class Page<T> implements Paged {

  private int pageSize;
  private int pageNumber;
  private Embedded<T> _embedded = new Embedded<>();
  private Map<String, Object> _links = new HashMap<>();

  public Page(Paged paged) {
    this.pageSize = paged.getPageSize();
    this.pageNumber = paged.getPageNumber();
  }

}
