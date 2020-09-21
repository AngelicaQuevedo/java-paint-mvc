package com.udistrital.informatica.controller;

import com.udistrital.informatica.model.CircleFigure;
import com.udistrital.informatica.model.StrokeFigure;
import com.udistrital.informatica.model.RectangleFigure;
import com.udistrital.informatica.model.TriangleFigure;
import com.udistrital.informatica.view.MainWindow;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;


/**
 * Class MainViewController 
 * @author angelicaquevedo
 * 12/09/2020
 * v 1.1
 */
public class MainViewController implements MouseListener, ActionListener, MouseMotionListener {
    
    /**
     * The Main Window
     */
    private final MainWindow mainWindow;
    /**
     * The suggested color choose message 
     */
    final static String MESSAGE = "You must choose a color";
    /**
     * The choice color message
     */
    final static String RESULT_MESSAGE = "Choice of color";
    /**
     * The invalid figure type message
     */
    final static String INVALID_TYPE = "Invalid type of shape";
    /**
     * The Figure selected message
     */
    final static String FIGURE_SELECTED = "Figure selection";
    
    /**
     * The Constructor
     * @param mainWindow
     */
    public MainViewController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(!mainWindow.getBtnGenerate().isEnabled()){
            if (mainWindow.getjTextBackgroundColor().getBackground().equals(Color.white)) {
                    mainWindow.displayResult(MESSAGE, RESULT_MESSAGE);
                    return;
                }
                switch (mainWindow.getCboFigureType().getSelectedIndex()) {
                    case 1:
                        createNewTriangle(e.getX(), e.getY());
                        break;
                    case 2:
                        createNewRectangle(e.getX(), e.getY());
                        break;
                    case 3:
                        createNewCircle(e.getX(), e.getY());
                        break;
                    default:
                        mainWindow.displayResult(INVALID_TYPE, FIGURE_SELECTED);
                        return;
                }
            mainWindow.getCanvas().repaint();
        }        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(!mainWindow.getjBtnEraser().isEnabled()){
            createEraser(e.getX(), e.getY());
            mainWindow.getCanvas().repaint();
        }else if (!mainWindow.getjBtnPencil().isEnabled()){
            if (mainWindow.getjTextBackgroundColor().getBackground().equals(Color.white)) {
                mainWindow.displayResult(MESSAGE, RESULT_MESSAGE);
                return;
            }
            createPencil(e.getX(), e.getY());
            mainWindow.getCanvas().repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        if(!mainWindow.getjBtnEraser().isEnabled()){
            createEraser(e.getX(), e.getY());
            mainWindow.getCanvas().repaint();
        }else if (!mainWindow.getjBtnPencil().isEnabled()){
            if (mainWindow.getjTextBackgroundColor().getBackground().equals(Color.white)) {
                mainWindow.displayResult(MESSAGE, RESULT_MESSAGE);
                return;
            }
            createPencil(e.getX(), e.getY());
            mainWindow.getCanvas().repaint();
        }               
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();      
                        
            if (boton == mainWindow.getBtnGenerate()) {
                mainWindow.getjBtnEraser().setEnabled(true);
                mainWindow.getjBtnPencil().setEnabled(true);
                mainWindow.getBtnGenerate().setEnabled(false);
            }
            
            if (boton == mainWindow.getjBtnClearCanvas()) {
                mainWindow.getCanvas().getListaFiguras().clear();
            }
            
            if (boton == mainWindow.getjBtnEraser()) {
                mainWindow.getjBtnEraser().setEnabled(false);
                mainWindow.getjBtnPencil().setEnabled(true); 
                mainWindow.getBtnGenerate().setEnabled(true);
            }
            
            if (boton == mainWindow.getjBtnPencil()) {
                mainWindow.getjBtnEraser().setEnabled(true);
                mainWindow.getjBtnPencil().setEnabled(false);
                mainWindow.getBtnGenerate().setEnabled(true);
            }
           
         mainWindow.getCanvas().repaint();   
        }        
    }

    private TriangleFigure createNewTriangle (Integer pointX, Integer pointY) {
        TriangleFigure tria = new TriangleFigure(mainWindow.getjTextBackgroundColor().getBackground(), "Adding a new rectangle", pointX, pointY);
        mainWindow.getCanvas().getListaFiguras().add(tria);
        return tria;

    }

    private RectangleFigure createNewRectangle(Integer pointX, Integer pointY) {
        RectangleFigure squ = new RectangleFigure(mainWindow.getjTextBackgroundColor().getBackground(), "Adding a new rectangle", pointX, pointY);
        mainWindow.getCanvas().getListaFiguras().add(squ);
        return squ;
    }

    private CircleFigure createNewCircle(Integer pointX, Integer pointY) {
        CircleFigure cir = new CircleFigure(mainWindow.getjTextBackgroundColor().getBackground(), "Adding a new rectangle", pointX, pointY, 100);
        mainWindow.getCanvas().getListaFiguras().add(cir);
        return cir;
    }
    
    private StrokeFigure createEraser(Integer pointX, Integer pointY) {
        StrokeFigure era = new StrokeFigure(Color.white, "Starting a new eraser", pointX, pointY,30);
        mainWindow.getCanvas().getListaFiguras().add(era);
        return era;
    }
    
    private StrokeFigure createPencil(Integer pointX, Integer pointY) {
        StrokeFigure pen = new StrokeFigure(mainWindow.getjTextBackgroundColor().getBackground(), "Starting a new pencil", pointX, pointY,Integer.parseInt((String) mainWindow.getCboLineSize().getSelectedItem()));
        mainWindow.getCanvas().getListaFiguras().add(pen);
        return pen;
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
