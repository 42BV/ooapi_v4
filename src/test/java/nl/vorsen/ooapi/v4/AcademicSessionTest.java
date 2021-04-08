package nl.vorsen.ooapi.v4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Map;

public class AcademicSessionTest {

    @Test
    public void marshal_shouldSucceed() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        AcademicSession session = new AcademicSession();
        session.setStartDate(LocalDate.of(2020, 9, 1));

        String json = mapper.writeValueAsString(session);
        Map<String, Object> values = mapper.readValue(json, Map.class);
        Assertions.assertEquals("2020-09-01T00:00:00.000Z", values.get("startDate"));
        Assertions.assertNull(values.get("endDate"));
    }

}
