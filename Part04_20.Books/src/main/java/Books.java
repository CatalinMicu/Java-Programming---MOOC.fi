/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
public class Books {
    private String titlu;
    private int nrPag;
    private int anPublicatie;
    
    
    public Books(String titlu, int nrPag, int anPublicatie) {
        this.titlu = titlu;
        this.nrPag = nrPag;
        this.anPublicatie = anPublicatie;
    }
    
    public String getTitlu() {
        return titlu;
    }
    
    public int getNrPag() {
        return nrPag;
    }
    
    public int getanPublicatie() {
        return anPublicatie;
    }
    @Override
    public String toString() {
        return getTitlu() + ", " + getNrPag() + " pages" + ", " + getanPublicatie();
     }
    
}


