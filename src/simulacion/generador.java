package simulacion;

public class generador {

    public int[] aleatorio(int cantidad) {
        
        int a[] = new int[cantidad];
        
        
        for (int x = 1; x <= cantidad; x++) {
            a[x - 1] = ((int) (Math.random() * (25 - 5)) + 5);
        
        }  
        
        return a;
    }
    public long factorial(int numero){
      long f=numero;
      
      for(int x=numero-1;x>=1;x--){
          f=f*x;
      }
        
      return f;
    }
    public double promedio(int a[], int cantidad) {
        
        double promedio = 0;
        for (int x = 1; x <= cantidad; x++) {
        promedio=promedio+a[x-1];
        }  
        
        return promedio/cantidad;
    }
    
    
}
