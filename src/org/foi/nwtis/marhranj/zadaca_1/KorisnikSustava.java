/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis.marhranj.zadaca_1;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

/**
 *
 * @author grupa_1
 */
public class KorisnikSustava {
 
    @Parameter(names = { "-k" }, description = "Naziv korisnika")
    String korisnik;
    
    @Parameter(names = { "-l" }, description = "Lozinka korisnika")
    String lozinka;
    
    @Parameter(names = { "-s" }, description = "Adresa")
    String adresa;
    
    @Parameter(names = { "-p" }, description = "Broj porta")
    int port;
    
    @Parameter(names = { "--evidencija" }, description = "Datoteka evidencije")
    String evidencijaDatoteka;
    
    @Parameter(names = { "--iot" }, description = "IOT datoteka")
    String iotDatoteka;
    
    @Parameter(names = { "--pauza" })
    boolean pauza = false;
    
    @Parameter(names = { "--kreni" })
    boolean kreni = false;
    
    @Parameter(names = { "--zaustavi" })
    boolean zaustavi = false;
    
    @Parameter(names = { "--stanje" })
    boolean stanje = false;
    
    boolean administrator = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO Provjeri upisane argumente
        KorisnikSustava korisnikSustava = new KorisnikSustava();
        new JCommander(korisnikSustava, args);
        korisnikSustava.preuzmiPostavke();    
        if(korisnikSustava.administrator) {
// TODO Kreiraj objekt AdministrSustava i predaj mu kontrolu          
        } else {
// TODO Kreiraj objekt KorisikSustava i predaj mu kontrolu           
        }
    }

    private void preuzmiPostavke() {
        if (korisnik != null) {
            korisnik = korisnik.trim();
            if (!korisnik.isEmpty()) {
                administrator = true;
            }
        }
        if (lozinka != null) {
            lozinka = lozinka.trim();
            if (!lozinka.isEmpty()) {
                administrator = true;
            } else {
                administrator = false;
            }
        } else {
                administrator = false;
        }   
// TODO Provjeri da li je korisnik kao administrator u postavkama        
    }
}
