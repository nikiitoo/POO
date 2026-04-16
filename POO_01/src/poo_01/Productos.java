/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_01;

public class Productos {
    
    private int cod_prod;
    private String des_prod;
    private int stock;
    
    public void crearProducto(int cod, String des, int cantidad) {
        cod_prod = cod;
        des_prod = des;
        stock = cantidad;        
    } 
    public String obtenerProducto() {
        return des_prod;       
    }
    
    
}
