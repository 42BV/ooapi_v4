package nl.vorsen.ooapi.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public abstract class Data {

    private Map<String, Object> ext = new HashMap<>();

}
