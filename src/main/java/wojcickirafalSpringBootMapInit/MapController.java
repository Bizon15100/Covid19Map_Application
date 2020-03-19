package wojcickirafalSpringBootMapInit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;


@Controller
public class MapController {

    Covid19Parser covid19Parser;

    public MapController(Covid19Parser covid19Parser) {
        this.covid19Parser = covid19Parser;
    }

    @GetMapping
    public String getMap(Model model) throws IOException {
        model.addAttribute("point", new Point(covid19Parser.getCovidData()));
        return "map";
    }
}
