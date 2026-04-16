/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_01;

/**
 *
 * @author Usuario-1
 */
public class POO_01 {

    public static void main(String[] args) {        
        System.out.println("Incio Programa");  
        String v_des;
        
        Productos p1 = new Productos();
        p1.crearProducto(1000, "Servidor IBM x-10", 10);
        
        v_des = p1.obtenerProducto();
        System.out.println("Descripcion del Producto p1..: "+ v_des);  
        
        
        
    }    
}
