/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicallayer;

import java.util.Date;

/**
 *
 * @author YASSALIE
 */
public class DemandeAttestation {
    private Long id;
    private User stagiaire;
    private Date dateDemande;
    private String status;
    
    public DemandeAttestation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public User getStagiaire() {
        return stagiaire;
    }

    public void setStagiaire(User stagiaire) {
        this.stagiaire = stagiaire;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
