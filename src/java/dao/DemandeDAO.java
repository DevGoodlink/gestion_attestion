/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import logicallayer.DemandeAttestation;

/**
 *
 * @author YASSALIE
 */
public class DemandeDAO {
    ArrayList<DemandeAttestation> lstDemande = new ArrayList<>();
    
    public ArrayList<DemandeAttestation> getAll(){
        
        DemandeAttestation d0=new DemandeAttestation();
        d0.setDateDemande(new Date("12/01/2017"));
        d0.setStagiaire(new UserDAO().getUser(1));
        d0.setStatus("Vérifiée");
        d0.setId(1l);
        DemandeAttestation d=new DemandeAttestation();
        d.setDateDemande(new Date("12/01/2017"));
        d.setStagiaire(new UserDAO().getUser(2));
        d.setStatus("Instruite");
        d.setId(1l);
        lstDemande.add(d);lstDemande.add(d0);
        return lstDemande;
    }
    public void addDde(DemandeAttestation d){
        //traitement d'ajout
        lstDemande.add(d);
        
    }
    
    
}
