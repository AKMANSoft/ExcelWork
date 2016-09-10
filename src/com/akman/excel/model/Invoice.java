/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.excel.model;

/**
 * This Class is Invoice. it contains buyer sender Address and orders.
 *
 * @author AKL SOFT
 */
public class Invoice
{

    private String InvoiceNo;
    private String OrderNo;
    private String Date;
    private String TinNo;
    private String ReferenceNo;
    private String CountryOfOrigin;
    private Sender sender;
    private Buyer buyer;
    private Order order;
    private String MOP;
    private String PaymentTerms;
    private String TrackingNo;
    private String CatagoryItem;
    private String Category;

    /**
     *
     * @param InvoiceNo
     * @param OrderNo
     * @param Date
     * @param TinNo
     * @param ReferenceNo
     * @param CountryOfOrigin
     * @param sender
     * @param buyer
     * @param order
     * @param MOP
     * @param PaymentTerms
     * @param TrackingNo
     * @param CatagoryItem
     * @param Category
     */
    public Invoice(String InvoiceNo, String OrderNo, String Date, String TinNo,
            String ReferenceNo, String CountryOfOrigin, Sender sender, Buyer buyer,
            Order order, String MOP, String PaymentTerms, String TrackingNo, String CatagoryItem, String Category)
    {

        this.InvoiceNo = InvoiceNo;
        this.OrderNo = OrderNo;
        this.Date = Date;
        this.TinNo = TinNo;
        this.ReferenceNo = ReferenceNo;
        this.CountryOfOrigin = CountryOfOrigin;
        this.sender = sender;
        this.buyer = buyer;
        this.order = order;
        this.MOP = MOP;
        this.PaymentTerms = PaymentTerms;
        this.TrackingNo = TrackingNo;
        this.CatagoryItem = CatagoryItem;
        this.Category = Category;
    }

    /**
     *
     * @return InvoiceNo
     */
    public String getInvoiceNo()
    {
        return InvoiceNo;
    }

    /**
     *
     * @param InvoiceNo
     */
    public void setInvoiceNo(String InvoiceNo)
    {
        this.InvoiceNo = InvoiceNo;
    }

    /**
     *
     * @return OrderNo
     */
    public String getOrderNo()
    {
        return OrderNo;
    }

    /**
     *
     * @param OrderNo
     */
    public void setOrderNo(String OrderNo)
    {
        this.OrderNo = OrderNo;
    }

    /**
     *
     * @return Date
     */
    public String getDate()
    {
        return Date;
    }

    /**
     *
     * @param Date
     */
    public void setDate(String Date)
    {
        this.Date = Date;
    }

    /**
     *
     * @return TinNo
     */
    public String getTinNo()
    {
        return TinNo;
    }

    /**
     *
     * @param TinNo
     */
    public void setTinNo(String TinNo)
    {
        this.TinNo = TinNo;
    }

    /**
     *
     * @return ReferenceNo
     */
    public String getReferenceNo()
    {
        return ReferenceNo;
    }

    /**
     *
     * @param ReferenceNo
     */
    public void setReferenceNo(String ReferenceNo)
    {
        this.ReferenceNo = ReferenceNo;
    }

    /**
     *
     * @return CountryOfOrigin
     */
    public String getCountryOfOrigin()
    {
        return CountryOfOrigin;
    }

    /**
     *
     * @param CountryOfOrigin
     */
    public void setCountryOfOrigin(String CountryOfOrigin)
    {
        this.CountryOfOrigin = CountryOfOrigin;
    }

    /**
     *
     * @return Sender
     */
    public Sender getSender()
    {
        return sender;
    }

    /**
     *
     * @param sender
     */
    public void setSender(Sender sender)
    {
        this.sender = sender;
    }

    /**
     *
     * @return Buyer
     */
    public Buyer getBuyer()
    {
        return buyer;
    }

    /**
     *
     * @param buyer
     */
    public void setBuyer(Buyer buyer)
    {
        this.buyer = buyer;
    }

    /**
     *
     * @return Order
     */
    public Order getOrder()
    {
        return order;
    }

    /**
     *
     * @param order
     */
    public void setOrder(Order order)
    {
        this.order = order;
    }

    /**
     *
     * @return MOP
     */
    public String getMOP()
    {
        return MOP;
    }

    /**
     *
     * @param MOP
     */
    public void setMOP(String MOP)
    {
        this.MOP = MOP;
    }

    /**
     *
     * @return PaymentTerms
     */
    public String getPaymentTerms()
    {
        return PaymentTerms;
    }

    /**
     *
     * @param PaymentTerms
     */
    public void setPaymentTerms(String PaymentTerms)
    {
        this.PaymentTerms = PaymentTerms;
    }

    public String getTrackingNo()
    {
        return TrackingNo;
    }

    public void setTrackingNo(String TrackingNo)
    {
        this.TrackingNo = TrackingNo;
    }
    
    public String getCatagoryItem() {
        return CatagoryItem;
    }
    
    /**
     *
     * @param CatagoryItem
     */

    public void setCatagoryItem(String CatagoryItem) {
        this.CatagoryItem = CatagoryItem;
    }

    
    public String getCategory() {
        return Category;
    }

    /**
     *
     * @param Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * 
     *
     * @return Invoice class. 
     */
    @Override
    public String toString() {
        return "Invoice{" + "InvoiceNo=" + InvoiceNo + ", OrderNo=" + OrderNo + ", Date=" + Date + ", TinNo=" + TinNo + ", ReferenceNo=" + ReferenceNo + ", CountryOfOrigin=" + CountryOfOrigin + ", sender=" + sender + ", buyer=" + buyer + ", order=" + order + ", MOP=" + MOP + ", PaymentTerms=" + PaymentTerms + ", TrackingNo=" + TrackingNo + '}';
    }

    
    

}
