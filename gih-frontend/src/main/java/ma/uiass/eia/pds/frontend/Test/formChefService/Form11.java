/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ma.uiass.eia.pds.frontend.Test.formChefService;

import ma.uiass.eia.pds.backend.Controleur.LitControlor;
import ma.uiass.eia.pds.backend.Entite.Chambre;
import ma.uiass.eia.pds.backend.Entite.Identifiant;
import ma.uiass.eia.pds.backend.Entite.Lit;
import ma.uiass.eia.pds.frontend.OkHttp.OkHttp;
import ma.uiass.eia.pds.frontend.Table.TableActionEvent;
import ma.uiass.eia.pds.frontend.Test.model.StatusType;
import ma.uiass.eia.pds.frontend.Test.swing.PanelBorder;
import ma.uiass.eia.pds.frontend.Test.swing.ScrollBar;
import ma.uiass.eia.pds.frontend.Test.swing.Table;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author dell
 */
public class Form11 extends JPanel {
    OkHttp o = new OkHttp();
    LitControlor lt=new LitControlor();
    List<Chambre> ch = o.chambreList();

    List<Chambre> chambres =o.chambreList();


    public Form11() {
        setLayout(null);

        JButton btnNewButton = new JButton("accéder aux lits");
        btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBackground(new java.awt.Color(0, 153, 255));
        btnNewButton.setOpaque(false);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // Récupération de l'indice de la ligne sélectionnée
                String firstValue = (String) table.getValueAt(selectedRow, 0);
                tableModel.setColumnIdentifiers(new String[]{"Code", "Etat", "EtatPhysique", "Type"});
                loadLits(tableModel, firstValue);
                jLabel1.setText("les lits");
                btnNewButton_1.setVisible(true);
                // Récupération de la première valeur de la ligne sélectionné
            }
        });
        btnNewButton.setBounds(494, 538, 139, 23);
        add(btnNewButton);


        btnNewButton_1.setBackground(new java.awt.Color(0, 153, 255));
        btnNewButton_1.setOpaque(false);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnNewButton_1.setBounds(260, 538, 125, 23);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadChambre(tableModel);
                btnNewButton_1.setVisible(false);
                jLabel1.setText("Les chambres");
                // Récupération de la première valeur de la ligne sélectionnée

            }
        });
        add(btnNewButton_1);

        initComponents();
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        panelBorder1 = new PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new JScrollPane();
        table = new Table();

        setBackground(new Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        panelBorder1.setBackground(new Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(127, 127, 127));
        jLabel1.setText("Les Chambres");

        spTable.setBorder(null);
        loadChambre(tableModel);
        setLayout(null);
        table.setModel(tableModel);
        spTable.setViewportView(table);
         class CustomCellRenderer extends DefaultTableCellRenderer {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (isSelected) {
                    setBackground(Color.BLUE);
                    setForeground(Color.WHITE);
                } else {
                    setBackground(table.getBackground());
                    setForeground(table.getForeground());
                }

                return this;
            }
        }
        table.setDefaultRenderer(Object.class, new CustomCellRenderer());


        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(spTable))
                                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
                panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)


                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
        );

    }//// </editor-fold>//GEN-END:initComponents

    private void loadChambre(DefaultTableModel tableModel) {
        tableModel.setRowCount(0);
        for (Chambre c : ch) {
            tableModel.setColumnIdentifiers(new String[]{"Code", "Quantite", "Service", "Type"});
            Object[] row = new Object[]{c.getCode(), c.getQuantite(), c.getService().getNomService(), c.getType()};
            tableModel.addRow(row);
        }
    }

    private void loadLits(DefaultTableModel tableModel, String code) {
        tableModel.setRowCount(0);
        List<Lit> lits = lt.getLitEspace(code);
        for (Lit c : lits) {
            Object[] row = new Object[]{c.getCode(), null, c.getEtatPhysique(), c.getTypeLit()};
            TableActionEvent event = new TableActionEvent() {
                @Override
                public void onEdit(int row) {
                    System.out.println("Edit row : " + row);
                }
                @Override
                public void onDelete(int row) {
                }
                @Override
                public void onView(int row) {

                }

            };



            tableModel.addRow(row);
            table.getColumnModel().getColumn(1).setCellRenderer(new TableActionCellRender());
            table.getColumnModel().getColumn(1).setCellEditor(new TableActionCellEditor(event));


        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
   /* private Card card1;
    private Card card2;
    private Card card3;*/
    private javax.swing.JLabel jLabel1;
    private JLayeredPane panel;
    private PanelBorder panelBorder1;
    private JScrollPane spTable;
    private Table table;

    private javax.swing.JButton jButton1;
   private  DefaultTableModel tableModel = new DefaultTableModel();

    JButton btnNewButton_1 = new JButton("<- Back ");
}

