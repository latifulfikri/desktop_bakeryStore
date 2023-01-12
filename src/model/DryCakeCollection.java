/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author fikriyuwi
 */
public class DryCakeCollection {
    static ArrayList<DryCake> DryCakeCol = new ArrayList<>();
    
    public static void addDataCollection(String name, int price, double weight)
    {
        DryCakeCol.add(new DryCake(name,price,weight));
    }
    
    public static ArrayList<DryCake> getDataCollection()
    {
        return DryCakeCol;
    }
    
    public static int getSize()
    {
        return DryCakeCol.size();
    }
    
    public static DryCake getData(int index)
    {
        return DryCakeCol.get(index);
    }
    
    public static void removeData(int index)
    {
        DryCakeCol.remove(index);
    }
    
    public static void updateData(int index, String name, int price, double weight)
    {
        DryCakeCol.get(index).setName(name);
        DryCakeCol.get(index).setPrice(price);
        DryCakeCol.get(index).setWeight(weight);
    }
    
}
