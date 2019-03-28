/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fundup.entity;

/**
 *
 * @author Guideinfo
 */
public class Membre {

    private int id;
    private String username;
    private String email;
    private String password;
    private String nom1;
    private String nom2;
    private String role;
    private String description;
    private String photo;

    public Membre(int id, String username, String email, String password, String nom1, String nom2, String role, String description, String photo) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.nom1 = nom1;
        this.nom2 = nom2;
        this.role = role;
        this.description = description;
        this.photo = photo;
    }

    public Membre(String username, String email, String password, String nom1, String nom2, String role, String description, String photo) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.nom1 = nom1;
        this.nom2 = nom2;
        this.role = role;
        this.description = description;
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
