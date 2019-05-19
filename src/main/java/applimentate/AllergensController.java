package applimentate;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin
@RestController
public class AllergensController {

    @RequestMapping(value = "/allergens", method = GET)
    public List<Allergen> getAllergens() {
        return this.getAllergenList();
    }

    private List<Allergen> getAllergenList() {
        final Allergen[] allergens = {
                new Allergen("LUPINS"),
                new Allergen("CELERY"),
                new Allergen("PEANUTS"),
                new Allergen("CRUSTACEANS"),
                new Allergen("SULFUR_DIOXIDE_AND_SULPHITES"),
                new Allergen("NUTS"),
                new Allergen("GLUTEN"),
                new Allergen("SESAME_SEEDS"),
                new Allergen("EGG"),
                new Allergen("DAIRY_PRODUCTS"),
                new Allergen("MOLLUSCS"),
                new Allergen("MUSTARD"),
                new Allergen("FISH"),
                new Allergen("SOY")
        };
        return Arrays.asList(allergens);
    }
}