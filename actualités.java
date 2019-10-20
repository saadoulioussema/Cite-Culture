/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitie;



import java.sql.Date;
import java.util.Objects;


/**
 *
 * @author dorra
 */
public class actualités {
    
    
    
    private Date date_Début;
    private Date date_Fin;
    private int id ;
    private String description;
    private String titre;
    private String nomEvent;
    private String catégorieEvent; 

   
    public actualités(Date date_Début, Date date_Fin, int id, String description, String titre, String nomEvent, String catégorieEvent) {
        this.date_Début = date_Début;
        this.date_Fin = date_Fin;
        this.id = id;
        this.description = description;
        this.titre = titre;
        this.nomEvent = nomEvent;
        this.catégorieEvent = catégorieEvent;
    }

   public actualités(Date date_Début,Date date_Fin,String description,String titre,String nomEvent,String catégorieEvent) {
        this.date_Début = date_Début;
        this.date_Fin = date_Fin;
        
        this.description = description;
        this.titre = titre;
        this.nomEvent = nomEvent;
        this.catégorieEvent = catégorieEvent;
    }


  
    
    public actualités(){
    }

    public int getId () {
        return id ;
    }


    public Date getDate_Début() {
        return date_Début;
    }

    public Date getDate_Fin() {
        return date_Fin;
    }

    public String getDescription() {
        return description;
    }

    public String getTitre() {
        return titre;
    }

    public String getNomEvent() {
        return nomEvent;
    }

    public String getCatégorieEvent() {
        return catégorieEvent;
    }

    public void setId (int id) {
        this.id  = id ;
    }

   
    public void setDate_Début(Date date_Début) {
        this.date_Début = date_Début;
    }

    public void setDate_Fin(Date date_Fin) {
        this.date_Fin = date_Fin;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public void setCatégorieEvent(String catégorieEvent) {
        this.catégorieEvent = catégorieEvent;
    }

    @Override
    public String toString() {
        return "actualités{" + ", date_Début=" + date_Début + ", date_Fin=" + date_Fin +"id=" + id + ", description=" + description + ", titre=" + titre + ", nomEvent=" + nomEvent + ", cat\u00e9gorieEvent=" + catégorieEvent + '}';
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final actualités other = (actualités) obj;
        
        if (!Objects.equals(this.id, other.id )) {
            return false;
        }
        if (!Objects.equals(this.date_Début, other.date_Début)) {
            return false;
        }
        if (!Objects.equals(this.date_Fin, other.date_Fin)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.nomEvent, other.nomEvent)) {
            return false;
        }
        if (!Objects.equals(this.catégorieEvent, other.catégorieEvent)) {
            return false;
        }
        return true;
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


