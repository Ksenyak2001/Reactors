/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mavenproject1;

import mephi2023.mavenproject1.workWithCollection.CollectionManipulation;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author Kseny
 */
public class UnitsINFO {

    private ArrayList<Unit> units;
    private static String queryEachReactor;
    private static String queryCountryReactor;
    private static String queryRegionReactor;
    private static String queryCompanyReactor;
    private static String querySumReactor;
    
    
    
    public UnitsINFO(){        
        units = new ArrayList<>();
        querySumReactor = """
                       SELECT SUM(thermal_capacity*load_factor*365/burnup/1000/100)
                       FROM public.units
                       WHERE commercial_operation < '2023-01-01' AND date_shutdown > '2023-12-31';""";
        queryEachReactor = """
                       SELECT thermal_capacity*load_factor*365/burnup/1000/100 AS annuel_fuel, unit_name
                       FROM public.units
                       WHERE commercial_operation < '2023-01-01' AND date_shutdown > '2023-12-31'
                       ORDER BY annuel_fuel;""";
        queryCountryReactor = """
                       SELECT SUM(thermal_capacity*load_factor*365/burnup/1000/100) AS annuel_fuel, country_name
                       FROM public.units 
                       JOIN public.sites ON public.units.site = public.sites.id
                       JOIN public.countries ON public.sites.place = public.countries.id
                       WHERE public.units.commercial_operation < '2023-01-01' AND 
                             public.units.date_shutdown > '2023-12-31'
                       GROUP BY public.countries.country_name
                       ORDER BY annuel_fuel;""";
        queryRegionReactor = """
                       SELECT SUM(thermal_capacity*load_factor*365/burnup/1000/100) AS annuel_fuel, region_name
                       FROM public.units 
                       JOIN public.sites ON public.units.site = public.sites.id
                       JOIN public.countries ON public.sites.place = public.countries.id
                       JOIN public.regions ON public.countries.region_id = public.regions.id
                       WHERE public.units.commercial_operation < '2023-01-01' AND 
                             public.units.date_shutdown > '2023-12-31'
                       GROUP BY public.regions.region_name
                       ORDER BY annuel_fuel;""";
        queryCompanyReactor = """
                       SELECT SUM(thermal_capacity*load_factor*365/burnup/1000/100) AS annuel_fuel, companies_name
                       FROM public.units 
                       JOIN public.sites ON public.units.site = public.sites.id
                       JOIN public.companies ON public.sites.owner_id = public.companies.id
                       WHERE public.units.commercial_operation < '2023-01-01' AND 
                             public.units.date_shutdown > '2023-12-31'
                       GROUP BY public.companies.companies_name
                       ORDER BY annuel_fuel;""";
    }
    
    
    public  static String getQueryEachReactor() {
        return queryEachReactor;
    }

    public static String getQueryCountryReactor() {
        return queryCountryReactor;
    }

    public static String getQueryRegionReactor() {
        return queryRegionReactor;
    }

    public static String getQueryCompanyReactor() {
        return queryCompanyReactor;
    }
    
    public static String getQuerySumReactor() {
        return querySumReactor;
    }
    
    public UnitsINFO(Connection conn, CollectionManipulation cm) throws SQLException{
     
        // load_factor, thermal_capacity, units.id, companies.id, countries.id, regions.id, class
        //ArrayList<ArrayList<Object>> infoEachColumn = BDManipulation.getInfoEachColumn(conn, query);
        //for (ArrayList<Object> ao : infoEachColumn){
        //    units.add(new Unit(ao, cm.getBurnupByReactor((String) ao.get(ao.size()-1))));
        //}
    }
    
    
    
                
}
