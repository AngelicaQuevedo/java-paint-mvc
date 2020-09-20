
package com.udistrital.informatica.model;

/**
 *
 * @author dario.escobar
 */
public interface InterfaceDragMouse {
    /**
     * This method is called when the mouse starts to drag.
     * @param x the mouse.
     * @param y the mouse.
     */
    public void startDrag(int x, int y);

    /**
     * This method is called every time the mouse is dragged.
     * @param xOld x of the mouse before dragging
     * @param yOld y of the mouse before dragging
     * @param xNew mouse current x
     * @param yNew mouse current y
     */
    public void drag(int xOld, int yOld, int xNew, int yNew);

    /**
     * This method is called when the mouse is finished dragging.
     * @param x x of the mouse.
     * @param y y of the mouse.
     */
    public void endDrag(int x, int y);    
}
