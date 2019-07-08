package applimentate;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AllergensControllerTest {
    @Autowired
    AllergensController allergensController;

    @Test
    public void getAllergens() throws Exception {
        List<Allergen> allergens = this.allergensController.getAllergens();
        assertThat(allergens)
                .isNotEmpty();
    }
}