package animator;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {

    BufferedImage img;
    Point pos;
    String tipom;
    private Point origem;
    
    public Image(Point pos, BufferedImage img, String tipom) {
        this.pos = pos;
        this.img = img;
        this.tipom = tipom;
        this.origem = (Point) pos.clone();
        this.origem.x += 100;
        this.origem.y += 100;
    }

    public Point getPos() {
        return pos;
    }
    
    public Point getOrigem(){
        return this.origem;
    }
    
    public void draw(Graphics g) {
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }
   

    public String tipomove(){
        return tipom;
    }
    
    public Point getPoint(){
        return pos;
    }
    
    public void setPoint(Point pt){
        this.pos=pt;
    }
}
