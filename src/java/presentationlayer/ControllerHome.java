/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author YASSALIE
 */
@ManagedBean
@SessionScoped
public class ControllerHome {
    private int registred,validated,signed;
    private int nbCP,nbSect,nbStag;
    private int toVerify,toValidate,toSign;
           
    
    public ControllerHome() {
        
        
    }

    public int getToVerify() {
        return toVerify;
    }

    public void setToVerify(int toVerify) {
        this.toVerify = toVerify;
    }

    public int getToValidate() {
        return toValidate;
    }

    public void setToValidate(int toValidate) {
        this.toValidate = toValidate;
    }

    public int getToSign() {
        return toSign;
    }

    public void setToSign(int toSign) {
        this.toSign = toSign;
    }
    
    public int getNbCP() {
        return nbCP;
    }

    public void setNbCP(int nbCP) {
        this.nbCP = nbCP;
    }

    public int getNbSect() {
        return nbSect;
    }

    public void setNbSect(int nbSect) {
        this.nbSect = nbSect;
    }

    public int getNbStag() {
        return nbStag;
    }

    public void setNbStag(int nbStag) {
        this.nbStag = nbStag;
    }
    
    public int getRegistred() {
        return registred;
    }

    public void setRegistred(int registred) {
        this.registred = registred;
    }

    public int getValidated() {
        return validated;
    }

    public void setValidated(int validated) {
        this.validated = validated;
    }

    public int getSigned() {
        return signed;
    }

    public void setSigned(int signed) {
        this.signed = signed;
    }
    
}
