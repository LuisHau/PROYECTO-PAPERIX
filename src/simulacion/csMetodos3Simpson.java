
package simulacion;

import java.util.ArrayList;

public class csMetodos3Simpson {

    public ArrayList<csFila3Simpson> Simpson(int cantidad) {

        ArrayList<csFila3Simpson> lista;
        lista = new ArrayList<csFila3Simpson>();
        // csFila3Simpson fila = new csFila3Simpson();

        generador g = new generador();
        int a[] = g.aleatorio(cantidad);
        double probabilidad=0;
        double promedio=g.promedio(a, cantidad);
        
        double b,c;
        

        for (int i = 1; i <= cantidad; i++) {

            csFila3Simpson fila = new csFila3Simpson();
            fila.setNumero(i);
            fila.setAleatorio(a[i - 1]);
           
           // *Math.pow(Math.E, -fila.getPromedio()))/g.factorial(a[i - 1]
          b=Math.pow(promedio,a[i - 1]);
           // System.out.println(b);
           c=(Math.pow(Math.E, -(promedio)));
           // System.out.println(c);
           probabilidad=(b*c)/g.factorial(a[i-1]);
          
          //  probabilidad=((Math.pow(promedio,a[i - 1]))*(Math.pow(2.71, -(promedio))))/(g.factorial(a[i - 1]));
            fila.setProbabilidad(probabilidad);
            

            lista.add(fila);

        }
        return lista;
    }

}


    
