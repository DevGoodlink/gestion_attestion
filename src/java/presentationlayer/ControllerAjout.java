/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import logicallayer.*;
import dao.*;

/**
 *
 * @author YASSALIE
 */
@ManagedBean
@SessionScoped
public class ControllerAjout implements Serializable {
    ArrayList<DemandeAttestation> lstDde;
    DemandeAttestation d;
    public ControllerAjout() {
        this.lstDde=new DemandeDAO().getAll();
    }

    public ArrayList getLstDde() {
        return lstDde;
    }

    public void setD(DemandeAttestation d) {
        new DemandeDAO().addDde(d);
    }

    
    
    
}
