package bancario.base;

public class Cuenta {
   private String numero;
   private double saldo;
   private String tipo;
   Cliente titular;



   public Cuenta(String numero, double saldoInicial, String tipo, Cliente titular) {
    this.numero = numero;
    this.saldo = saldoInicial;
    this.tipo = tipo;
    this.titular = titular;

    }

   public Cuenta(String numero, String tipo, Cliente titular) {
    this.numero = numero;
    this.tipo = tipo;
    this.titular = titular;
    }

   public String getNumero() {
    return numero;
    }

   public double getSaldo() {
    return saldo;
    }

   public String getTipo() {
    return tipo;
    }

   public Cliente getTitular() {
    return titular;
    }


    public void consignar(double cantidad){
        this.saldo += cantidad;
    }


    public boolean retirar(double cantidad){
        if (cantidad <= this.saldo ) {
            this.saldo = this.saldo - cantidad;
            return true; 
        }else{
            return false;
        }
    }
 
    

}
