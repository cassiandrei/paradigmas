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
    private Point origem;
    private boolean zoom=false;

    
public Circulo(Point pt, int raio, String tipom){
    this.pt=pt;
    this.raio=raio;
    this.tipom=tipom;
    this.origem = (Point) pt.clone();
    this.origem.x += 100;
    this.origem.y += 100;
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

public Point getOrigem(){
    return this.origem;
}

public void zoom(){
    if(zoom==false){
            this.raio += 5;
       if(this.raio==100)
           this.zoom=true;
       }
       else{
           this.raio -= 5;
           if(this.raio==25)
                this.zoom=false;
       }  
}

    
public void setPoint(Point pt){
    this.pt=pt;
}
   
}
