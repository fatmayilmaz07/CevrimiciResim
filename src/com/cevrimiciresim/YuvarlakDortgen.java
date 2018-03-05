/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cevrimiciresim;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Teknosa
 */
public class YuvarlakDortgen extends Sekil{

    public YuvarlakDortgen(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void ciz(Graphics g) {
      
     
        if (end.getX() > start.getX() && end.getY() > start.getY()) {
            g.drawRoundRect((int) start.getX(), (int) start.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()),50,50);
        } else if (start.getX() > end.getX() && start.getY() > end.getY()) {
            g.drawRoundRect((int) end.getX(), (int) end.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()),50,50);
        } else if (end.getX() < start.getX() && end.getY() > start.getY()) {
            g.drawRoundRect((int) end.getX(), (int) start.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()),50,50);
        } else {
            g.drawRoundRect((int) start.getX(), (int) end.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()),50,50);
        }

        
    }
    
}
