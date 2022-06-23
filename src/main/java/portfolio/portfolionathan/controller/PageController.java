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
    
    @GetMapping(value="/Tract")
    public String projectTract(Model model){
        return "Tract-detail";
    }

    @GetMapping(value="/Beelingual")
    public String projectBeelingual(Model model){
        return "Beelingual-detail";
    }

    @GetMapping(value="/Badr")
    public String projectBadr(Model model){
        return "Badr-detail";
    }

    @GetMapping(value="/Phileo")
    public String projectPhileo(Model model){
        return "Phileo-detail";
    }

    @GetMapping(value="/Digit")
    public String projectDigit(Model model){
        return "Digit-detail";
    }
}
