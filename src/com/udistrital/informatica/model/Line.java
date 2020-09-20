package com.udistrital.informatica.model;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.LinkedList;

/**
 *
 * @author dario.escobar
 */
public class Line {
    /** Line color */
    private Color color = Color.black;
    
    /** Size pencil */
    private int sizeLine = 5;

        /** List of trace points */
    private LinkedList<Point2D> PointLine = new LinkedList<Point2D>();

    /** Add a new point */
    public void addPunto(Point2D punto){
        PointLine.add(punto);
    }

    /** Returns the list of points */
    public LinkedList<Point2D> getPuntos() {
        return PointLine;
    }

    /** Returns how many points the line */
    public int getNumeroPuntos(){
        return PointLine.size();
    }

    /** add new point*/
    public void addPunto(int x, int y){
        Point2D p = new Point2D.Float(x, y);
        PointLine.add(p);
    }

    /** Returns the point of the list in the indicated position*/
    public Point2D getPunto(int position){
        return PointLine.get(position);
    }

   
     public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }
    
    public int getSizeLine() {
        return sizeLine;
    }

    public void setSizeLine(int sizeLine) {
        this.sizeLine = sizeLine;
    }
    
}
