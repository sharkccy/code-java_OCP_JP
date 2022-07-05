/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;

/**
 *
 * @author FH
 */
public class Member implements Serializable {
    int id;
    String name;
    String tel;

    public Member(int id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", tel = " + tel;
    }    
}
