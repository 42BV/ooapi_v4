package nl.vorsen.ooapi.v4.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDate;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

public class DateSerializer extends JsonSerializer<LocalDate> {

    private static final String START_OF_DAY = "T00:00:00.000Z";

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeNull();
        } else {
            String date = value.format(ISO_LOCAL_DATE);
            gen.writeString(date + START_OF_DAY);
        }
    }

}
