
package JHONNY.JHONNY;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class servicioGames {
      @Autowired
     private GamesRepositorio metodosCrud;
     
     public List<Games> getAll(){
        return metodosCrud.getAll();
    }
    
}
