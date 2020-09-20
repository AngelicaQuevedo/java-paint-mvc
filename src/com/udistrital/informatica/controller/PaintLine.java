
package com.udistrital.informatica.controller;

import com.udistrital.informatica.model.InterfaceDragMouse;
import com.udistrital.informatica.model.Line;
import java.awt.Color;
import java.awt.Component;
import java.util.LinkedList;

/**
 *
 * @author dario.escobar
 */
public class PaintLine implements InterfaceDragMouse{
    /** List of line */
    private LinkedList<Line> line;

    /** Current line */
    private Line currentLine = null;

    /** canvas call repaint() 
     */
    private Component lienzo;

    /** Current color used */
    private Color currentColor = Color.black;
    
    /** Current size used */
    private int currentSize = 5;

    
    /** @param line list the new lines
     * @param lienzo call this componente as a line is built 
     */
    public PaintLine(LinkedList<Line> line, Component lienzo)
    {
        this.line = line;
        this.lienzo = lienzo;
    }

    /**
     * create a new line and place it as the first x and y
     */
    @Override
    public void startDrag(int x, int y)
    {
        currentLine = new Line();
        currentLine.setColor(currentColor);
        currentLine.setSizeLine(currentSize);
        currentLine.addPunto(x, y);
        line.add(currentLine);
        lienzo.repaint();
    }

    /** This method Add a new point to the current trace */
    public void drag(int xOld, int yOld, int xNew, int yNew)
    {
        currentLine.addPunto(xNew, yNew);
        lienzo.repaint();
    }

    /** Marks that there is no current line */
    public void endDrag(int x, int y)
    {
        currentLine = null;
    }

    /** Save the color for the next line */
    public void setCurrentColor(Color currentColor){
        this.currentColor = currentColor;
    }    
    
    /** Save the size for the next line */
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
}
