/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author cassiano
 */
public class Circulo {
    private int raio;
    private Point pt;
    private String tipom;

    
public Circulo(Point pt, int raio, String tipom){
    this.pt=pt;
    this.raio=raio;
    this.tipom=tipom;
}

public void desenhac(Graphics c){
        c.setColor(Color.blue);
        c.fillOval(pt.x, pt.y, raio, raio);
}
public String tipomove(){
        return tipom;
}
    
public Point getPoint(){
        return pt;
}
    
    public void setPoint(Point pt){
        this.pt=pt;
}
   
}
