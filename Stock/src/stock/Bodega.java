/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author Usuario-1
 */
public class Bodega {
    
    private int v_stockBodegaA;
    private int v_stockBodegaB;
    
    public void IncrementaBodegaA(int v_cantidad) {
        v_stockBodegaA = v_stockBodegaA + v_cantidad;
    }

    public void IncrementaBodegaB(int v_cantidad) {
        v_stockBodegaB = v_stockBodegaB + v_cantidad;
    }
    
    public int validaProducto (int v_numero) {
        int v_resultado;        
        v_resultado = (v_numero % 2);
        return v_resultado;        
    }    
}
