/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author Hanitriniaina
 */
import DAO.Function;
import Model.Cas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanitriniaina
 */
public class Service {  
    
    Function dao = new Function();
    
    public ArrayList <Cas> findAllCasService() throws Exception{
        
      return dao.findAllCas();
    }
    public List <Cas> SortedCasService() throws Exception{
        
      return dao.SortedCas();
    }
    
}

