/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cevrimiciresim;

import com.cevrimiciresim.sekil.*;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class MyCanvas extends Canvas implements MouseMotionListener, MouseListener {

    enum CIZIM_MODU {
        KARE, DIKDORTGEN, COKLUCIZGI, CIZGI, OVAL, YAY, YILDIZ, UCGEN,DIKUCGEN,YUVARLAKDORTGEN
    }

    CIZIM_MODU suankiMod = CIZIM_MODU.CIZGI;

    ArrayList<Sekil> list = new ArrayList();

    public MyCanvas() {
        setBackground(Color.white);

        addMouseMotionListener(this);
        addMouseListener(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        for (Sekil sekil : list) {
            sekil.ciz(g);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (!list.isEmpty()) {
            if (suankiMod == CIZIM_MODU.KARE || suankiMod == CIZIM_MODU.DIKDORTGEN
                    || suankiMod == CIZIM_MODU.CIZGI || suankiMod == CIZIM_MODU.OVAL || suankiMod == CIZIM_MODU.YAY
                    || suankiMod == CIZIM_MODU.YILDIZ || suankiMod == CIZIM_MODU.UCGEN || suankiMod == CIZIM_MODU.DIKUCGEN || suankiMod == CIZIM_MODU.YUVARLAKDORTGEN) {
                {
                    list.get(list.size() - 1).end = e.getPoint();
                }
            } else if (suankiMod == CIZIM_MODU.COKLUCIZGI && list.get(list.size() - 1) instanceof CokluCizgi) {
                CokluCizgi cg = (CokluCizgi) list.get(list.size() - 1);
                cg.addPoint(e.getPoint());

            }

            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // System.out.println("Moved:"+e.getX() + " " + e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (suankiMod == CIZIM_MODU.CIZGI) {
            list.add(new Cizgi(e.getPoint(), e.getPoint()));
        } else if (suankiMod == CIZIM_MODU.DIKDORTGEN) //dikdortgen
        {
            list.add(new Dikdortgen(e.getPoint(), e.getPoint()));

        } else if (suankiMod == CIZIM_MODU.COKLUCIZGI) //CokluCizgi
        {
            CokluCizgi cg = new CokluCizgi();
            cg.addPoint(e.getPoint());
            list.add(cg);
        } else if (suankiMod == CIZIM_MODU.OVAL) {
            list.add(new Oval(e.getPoint(), e.getPoint()));

        } else if (suankiMod == CIZIM_MODU.YAY) {
            list.add(new Yay(e.getPoint(), e.getPoint()));

        } else if (suankiMod == CIZIM_MODU.YILDIZ) {
            list.add(new Yildiz(e.getPoint(), e.getPoint()));

        } else if (suankiMod == CIZIM_MODU.UCGEN) {
            list.add(new Ucgen(e.getPoint(), e.getPoint()));
        }
         else if (suankiMod == CIZIM_MODU.DIKUCGEN) {
            list.add(new DikUcgen(e.getPoint(), e.getPoint()));
        }
         else if (suankiMod == CIZIM_MODU.YUVARLAKDORTGEN) //dikdortgen
        {
            list.add(new YuvarlakDortgen(e.getPoint(), e.getPoint()));

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

}
