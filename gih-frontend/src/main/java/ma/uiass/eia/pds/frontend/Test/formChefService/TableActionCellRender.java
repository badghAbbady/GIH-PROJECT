package ma.uiass.eia.pds.frontend.Test.formChefService;

import ma.uiass.eia.pds.backend.Controleur.LitControlor;
import ma.uiass.eia.pds.backend.Entite.EtatLit;
import ma.uiass.eia.pds.backend.Entite.Lit;
import ma.uiass.eia.pds.frontend.OkHttp.OkHttp;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import java.io.File;
import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;

public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSeleted, boolean bln1, int row, int column) {
//        Component com = super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column);
//        PanelAction action = null;
//        try {
//            action = new PanelAction();
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//        if (isSeleted == false && row % 2 == 0) {
//            action.setBackground(Color.WHITE);
//        } else {
//            action.setBackground(com.getBackground());
//        }
//        return action;

//        OkHttp okHttp = new OkHttp();
//        List<Lit> lits = okHttp.getLits();
//        JButton button = new JButton();
//        for (Lit lit : lits) {
//            if (lit.getEtat() == EtatLit.DISPONIBLE) {
//                try {
//                    button.setIcon(new ImageIcon(new File("/Users/mac/pds/gih-frontend/src/main/resources/icon/greenBed.png").toURI().toURL()));
//                } catch (MalformedURLException e) {
//                    throw new RuntimeException(e);
//                }
//            } if(lit.getEtat() == EtatLit.OCCUPE) {
//                try {
//                    button.setIcon(new ImageIcon(new File("/Users/mac/pds/gih-frontend/src/main/resources/icon/redBed.png").toURI().toURL()));
//                } catch (MalformedURLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        return button;
//    }

        super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column);

        // Get the corresponding EtatLit object for the current row
        //OkHttp okHttp = new OkHttp();
        //List<Lit> lits = okHttp.getLits();

        LitControlor lt=new LitControlor();


        List<Lit> lits = lt.getMyLits();
        EtatLit etatLit = lits.get(row).getEtat();
        System.out.println(etatLit);

        // Set the appropriate icon for the cell based on the value of the EtatLit object
        try {
            if (etatLit == EtatLit.DISPONIBLE) {
                setIcon(new ImageIcon(new File("C:\\Users\\dell\\Desktop\\complete project pds\\gih-frontend\\src\\main\\java\\ma\\uiass\\eia\\pds\\frontend\\greenBed.jpg").toURI().toURL()));
            } else {
                setIcon(new ImageIcon(new File("C:\\Users\\dell\\Desktop\\complete project pds\\gih-frontend\\src\\main\\java\\ma\\uiass\\eia\\pds\\frontend\\redBed.jpg").toURI().toURL()));
            }
        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        }

        return this;

    }


}