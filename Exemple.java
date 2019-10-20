/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;
import entitie.actualités;
import entitie.publicités;
import entitie.sponsoring;
import java.sql.Date;
import service.actualitésService;
import service.publicitésService;
import service.sponsoringService;
import util.Datasource;



/**
 *
 * @author dorra
 */
public class Exemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  
        // TODO code application logic here
      /* Datasource ds1=Datasource.getInstance();
        System.out.println(ds1);
        Datasource ds2=Datasource.getInstance();
        System.out.println(ds2);
        Datasource ds3=Datasource.getInstance();
        System.out.println(ds3);*/
       //**************************ajout************************
       
     // actualités s = new actualités(new Date(2020, 7, 7), new Date(2020, 7, 7), "n", "n", "n", "n");
     // publicités s=new publicités(new Date(2019, 2, 2), new Date(2019, 2, 2), "a", "a", "a") ;
     // actualitésService ps=new actualitésService();
     // publicitésService ps=new publicitésService();
        //ps.inserta(s);
        // sponsoringService ps=new sponsoringService();
        //ps.readAlls().forEach(e->System.out.println(e));
       /* //System.out.println(p.getId());
        //  ps.insertPst(p);*/
        
      
       /*  publicités p =new publicités(new Date(2020, 10, 10), new Date(2021, 10, 10),"f", "f", "f") ; 
         publicitésService ps=new publicitésService();
        ps.insertp(p);*/
       
       /* sponsoring p =new sponsoring("e", "e", "e", "e", new Date(2000, 02, 02), "e") ;
        sponsoringService ps=new sponsoringService();
        ps.inserts(p);*/
        //****************read*********************
     //publicitésService ps=new publicitésService();
      //System.out.println(ps.readAllp());
      //  sponsoringService ps=new sponsoringService();
        // publicitésService ps=new publicitésService();
     // actualitésService ps=new actualitésService(); 
        
       //****************suppression*********************
      // ps.deletePsta(24);
       //****************Modification*********************
      // actualitésService ps=new actualitésService();
       //ps.updatePsta_date_Début("coucou","4");
      /*publicitésService ps=new publicitésService();
      ps.updatePstp_titre("11",4);*/
      
    //sponsoringService ps=new sponsoringService();
     //ps.updatePsts_date_contrat("h","b");
   
      
        
       
        
       
       
         
    }
    
}
