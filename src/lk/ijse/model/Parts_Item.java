/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.model;

/**
 *
 * @author Yasiru Sachintha
 */
public class Parts_Item {
    private String Parts_id;
    private int QTY;
    private double  unitPrice;
    
    
    public Parts_Item(){
        
    }

    public Parts_Item(String Parts_id, int QTY, double unitPrice) {
        this.Parts_id = Parts_id;
        this.QTY = QTY;
        this.unitPrice = unitPrice;
    }

    /**
     * @return the Parts_id
     */
    public String getParts_id() {
        return Parts_id;
    }

    /**
     * @param Parts_id the Parts_id to set
     */
    public void setParts_id(String Parts_id) {
        this.Parts_id = Parts_id;
    }

    /**
     * @return the QTY
     */
    public int getQTY() {
        return QTY;
    }

    /**
     * @param QTY the QTY to set
     */
    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Object getunitPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
