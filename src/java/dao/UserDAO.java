/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import logicallayer.*;

/**
 *
 * @author YASSALIE
 */
public class UserDAO {
    public User getUser(int i){
        
        User u = new User();
        
        u.setCin("C939706");
        u.setDdn(new Date("19/07/1985"));
        u.setEmail("yasser@hotmail.com");
        u.setNom("sbai");
        u.setPrenom("yasser");
        u.setF(new Fonction());
        u.setId(1l);
        
        User u0 = new User();
        
        u0.setCin("C939707");
        u0.setDdn(new Date("19/07/1990"));
        u0.setEmail("alaoui@hotmail.com");
        u0.setNom("Alaoui");
        u0.setPrenom("mohamed");
        u0.setF(new Fonction());
        u0.setId(2l);
        
        return(i==1)?  u :  u0 ;
    }
    public ArrayList<User> getAll(){
        ArrayList<User> lstUser = new ArrayList<>();
        User u = new User();
        u.setCin("C939706");
        u.setDdn(new Date("19/07/1985"));
        u.setEmail("yasser@hotmail.com");
        u.setNom("sbai");
        u.setPrenom("yasser");
        u.setF(new Fonction());
        u.setId(1l);
        User u0 = new User();
        u0.setCin("C939707");
        u0.setDdn(new Date("19/07/1990"));
        u0.setEmail("ali@hotmail.com");
        u0.setNom("alaoui");
        u0.setPrenom("mohamed");
        u0.setF(new Fonction());
        u0.setId(2l);
        
        lstUser.add(u);lstUser.add(u0);
        return lstUser;
    }
}
