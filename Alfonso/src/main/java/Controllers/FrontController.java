package Controllers;


@Controller
public class FrontController {

    @GetMapping()
    public String index(){
        return "index";
    }
}


