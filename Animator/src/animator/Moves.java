/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author cassiano
 */
public class Moves {
    private Dimension dim;
    
    public Moves(Dimension dim){
        this.dim = dim;
    }
    
    public Point linear(Point pt){
        pt.setLocation(pt.getX()+1, pt.getY());
        if(pt.getX() > dim.height){
            pt.setLocation(0,pt.getY());
        }
        return pt;
    }
    
    public Point rotation(Point p, Point origem, double angulo){
    double angleRad = (angulo/180)*Math.PI;
    double cosAngle = Math.cos(angleRad );
    double sinAngle = Math.sin(angleRad );
    double dx = (p.x);
    double dy = (p.y);
    
    p.x = (int) (origem.x + 60 * Math.cos(angulo));
    p.y = (int) (origem.y + 60 * Math.sin(angulo));
    
    //System.out.println("anglerad: "+ angleRad +" cosAngle: " +cosAngle+ " sinAngle:" +sinAngle+ " dx: " +dx+ " dy: " +dy);
    
    return p;
    }
}
