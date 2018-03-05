/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cevrimiciresim;

import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author HP
 */
public class DikUcgen extends Sekil {

    public DikUcgen(Point start, Point end) {
        super(start, end);
    }


    @Override
    public void ciz(Graphics g) {

        int x[] = {(int) start.getX(), (int) start.getX(), (int) end.getX()};
        int y[] = {(int) start.getY(), (int) end.getY(), (int) end.getY()};
        g.drawPolygon(x, y, 3);

    }

}
