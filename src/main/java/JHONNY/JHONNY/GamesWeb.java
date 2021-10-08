
package JHONNY.JHONNY;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saludar")
public class GamesWeb {
     @GetMapping("/hola")
    public String saludar(){
    return "Hola mundo 11111";
    }
    @Autowired
    private servicioGames servicio;
    @GetMapping("/all")
    public List<Games> getGames(){
        return servicio.getAll();
    }
    
}
