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
public class Estrela {
    
    private int raioa;
    private int raiob;
    private int[] x1;
    private int[] x2;
    private int[] y1;
    private int[] y2;
    private Point pt;
    private String tipom;
    private Point origem;
    private boolean zoom=false;
    
public Estrela (Point pt, int raioa, int raiob, String tipom){
        this.tipom = tipom;
        this.raioa = raioa;
        this.raiob = raiob;
        this.x1 = new int[3];
        this.x2 = new int[10];
        this.y1 = new int[3];
        this.y2 = new int[10];
        this.pt = new Point(pt.x,pt.y);
        this.origem = (Point) pt.clone();
        this.origem.x += 100;
        this.origem.y += 100;
        this.zoom = false;
    }

    public void desenhaest(Graphics g){
        double angulo = Math.PI;
        int a=0;
        for(int i=0; i<5; i++){
            x1[0] = (int) ((raioa * Math.cos(angulo)) + pt.x);
            y1[0] = (int) ((raioa * Math.sin(angulo)) + pt.y);
            x2[a] = x1[0];
            y2[a] = y1[0];
            a++;
            
            angulo = angulo + Math.PI/5;
            x1[1] = (int) ((raioa * Math.cos(angulo)) + pt.x);
            y1[1] = (int) ((raiob * Math.sin(angulo)) + pt.y);
            angulo= angulo + Math.PI/5;
            
            x1[2] = (int) ((raioa * Math.cos(angulo)) + pt.x);
            y1[2] = (int) ((raioa * Math.sin(angulo)) + pt.y);
            x2[a] = x1[2];
            y2[a] = y1[2];
            
            g.setColor(Color.yellow);
            g.fillPolygon(x1, y1, 2);
        }
        g.fillPolygon(x2, y2, 5);
    }
    
    public String tipomove(){
        return tipom;
    }
    
    public Point getOrigem(){
        return this.origem;
    }
    
    public Point getPoint(){
        return pt;
    }
    
    public void setPoint(Point pt){
        this.pt=pt;
    }
    
    public void zoom(){
       if(zoom==false){
            this.raioa += 1;
            this.raiob += 1;
       if(this.raioa==100)
           this.zoom=true;
       }
       else{
           this.raioa -= 1;
           this.raiob -= 1;
           if(this.raioa==10)
                this.zoom=false;
       }  
    }


}

