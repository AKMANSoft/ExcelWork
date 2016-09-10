/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.excel.model;

/**
 * This Class Contain Buyer's Address of the Invoice.
 * 
 * @author AKL SOFT
 */
public class Buyer {
    
    private String Name;
    private String Address1;
    private String Address2;
    private String Address3;
    private String City;
    private String State;
    private String PinCode;
    private String PhoneNo;
    private String Country;
    
    /**
     * 
     * @param Name
     * @param Address1
     * @param Address2
     * @param Address3
     * @param City
     * @param State
     * @param PinCode
     * @param PhoneNo
     * @param Country 
     */

    public Buyer(String Name, String Address1, String Address2, String Address3, String City, String State, String PinCode, String PhoneNo, String Country) {
        this.Name = Name;
        this.Address1 = Address1;
        this.Address2 = Address2;
        this.Address3 = Address3;
        this.City = City;
        this.State = State;
        this.PinCode = PinCode;
        this.PhoneNo = PhoneNo;
        this.Country = Country;
    }
    
    /**
     * 
     * @return Name
     */

    public String getName() {
        return Name;
    }
    
    /**
     * 
     * @param Name 
     */

    public void setName(String Name) {
        this.Name = Name;
    }
    
    /**
     * 
     * @return Address1
     */

    public String getAddress1() {
        return Address1;
    }
    
    /**
     * 
     * @param Address1 
     */

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }
    
    /**
     * 
     * @return Address2
     */

    public String getAddress2() {
        return Address2;
    }
    
    /**
     * 
     * @param Address2 
     */

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }
    
    /**
     * 
     * @return Address3
     */

    public String getAddress3() {
        return Address3;
    }
    
    /**
     * 
     * @param Address3 
     */

    public void setAddress3(String Address3) {
        this.Address3 = Address3;
    }
    
    /**
     * 
     * @return City
     */

    public String getCity() {
        return City;
    }
    
    /**
     * 
     * @param City 
     */

    public void setCity(String City) {
        this.City = City;
    }
    
    /**
     * 
     * @return State
     */

    public String getState() {
        return State;
    }
    
    /**
     * 
     * @param State 
     */

    public void setState(String State) {
        this.State = State;
    }
    
    /**
     * 
     * @return PinCode
     */

    public String getPinCode() {
        return PinCode;
    }
    
    /**
     * 
     * @param PinCode 
     */

    public void setPinCode(String PinCode) {
        this.PinCode = PinCode;
    }
    
    /**
     * 
     * @return PhoneNo
     */

    public String getPhoneNo() {
        return PhoneNo;
    }
    
    /**
     * 
     * @param PhoneNo 
     */

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
    
    /**
     * 
     * @return Country
     */

    public String getCountry() {
        return Country;
    }
    
    /**
     * 
     * @param Country 
     */

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return "Buyer{" + "Name=" + Name + ", Address1=" + Address1 + ", Address2=" + Address2 + ", Address3=" + Address3 + ", City=" + City + ", State=" + State + ", PinCode=" + PinCode + ", PhoneNo=" + PhoneNo + ", Country=" + Country + '}';
    }
    
    
    
}
