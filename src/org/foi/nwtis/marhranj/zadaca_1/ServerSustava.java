/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis.marhranj.zadaca_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.foi.nwtis.marhranj.konfiguracije.Konfiguracija;
import org.foi.nwtis.marhranj.konfiguracije.KonfiguracijaApstraktna;
import org.foi.nwtis.marhranj.konfiguracije.NeispravnaKonfiguracija;
import org.foi.nwtis.marhranj.konfiguracije.NemaKonfiguracije;


/**
 *
 * @author grupa_1
 */
public class ServerSustava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datotekaKonfig;
        if (args.length != 1) {
            System.out.println("Premalo ili previše argumenata.");
            return;
        }
        datotekaKonfig = args[0];

        try {
            Konfiguracija konfig = KonfiguracijaApstraktna.preuzmiKonfiguraciju(datotekaKonfig);
            ServerSustava ss = new ServerSustava();
            ss.pokreniPosluzitelj(konfig);
        } catch (NemaKonfiguracije | NeispravnaKonfiguracija ex) {
            Logger.getLogger(ServerSustava.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
    }

    private void pokreniPosluzitelj(Konfiguracija konfig) {
        int port = Integer.parseInt(konfig.dajPostavku("port"));
        int maksCekanje = Integer.parseInt(konfig.dajPostavku("maks.broj.zahtjeva.cekanje"));
        int maksRadnihDretvi = Integer.parseInt(konfig.dajPostavku("maks.broj.radnih.dretvi"));
        String datotekaEvidencije = konfig.dajPostavku("datoteka.evidencije.rada");
        boolean krajRada = false;
        int brojRadnihDretvi = 0;

// TODO Provjeri i ako postoji učitaj evidenciju rada
        SerijalizatorEvidencije se = new SerijalizatorEvidencije("marhranj - Serijalizator", konfig);
        se.start();
        
        try {
            ServerSocket serverSocket = new ServerSocket(port, maksCekanje);

            while (!krajRada) {
                Socket socket = serverSocket.accept();
                System.out.println("Korisnik se spojio");
                if (brojRadnihDretvi == maksRadnihDretvi) {
// TODO Vrati odgovarajući odgovor                    
                } else {
                    RadnaDretva radnaDretva = new RadnaDretva(socket, "marhranj - " + brojRadnihDretvi, konfig);
                    brojRadnihDretvi++;
                    radnaDretva.start();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerSustava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
