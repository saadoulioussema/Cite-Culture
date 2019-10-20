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
public class sponsoring {
    
   private String nomEvent ;
   private String marqueSpons ;
   private String catégorieEvent ;
   private int id ;
   private String service_à_offrir ;
   private Date date_contrat ;
   private String nom_sponseur;

    public sponsoring() {
    }

    public sponsoring(String nomEvent, String marqueSpons, String catégorieEvent, int id, String service_à_offrir, Date date_contrat, String nom_sponseur) {
        this.nomEvent = nomEvent;
        this.marqueSpons = marqueSpons;
        this.catégorieEvent = catégorieEvent;
        this.id = id;
        this.service_à_offrir = service_à_offrir;
        this.date_contrat = date_contrat;
        this.nom_sponseur = nom_sponseur;
    }

    public sponsoring(String nomEvent, String marqueSpons, String catégorieEvent, String service_à_offrir, Date date_contrat, String nom_sponseur) {
        this.nomEvent = nomEvent;
        this.marqueSpons = marqueSpons;
        this.catégorieEvent = catégorieEvent;
        this.service_à_offrir = service_à_offrir;
        this.date_contrat = date_contrat;
        this.nom_sponseur = nom_sponseur;
    }

    public String getNomEvent() {
        return nomEvent;
    }

    public String getMarqueSpons() {
        return marqueSpons;
    }

    public String getCatégorieEvent() {
        return catégorieEvent;
    }

    public int getId() {
        return id;
    }

    public String getService_à_offrir() {
        return service_à_offrir;
    }

    public Date getDate_contrat() {
        return date_contrat;
    }

    public String getNom_sponseur() {
        return nom_sponseur;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public void setMarqueSpons(String marqueSpons) {
        this.marqueSpons = marqueSpons;
    }

    public void setCatégorieEvent(String catégorieEvent) {
        this.catégorieEvent = catégorieEvent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setService_à_offrir(String service_à_offrir) {
        this.service_à_offrir = service_à_offrir;
    }

    public void setDate_contrat(Date date_contrat) {
        this.date_contrat = date_contrat;
    }

    public void setNom_sponseur(String nom_sponseur) {
        this.nom_sponseur = nom_sponseur;
    }

    @Override
    public String toString() {
        return "sponsoring{" + "nomEvent=" + nomEvent + ", marqueSpons=" + marqueSpons + ", catégorieEvent=" + catégorieEvent + ", id=" + id + ", service_à_offrir=" + service_à_offrir + ", date_contrat=" + date_contrat + ", nom_sponseur=" + nom_sponseur + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final sponsoring other = (sponsoring) obj;
        if (!Objects.equals(this.nomEvent, other.nomEvent)) {
            return false;
        }
        if (!Objects.equals(this.marqueSpons, other.marqueSpons)) {
            return false;
        }
        if (!Objects.equals(this.catégorieEvent, other.catégorieEvent)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.service_à_offrir, other.service_à_offrir)) {
            return false;
        }
        if (!Objects.equals(this.date_contrat, other.date_contrat)) {
            return false;
        }
        if (!Objects.equals(this.nom_sponseur, other.nom_sponseur)) {
            return false;
        }
        return true;
    }
   
   
   
    
}
