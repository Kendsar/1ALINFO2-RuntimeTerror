/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fundup.iservice;

import edu.fundup.entity.Membre;

/**
 *
 * @author Guideinfo
 */
public interface IMembreService {
    public void login(String username, String pwd);
    public void Register(Membre m);
    public Membre getById(int id);
    public void forgotPwd(Membre m);
    public void getRole(Membre m);
    public void getByName(Membre m);
    
}
