/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.excel.controller;


import com.akman.excel.model.Invoice;
import com.akman.excel.utils.Javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author AKL SOFT
 */
public class CURDInvoice {

    public static void Save(Invoice inv) {
        
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            
            String sql = "INSERT INTO Invoice "
                    + "(InvoiceNo,OrderNo, Date,TinNo,ReferenceNo,CountryOfOrigin,MOP,PaymentTerms,TrackingNo,S_Name,"
                    + "	S_Address1, S_Address2, S_Address3, S_City, S_State, S_PinCode, S_PhoneNo, S_Country, B_Name, B_Address1, B_Address2, B_Address3, B_City,"
                    + "	B_State, B_PinCode,	B_PhoneNo, B_Country, PakegeType, Quantity, Rate, Description, CatagoryItem, Category)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            pst = conn.prepareStatement(sql);

            pst.setString(1, inv.getInvoiceNo());
            pst.setString(2, inv.getOrderNo());
            pst.setString(3, inv.getDate());
            pst.setString(4, inv.getTinNo());
            pst.setString(5, inv.getReferenceNo());
            pst.setString(6, inv.getCountryOfOrigin());
            pst.setString(7, inv.getMOP());
            pst.setString(8, inv.getPaymentTerms());
            pst.setString(9, inv.getTrackingNo());            
            pst.setString(10, inv.getSender().getName());
            pst.setString(11, inv.getSender().getAddress1());
            pst.setString(12, inv.getSender().getAddress2());
            pst.setString(13, inv.getSender().getAddress3());
            pst.setString(14, inv.getSender().getCity());
            pst.setString(15, inv.getSender().getState());
            pst.setString(16, inv.getSender().getPinCode());
            pst.setString(17, inv.getSender().getPhoneNo());
            pst.setString(18, inv.getSender().getCountry());
            pst.setString(19, inv.getBuyer().getName());
            pst.setString(20, inv.getBuyer().getAddress1());
            pst.setString(21, inv.getBuyer().getAddress2());
            pst.setString(22, inv.getBuyer().getAddress3());
            pst.setString(23, inv.getBuyer().getCity());
            pst.setString(24, inv.getBuyer().getState());
            pst.setString(25, inv.getBuyer().getPinCode());
            pst.setString(26, inv.getBuyer().getPhoneNo());
            pst.setString(27, inv.getBuyer().getCountry());
            pst.setString(28, inv.getOrder().getPakegeType());
            pst.setDouble(29, inv.getOrder().getQuantity());
            pst.setDouble(30, inv.getOrder().getRate());
            pst.setString(31, inv.getOrder().getDescription());
            pst.setString(32, inv.getCatagoryItem());
            pst.setString(33, inv.getCategory());

            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CURDInvoice.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
    }
    
    public static void Delete(){
        
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String sql1 = "DELETE  FROM Invoice";
            pst = conn.prepareStatement(sql1);
            pst.execute();
            

        } catch (SQLException ex) {
            Logger.getLogger(CURDInvoice.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
    }

}
