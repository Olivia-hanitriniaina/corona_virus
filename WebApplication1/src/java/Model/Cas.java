/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hanitriniaina
 */
public class Cas {
    private int id_cas;
    private String date;
    private int entraitement;
    private int nouveau_cas;
    private String ville;
    private int nombre_deces;
    private int nombre_geuris;
    private int forme_grave;

   
    public Cas(int id_cas, String date, int entraitement, int nouveau_cas, String ville, int nombre_deces, int nombre_geuris,int forme_grave) {
        this.id_cas = id_cas;
        this.date = date;
        this.entraitement = entraitement;
        this.nouveau_cas = nouveau_cas;
        this.ville = ville;
        this.nombre_deces = nombre_deces;
        this.nombre_geuris = nombre_geuris;
        this.forme_grave= forme_grave;
        
    }
 public int getForme_grave() {
        return forme_grave;
    }

    public void setForme_grave(int forme_grave) {
        this.forme_grave = forme_grave;
    }
    public int getId_cas() {
        return id_cas;
    }

    public void setId_cas(int id_cas) {
        this.id_cas = id_cas;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getEntraitement() {
        return entraitement;
    }

    public void setEntraitement(int entraitement) {
        this.entraitement = entraitement;
    }

    public int getNouveau_cas() {
        return nouveau_cas;
    }

    public void setNouveau_cas(int nouveau_cas) {
        this.nouveau_cas = nouveau_cas;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getNombre_deces() {
        return nombre_deces;
    }

    public void setNombre_deces(int nombre_deces) {
        this.nombre_deces = nombre_deces;
    }

    public int getNombre_geuris() {
        return nombre_geuris;
    }

    public void setNombre_geuris(int nombre_geuris) {
        this.nombre_geuris = nombre_geuris;
    }

    public Cas() {
    }

  
    
    public ArrayList<Cas> donnees(){
        ArrayList<Cas> cas = new ArrayList<>();
        cas.add(new Cas(1, "2020-07-01", 400,400, "Antananarivo", 50, 300,5));
        cas.add(new Cas(2, "2020-07-01", 78,60, "Tamatave", 13, 50,1));
        cas.add(new Cas(3, "2020-07-01", 31,95, "Antsirabe", 5, 21,0));
        cas.add( new Cas(4, "2020-07-01", 90,100, "Fianarantsoa", 82, 130,4));
        cas.add(new Cas(5,"2020-07-01", 1, 1,"Toliara", 0, 2,1));
        cas.add(new Cas(6, "2020-07-01", 2,4, "Majunga", 0, 0,0)); 
      for(int i=0; i<cas.size();i++){
         System.out.println(cas.get(i).getVille()); 
      }
        return cas;
    }
}
