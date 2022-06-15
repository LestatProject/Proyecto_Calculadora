
package calculadora_Interface;

public class Potencia extends Operacion{
    
    double potencia;
       
    public Potencia(double n1, double n2) {
             
        super(n1, n2, '^');
        this.potencia =  Math.pow(n1,n2);
        this.setRes(this.potencia);
    }
}
