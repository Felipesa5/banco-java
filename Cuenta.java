package cuenta_programacion2;
public class Cuenta {
     String titular;
     double saldo;
     String tipoCuenta;
     String numero;


    
//    Cuenta(String titular, double saldoInicial, String tipoCuenta) {
//        this.titular = titular;
//        this.saldo = saldoInicial;
//        this.tipoCuenta = tipoCuenta;
//    }

    
    double consultarSaldo() {
        return this.saldo;
    }

    
    boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    
    void consignar(double cantidad) {
        this.saldo += cantidad;
    }


}
