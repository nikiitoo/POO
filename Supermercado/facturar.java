public class facturar {

    private int v_consumoMaximo;
    private int v_consumoMinimo;

    public int calcularPrecio (int a_tipo, int a_consumo) {

        int v_valor;

        if (a_tipo == 1) {
            v_valor = a_consumo * 550;
        } else {
            v_valor = a_consumo * 450;
        }   
        return v_valor;
    }

    public int ObtMaximo() {
        return v_consumoMaximo;
    }
    public int ObtMinimo() {
        return v_consumoMinimo;
    }

    public void maximo (int i, int a_consumo) {
        if (i==0) {
           v_consumoMaximo = a_consumo; 
        } else {
            if (a_consumo > v_consumoMaximo) {
                v_consumoMaximo = a_consumo;
            }
        }
    }
    public void minimo (int i, int a_consumo) {
        if (i==0) {
           v_consumoMinimo = a_consumo; 
        } else {
            if (a_consumo < v_consumoMinimo) {
                v_consumoMinimo = a_consumo;
            }
        }
    }


    
}
