package Cuenta;
public class Cuenta {
     String titular;
     double saldo;
     String tipoCuenta;
     String numero;


    
    Cuenta(String titular, double saldoInicial, String tipoCuenta) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }

    
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


    public static void main(String[] args) {
        
        Cuenta cuentaPepe = new Cuenta("Pepe Pérez", 1000000, "Ahorros");
        System.out.println("Saldo de Pepe: $" + cuentaPepe.consultarSaldo());


        Cuenta cuentaLola = new Cuenta("Lola López", 500000, "Corriente");
        boolean exito = cuentaLola.retirar(200000);
        if (exito) {
            System.out.println("Retiro exitoso. Saldo de Lola: $" + cuentaLola.consultarSaldo());
        } else {
            System.out.println("No se pudo realizar el retiro.");
        }
    }
}
