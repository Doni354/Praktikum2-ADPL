/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.katalogbukumvc.model;

/**
 *
 * @author muhammadyoga
 */
public class Buku {
    private final String judul;
    private final String penulis;
    private final int tahunTerbit;
    
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
}
