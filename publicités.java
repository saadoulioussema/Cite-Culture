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
public class publicités {
    private Date dt_début ;
    private Date dt_fin ;
    private int id ; 
    private String type ;
    private String titre ;
    private String description ;

    public publicités(Date dt_début, Date dt_fin, int id, String type, String titre, String description) {
        this.dt_début = dt_début;
        this.dt_fin = dt_fin;
        this.id = id;
        this.type = type;
        this.titre = titre;
        this.description = description;
    }

    public publicités(Date dt_début, Date dt_fin, String type, String titre, String description) {
        this.dt_début = dt_début;
        this.dt_fin = dt_fin;
        this.type = type;
        this.titre = titre;
        this.description = description;
    }
    
    
    public publicités(){
    }

    public Date getDt_début() {
        return dt_début;
    }

    public Date getDt_fin() {
        return dt_fin;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDt_début(Date dt_début) {
        this.dt_début = dt_début;
    }

    public void setDt_fin(Date dt_fin) {
        this.dt_fin = dt_fin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final publicités other = (publicités) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.dt_début, other.dt_début)) {
            return false;
        }
        if (!Objects.equals(this.dt_fin, other.dt_fin)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "publicités{" + "dt_début=" + dt_début + ", dt_fin=" + dt_fin + ", id=" + id + ", type=" + type + ", titre=" + titre + ", description=" + description + '}';
    }
    
    
    
    
    
    
}
