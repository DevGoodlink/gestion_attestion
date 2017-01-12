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
public class User {
    private Long id;
    private String nom,prenom,cin,email;
    private Date ddn;
    private Fonction f;
    private DemandeAttestation dde;
    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDdn() {
        return ddn;
    }

    public void setDdn(Date ddn) {
        this.ddn = ddn;
    }

    public Fonction getF() {
        return f;
    }

    public void setF(Fonction f) {
        this.f = f;
    }

    public DemandeAttestation getDde() {
        return dde;
    }

    public void setDde(DemandeAttestation dde) {
        this.dde = dde;
    }
    
    
            
}
