package nl.vorsen.ooapi.v4;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Map;

public class OfferingTest extends AbstractBeanTest {

    @Test
    public void marshal_shouldSucceed() throws JsonProcessingException {
        Offering offering = new Offering();
        offering.setStartDate(LocalDate.of(2020, 9, 1));
        offering.setLineItem(true);

        String json = objectMapper.writeValueAsString(offering);
        Map<String, Object> values = objectMapper.readValue(json, Map.class);
        Assertions.assertEquals("2020-09-01", values.get("startDate"));
        Assertions.assertEquals(true, values.get("isLineItem"));
    }

}
