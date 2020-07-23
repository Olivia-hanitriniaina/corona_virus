/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import DAO.Function;
import Model.Cas;
import Services.Service;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Hanitriniaina
 */
public class NewClass {
    public static void main(String[] args) throws Exception {
         //Connection connection = null;
         //connection = new Connexion().connecter();
         Function f = new Function();
         List<Cas> c = f.SortedCas();
    }
}
