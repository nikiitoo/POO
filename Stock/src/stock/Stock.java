/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stock;
public class Stock {

    public static void main(String[] args) {
        System.out.println("Inicio");
        
        
        Bodega p1 = new Bodega();
        int v_tipo;
        v_tipo = p1.validaProducto(3);
        
        if (v_tipo == 0) {
            System.out.println("ES PAR");
        }else {
            System.out.println("ES IMPAR");
        }     
        
                
    }
    
}
