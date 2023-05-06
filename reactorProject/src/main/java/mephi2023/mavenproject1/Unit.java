/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Kseny
 */
public class Unit {

    public double getLoad_factor() {
        return load_factor;
    }

    public double getThermal_capacity() {
        return thermal_capacity;
    }

    public double getBurnup() {
        return burnup;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public int getRegion_id() {
        return region_id;
    }
    private double load_factor;
    private double thermal_capacity;
    private double burnup;
    private int unit_id;
    private int country_id;
    private int company_id;
    private int region_id;
    
    public Unit(){
        
    }
    public Unit(ArrayList<Object> res, double b){
        String lf = (String) res.get(0);
        String tc = (String) res.get(1);
        String u_id = (String) res.get(2);
        String cou_id = (String) res.get(3);
        String com_id = (String) res.get(4);
        String r_id = (String) res.get(5);
        
        load_factor = Double.parseDouble(lf);
        thermal_capacity = Double.parseDouble(tc);
        burnup = b;
        unit_id = Integer.parseInt(u_id);
        country_id = Integer.parseInt(cou_id);
        company_id = Integer.parseInt(com_id);
        region_id = Integer.parseInt(r_id);
    }
    
    public double countP(){
        double P = load_factor*thermal_capacity/burnup;
        return P;
    }
}
