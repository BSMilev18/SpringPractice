import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RecommendationsController {
    @GetMapping("/movies")
// @RequestMapping(method=RequestMethod.GET, value="/movies")
    public List<Movies> getAllMovies();
}

