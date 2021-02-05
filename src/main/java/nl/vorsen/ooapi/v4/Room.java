package nl.vorsen.ooapi.v4;

import java.util.HashMap;
import java.util.Map;

public class Room {

    private String abbreviation;
    private String name;
    private String type;
    private String description;
    private int totalSeats;
    private int availableSeats;
    private int floor;
    private String wing;
    private Geolocation geolocation;
    private Map<String, Object> ext = new HashMap<>();

}