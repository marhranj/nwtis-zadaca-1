/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis.marhranj.zadaca_1;

import java.io.Serializable;

/**
 *
 * @author grupa_1
 */
public class Evidencija implements Serializable {
    private long ukupanBrojZahtjeva = 0;
    private long brojNeispravnihZahtjeva = 0;
    private long brojNedozvoljenihZahtjeva = 0;
    private long brojUspjesnihZahtjeva = 0;
    private long brojPrekinutihZahtjeva = 0;
    private long ukupnoVrijemeRadaRadnihDretvi = 0;
    private long brojObavljenihSerijalizacija = 0;      

    public long getUkupanBrojZahtjeva() {
        return ukupanBrojZahtjeva;
    }

    public void setUkupanBrojZahtjeva(long ukupanBrojZahtjeva) {
        this.ukupanBrojZahtjeva = ukupanBrojZahtjeva;
    }

    public long getBrojNeispravnihZahtjeva() {
        return brojNeispravnihZahtjeva;
    }

    public void setBrojNeispravnihZahtjeva(long brojNeispravnihZahtjeva) {
        this.brojNeispravnihZahtjeva = brojNeispravnihZahtjeva;
    }

    public long getBrojNedozvoljenihZahtjeva() {
        return brojNedozvoljenihZahtjeva;
    }

    public void setBrojNedozvoljenihZahtjeva(long brojNedozvoljenihZahtjeva) {
        this.brojNedozvoljenihZahtjeva = brojNedozvoljenihZahtjeva;
    }

    public long getBrojUspjesnihZahtjeva() {
        return brojUspjesnihZahtjeva;
    }

    public void setBrojUspjesnihZahtjeva(long brojUspjesnihZahtjeva) {
        this.brojUspjesnihZahtjeva = brojUspjesnihZahtjeva;
    }

    public long getBrojPrekinutihZahtjeva() {
        return brojPrekinutihZahtjeva;
    }

    public void setBrojPrekinutihZahtjeva(long brojPrekinutihZahtjeva) {
        this.brojPrekinutihZahtjeva = brojPrekinutihZahtjeva;
    }

    public long getUkupnoVrijemeRadaRadnihDretvi() {
        return ukupnoVrijemeRadaRadnihDretvi;
    }

    public void setUkupnoVrijemeRadaRadnihDretvi(long ukupnoVrijemeRadaRadnihDretvi) {
        this.ukupnoVrijemeRadaRadnihDretvi = ukupnoVrijemeRadaRadnihDretvi;
    }

    public long getBrojObavljenihSerijalizacija() {
        return brojObavljenihSerijalizacija;
    }

    public void setBrojObavljenihSerijalizacija(long brojObavljenihSerijalizacija) {
        this.brojObavljenihSerijalizacija = brojObavljenihSerijalizacija;
    }
    
}
