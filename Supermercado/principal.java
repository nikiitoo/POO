public class principal {
    public static void main(String[] args) {     
        System.out.println("Inicia Facturacion...");
        int v_precio;
        facturar f = new facturar();
      
            for (int i=0; i<3; i++) {
            System.out.println("Procesado al cliente "+ i);
            if (i ==0) {
                v_precio = f.calcularPrecio(1, 10);
                System.out.println("Cliente "+i + " valor a pagar :"+v_precio);
                f.maximo(i,10);
                f.minimo(i,10);
            }
            if (i ==1) {
               v_precio = f.calcularPrecio(2, 8);
               System.out.println("Cliente "+i + " valor a pagar :"+v_precio);
               f.maximo(i,8);
                f.minimo(i,8);
            }
            if (i ==2) {
               v_precio = f.calcularPrecio(2, 16);
               System.out.println("Cliente "+i + " valor a pagar :"+v_precio);
               f.maximo(i,16);
                f.minimo(i,16);
            }
        }

        System.out.println("Consumo maximo "+ f.ObtMaximo());
        System.out.println("Consumo minimo "+ f.ObtMinimo());
    }

}
