package ma.uiass.eia.pds.frontend.Test.formChefService;

import ma.uiass.eia.pds.frontend.Table.PanelAction;
import ma.uiass.eia.pds.frontend.Table.TableActionEvent;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;

public class TableActionCellEditor extends DefaultCellEditor {

    private TableActionEvent event;

    public TableActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        PanelAction action = null;
        action = new PanelAction();
        action.initEvent( event, row);
        action.setBackground(jtable.getSelectionBackground());
        return action;
    }
}