/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.excel.model;

/**
 * This class contain order information of the invoice.
 *
 * @author AKL SOFT
 */
public class Order
{

    private String PakegeType;
    private Double Quantity;
    private Double Rate;
    private String Description;

    /**
     *
     * @param PakegeType
     * @param Quantity
     * @param Rate
     * @param Description
     */
    public Order(String PakegeType, Double Quantity, Double Rate, String Description)
    {
        this.PakegeType = PakegeType;
        this.Quantity = Quantity;
        this.Rate = Rate;
        this.Description = Description;
    }

    /**
     *
     * @return PakegeType
     */
    public String getPakegeType()
    {
        return PakegeType;
    }

    /**
     *
     * @param PakegeType
     */
    public void setPakegeType(String PakegeType)
    {
        this.PakegeType = PakegeType;
    }

    /**
     *
     * @return Quantity
     */
    public Double getQuantity()
    {
        return Quantity;
    }

    /**
     *
     * @param Quantity
     */
    public void setQuantity(Double Quantity)
    {
        this.Quantity = Quantity;
    }

    /**
     *
     * @return Rate
     */
    public Double getRate()
    {
        return Rate;
    }

    /**
     *
     * @param Rate
     */
    public void setRate(Double Rate)
    {
        this.Rate = Rate;
    }

    /**
     *
     * @return Description
     */
    public String getDescription()
    {
        return Description;
    }

    /**
     *
     * @param Description
     */
    public void setDescription(String Description)
    {
        this.Description = Description;
    }

    /**
     * This Function Return the Total Amount by Multiply Quantity and Rate.
     *
     * @return TotalAmount
     */
    public double totalAmount()
    {

        return Quantity * Rate;
    }

    @Override
    public String toString() {
        return "Order{" + "PakegeType=" + PakegeType + ", Quantity=" + Quantity + ", Rate=" + Rate + ", Description=" + Description + '}';
    }

    
}
