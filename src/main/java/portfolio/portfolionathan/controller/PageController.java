package portfolio.portfolionathan.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @GetMapping(value="/")
    public String index(Model model){
        return "index";
    }

    @GetMapping(value="/project")
    public String project(Model model){
        return "blog-list";
    }
}
