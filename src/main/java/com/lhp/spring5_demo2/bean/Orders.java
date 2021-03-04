package com.lhp.spring5_demo2.bean;

/**
 * @author 53137
 */
public class Orders {
    private String oName;
    private String oAddress;

    public Orders(String oName, String oAddress) {
        this.oName = oName;
        this.oAddress = oAddress;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oName='" + oName + '\'' +
                ", oAddress='" + oAddress + '\'' +
                '}';
    }
}
