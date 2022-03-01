/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Calcule {
    private int a,b,somme,pgcd;
    private String parite="paire";
    private double factoriel=1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSomme() {
        return somme;
    }

    public void setSomme(int somme) {
        this.somme = somme;
    }

    public int getPgcd() {
        return pgcd;
    }

    public void setPgcd(int pgcd) {
        this.pgcd = pgcd;
    }

    public String getParite() {
        return parite;
    }

    public void setParite(String parite) {
        this.parite = parite;
    }

    public double getFactoriel() {
        return factoriel;
    }

    public void setFactoriel(double factoriel) {
        this.factoriel = factoriel;
    }
    public void sommeAb()
    {
    this.somme=a+b;
    
    }
    public void testparite()
    {
    if( a%2==0 )
    {
    this.parite="paire";
    }
    else
        this.parite="impaire";
    
    }
    public void facto()
    {
    int f=1;
    for(int i=2;i<=this.a;i++)
    {    f*=i; // => f=f*i;
    }
    this.factoriel=f;
    
    
    
    }
    public void calculepgcd()
    {
    int x=a; int y=b;
    while(x!=y)
    {
    if(x>y)
        x-=y;
    else
        y-=x;
    
    }
    pgcd= x;
    
    }
    
    
    
    
}
