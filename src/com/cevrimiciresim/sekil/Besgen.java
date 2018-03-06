/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cevrimiciresim.sekil;

import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author HP
 */
public class Besgen extends Sekil {

    public Besgen(Point start, Point end) {

        super(start, end);
    }

    @Override
    public void ciz(Graphics g) {
          int[]x={(int)start.getX(),
             (int)Math.abs (start.getX() + (end.getX() - start.getX()) / 4),
            (int) Math.abs(start.getX() + (end.getX() - start.getX()) / 2),
            (int)end.getX(),(int)Math.abs (start.getX() + (end.getX() - start.getX()) ),
             (int) Math.abs(start.getX()+(end.getX() - start.getX()) / 2)
            };
        
        
        int[]y={(int)end.getY(),(int)Math.abs (start.getY() + (end.getY() - start.getY()) / 4),
            (int)start.getY(),(int) Math.abs(start.getY() + (end.getY() - start.getY()) / 4),
           (int)end.getY(),(int)end.getY()};
        
        g.drawPolygon(x, y, 6);
        
        
    }

}
