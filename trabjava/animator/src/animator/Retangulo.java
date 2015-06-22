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
public class Retangulo {
    
    private int x;
    private int y;
    private Point pt;
    private String tipom;
    
    public Retangulo (Point pt, int x, int y, String tipom){
        this.pt = pt;
        this.tipom= tipom;
        this.x = x;
        this.y = y;
    }
    public void desenhart(Graphics a){
        a.setColor(Color.yellow);
        a.fillRect(pt.x, pt.y, x, y);
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
