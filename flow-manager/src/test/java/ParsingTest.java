import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class ParsingTest {

    @Test
    public void parseTest(){
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get("src\\main\\resources\\flows\\flow3.json"));
            ObjectMapper objectMapper = new ObjectMapper();
            Flow flow =  objectMapper.readValue(jsonData, Flow.class);
            assert flow != null;
            System.out.println("test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
