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
}
