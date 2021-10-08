
package JHONNY.JHONNY;




import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GamesRepositorio {
     @Autowired
    private interfaceGames crud;

    public List<Games> getAll(){
        return (List<Games>) crud.findAll();
    }


    public Games save(Games games){
        return crud.save(games);
    }
   
    
}
