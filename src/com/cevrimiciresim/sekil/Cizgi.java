/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cevrimiciresim.sekil;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Lab
 */
public class Cizgi extends Sekil {

    public Cizgi(Point start, Point end) {
        super(start, end);
    }

    @Override
    public void ciz(Graphics g) {
        g.drawLine((int) start.getX(), (int) start.getY(), (int) end.getX(), (int) end.getY());

    }

}
