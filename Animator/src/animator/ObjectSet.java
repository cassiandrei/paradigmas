package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Moves moves;
    private Image[] images;
    Random rm = new Random();
    
    public ObjectSet(Dimension dim){
        moves = new Moves(dim);
    }
    private double angulo;
    ArrayList<Retangulo> Lista1 = new ArrayList<Retangulo>();
    ArrayList<Circulo> Lista2 = new ArrayList<Circulo>();
    ArrayList<Estrela>Lista3 = new ArrayList<Estrela>();
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p = new Point(rm.nextInt(500),rm.nextInt(500));
            images[i] = new Image(p, image, path);
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addStars(int n, Dimension dim, String path) {
        int i;
        for(i=0;i<n;i++){
            Point pt3 = new Point(rm.nextInt(500),rm.nextInt(500));
            Estrela est = new Estrela(pt3, 50, 100, path);
            Lista3.add(est);
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String path) {
        int i;
        for(i=0;i<n;i++){
            Point pt = new Point(rm.nextInt(500),rm.nextInt(500));
            Retangulo rt = new Retangulo(pt, 200, 100, path);
            Lista1.add(rt);
            
        }
        
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        int i;
        for(i=0;i<n;i++){
            Point pt2 = new Point(rm.nextInt(500),rm.nextInt(500));
            Circulo cr;
            cr = new Circulo(pt2, 50, path);
            Lista2.add(cr);
            
        }
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        int i;
        System.out.println("drawAll");
        if(Lista1!=null){
            for(i=0;i<Lista1.size();i++){
                Lista1.get(i).desenhart(g);
            }
        }
        
        if(Lista2!=null){
            for(i=0;i<Lista2.size();i++){
                Lista2.get(i).desenhac(g);
            }
        }
        
        if(Lista3!=null){
            for(i=0;i<Lista3.size();i++){
                Lista3.get(i).desenhaest(g);
            }
        }
        if(images != null){
            for(i=0;i<images.length;i++){
                images[i].draw(g);
            }
        }
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        int i;
        System.out.println("moveAll");
        if(Lista1!=null){
            for(i=0;i<Lista1.size();i++){
                if(Lista1.get(i).tipomove().equals("Line"))
                    Lista1.get(i).setPoint(moves.linear(Lista1.get(i).getPoint()));
                if(Lista1.get(i).tipomove().equals("Circle")){
                    Lista1.get(i).setPoint(moves.rotation(Lista1.get(i).getPoint(), Lista1.get(i).getOrigem(), angulo));
                    angulo+= 0.1;
                }
                if(Lista1.get(i).tipomove().equals("Zoom")){
                    Lista1.get(i).zoom();
                }
            }           
        }
        if(Lista2!=null){
            for(i=0;i<Lista2.size();i++){
                if(Lista2.get(i).tipomove().equals("Line"))
                Lista2.get(i).setPoint(moves.linear(Lista2.get(i).getPoint()));
                if(Lista2.get(i).tipomove().equals("Circle")){
                    Lista2.get(i).setPoint(moves.rotation(Lista2.get(i).getPoint(), Lista2.get(i).getOrigem(), angulo));
                    angulo+= 0.1;
                }
                if(Lista2.get(i).tipomove().equals("Zoom")){
                    Lista2.get(i).zoom();
                }                
            }    
        }
            if(Lista3!=null){
            for(i=0;i<Lista3.size();i++){
                if(Lista3.get(i).tipomove().equals("Line"))
                    Lista3.get(i).setPoint(moves.linear(Lista3.get(i).getPoint()));
                if(Lista3.get(i).tipomove().equals("Circle")){
                    Lista3.get(i).setPoint(moves.rotation(Lista3.get(i).getPoint(), Lista3.get(i).getOrigem(), angulo));
                    angulo+= 0.1;
                }
                if(Lista3.get(i).tipomove().equals("Zoom")){
                    Lista3.get(i).zoom();
                }
            }           
        }
        
        
        if(images!=null){
            for(i=0;i<images.length;i++){
                if(images[i].tipomove().equals("Line"))
                images[i].setPoint(moves.linear(images[i].getPoint()));
                if(images[i].tipomove().equals("Circle"))
                images[i].setPoint(moves.rotation(images[i].getPoint(),images[i].getOrigem(), angulo));
                angulo+=0.1;
            }
        }
    }
    
}