/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cas;
import Services.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Hanitriniaina
 */

@Controller
public class Controlleur {
    
   Service service = new Service();
   
   @RequestMapping(value = "index.htm")
   public String FindAll(ModelMap model) throws Exception {
        try{
            
             ArrayList<Cas> listecas = service.findAllCasService();
             model.addAttribute("message",listecas);
        }
        catch(Exception e){
            throw e;
        }
      return "index";
   }
 @RequestMapping(value = "sorted.htm")
   public String SortedController(ModelMap model) throws Exception {
        try{
            
             List<Cas> listecas = service.SortedCasService();
             model.addAttribute("message",listecas);
        }
        catch(Exception e){
            throw e;
        }
      return "sorted";
   }
}
