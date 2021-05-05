/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class PTB1 {
    //1
    private float hsa;
    private float hsb;

    public float getHsa() {
        return hsa;
    }

    public void setHsa(float hsa) {
        this.hsa = hsa;
    }

    public float getHsb() {
        return hsb;
    }

    public void setHsb(float hsb) {
        this.hsb = hsb;
    }

    public PTB1(float hsa, float hsb) {
        this.hsa = hsa;
        this.hsb = hsb;
    }
    
    public String GiaiB1() {
        if(hsa == 0) {
            if(hsb == 0) {
                return "Phuong trinh vo nghiem";
            } else {
                return "PT vo nghiem";
            }
        } else {
            return "x = " + (-hsb / hsa);
        }
    }
}
