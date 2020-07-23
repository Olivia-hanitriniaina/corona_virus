package DAO;


import Model.Cas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanitriniaina
 */
public class Function {
    
    ArrayList<Cas> c = new ArrayList();
    Cas value = new Cas();
        
    public ArrayList<Cas> findAllCas() throws Exception {
         
        try{
            c = value.donnees();
            c.stream().distinct().collect(Collectors.toList());
        }
        catch(Exception e)
        {
            throw e;
        }
        return c;
     }
     public List<Cas> SortedCas() throws Exception {
          List <Cas> sortedCas = new ArrayList();
        try{
            c = value.donnees();
          sortedCas = c.stream().sorted(Comparator
                                            .comparing(Cas::getEntraitement)
                                            .thenComparing(Cas::getNouveau_cas)
                                            .thenComparing(Cas::getNombre_geuris)
                                            .reversed()).collect(Collectors.toList());
            for(int i=0;i<sortedCas.size();i++)
            System.out.println(sortedCas.get(i).getVille()+"cvhcv   "+sortedCas.get(i).getEntraitement()+"cvhcv   "+sortedCas.get(i).getNouveau_cas()+"cvhcv   "+sortedCas.get(i).getNombre_geuris());
        }
        catch(Exception e)
        {
            throw e;
        }
        return sortedCas;
     }
}
