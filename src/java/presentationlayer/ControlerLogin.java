/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author YASSALIE
 */
@ManagedBean
@SessionScoped
public class ControlerLogin implements Serializable {

    String login;
    String password;

    
    /**
     * Creates a new instance of ControlerLogin
     */
    public ControlerLogin() {
        
    }
    public String doVerification(){
        
        //ajouter une verification à la base de données
        if(this.login.equals("admin")  && this.password.equals("root")) return "home";
        else return "erreurLogin";
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
