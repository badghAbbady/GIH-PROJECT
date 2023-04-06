package ma.uiass.eia.pds.frontend.Test.formChefService;
import ma.uiass.eia.pds.backend.Controleur.LitControlor;
import ma.uiass.eia.pds.backend.Entite.*;
import ma.uiass.eia.pds.frontend.OkHttp.OkHttp;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Form_2 extends javax.swing.JPanel implements ActionListener {


    OkHttp o1 = new OkHttp();
    LitControlor lc = new LitControlor();

    List<Chambre> chambres = o1.chambreList();




    public Form_2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {


        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        okButton = new javax.swing.JButton();
        okButton.addActionListener(this);
        jLabel1 = new javax.swing.JLabel();
        chambreBox = new javax.swing.JComboBox<>();
        chambreLabel = new javax.swing.JLabel();

        nlit = new javax.swing.JLabel();
        codelitBox = new javax.swing.JComboBox<>();
        //group = new ButtonGroup();
        affecterButton = new javax.swing.JButton();
        affecterButton.addActionListener(this);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24));
        jLabel1.setText("Affectation des lits:");

        tableModel= new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{ "Codelit","TypeLit","Etat","EtatPhysique"});
        table.setModel(tableModel);
        jScrollPane1.setViewportView(table);



        okButton.setText("Ok");


        affecterButton.setText("Affecter Lit");











        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int rowIndex = table.getSelectedRow();
                Object nDemande = tableModel.getValueAt(rowIndex, 0);
                List<String> newlst = new ArrayList<>();
                /*for(DetailDemande d : o.getDemande((String) nDemande).getLst()){
                    newlst.add(d.getQuantite()+" lits de type "+d.getType()+"\n");
                }
                JOptionPane.showMessageDialog(null,"Votre demmende contient"+newlst);*/


            }
        });


        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24));
        jLabel1.setText("Affectation:");

        for (Chambre s : chambres) {
            chambreBox.addItem(s.getCode());
        }

        chambreLabel.setText("Chambres:");


        nlit.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        nlit.setText("Num Lit:");


        affecterButton.setVisible(false);
        codelitBox.setVisible(false);
        nlit.setVisible(false);



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(affecterButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nlit)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(8, 8, 8)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)))))

                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addComponent(codelitBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 8, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(52, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(350, 350, 350)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(176, 176, 176)
                                                .addComponent(chambreLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chambreBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(178, 178, 178)
                                                .addGap(121, 121, 121)
                                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chambreBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(okButton)
                                        .addComponent(chambreLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                                .addComponent(nlit)
                                                .addGap(18, 18, 18)
                                                .addComponent(codelitBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)

                                                .addComponent(affecterButton)
                                                .addGap(141, 141, 141))))
        );;
    }// </editor-fold>





    private void loadLit(DefaultTableModel tableModel,List<Lit> lits){
        tableModel.setRowCount(0);
        codelitBox.removeAllItems();

        for(Lit d : lits ){
            codelitBox.addItem(d.getCode());
            //String code = (String)codelitBox.getSelectedItem();
            tableModel.addRow(new Object[]{d.getCode(),d.getTypeLit(),d.getEtat(),d.getEtatPhysique()});
            //o1.affecteLitEspace(code,codeEs);
            //tableModel.fireTableDataChanged();
            //o1.addLitOk();
        }

        affecterButton.setVisible(true);
        codelitBox.setVisible(true);
        nlit.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == affecterButton) {
            String code =(String) codelitBox.getSelectedItem();
            String codeEs=(String)chambreBox.getSelectedItem();
            o1.affecteLitEspace(code,codeEs);
//            lc.getLitEspace(codeEs);
//            chambres = o1.chambreList();

        } else if (e.getSource() == okButton) {
            tableModel.setRowCount(0);
            String codeEs = (String) chambreBox.getSelectedItem();
            List<Lit> lits=o1.getLitByCodeEspace(codeEs);
            loadLit(tableModel,lits);

        }
    }




   /* private void demadeTraite(String code){
        List<DetailDemande> lst = o.getDemande(code).getLst();
        for(DetailDemande d : lst){
            int q = d.getQuantite();
            while (q>0){
                q--;
                o.addLitStock(d.getType(),o.getDemande(code).getService().getNomService());
            }
        }
        o.updateEtatDemande(code,EtatDemande.Traite);


    }*/



    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> chambreBox;
    private javax.swing.JLabel chambreLabel;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> codelitBox;
    private javax.swing.JLabel nlit;
    private DefaultTableModel tableModel;
    private javax.swing.JButton affecterButton;
}

