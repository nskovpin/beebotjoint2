import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

/**
 * Created by NSkovpin on 14.07.2016.
 */
public class DateTimeTest {

    @Test
    public void daysBetweenTest(){

        DateTime dateTimeStart = DateTime.parse("20150120", DateTimeFormat.forPattern("yyyyMMdd"));
        DateTime dateTimeEnd = DateTime.parse("20150126", DateTimeFormat.forPattern("yyyyMMdd"));

        int days = Days.daysBetween(dateTimeStart.toLocalDate(), dateTimeEnd.toLocalDate()).getDays();

        assert days == 6;

    }

}
