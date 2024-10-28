package bancario;
import java.util.ArrayList;

import bancario.base.Cliente;
import bancario.base.Cuenta;
//import bancario.base.Cliente;

public class Banco {
    public String nombre;
    ArrayList<Cuenta> cuentas; 
    
    public Banco(){
        this.nombre = "Banco Sánchez";
        cuentas = new ArrayList<Cuenta>(); 
    }

    public String getNombre() {
        return nombre;
    }
    
    public Cuenta buscarCuenta(String numero){
        Cuenta cuentaAux = null;
        for (Cuenta cuenta : cuentas) {
            if (numero.equals(cuenta.getNumero())) {
                cuentaAux = cuenta;
                break;
            }
        }
        return cuentaAux;
    }

    public boolean adiccionarCuenta(String numero, double saldoInicial, String tipo, String cedulaTitular, String nombreTitular){
        
        if (buscarCuenta(numero) == null) {
         
        Cliente clienteCuenta = new Cliente(cedulaTitular, nombreTitular); 
        Cuenta cuentaNueva = new Cuenta(numero, saldoInicial, tipo, clienteCuenta);
        cuentas.add(cuentaNueva);
            return true;
        }else{
            return false;    
        }
    }

    public double totalDinero(){
        double total = 0.0;

        for (Cuenta cuenta : cuentas) {
            total = cuenta.getSaldo();
        }
        return total;
    }

    public String clienteMayorDinero(){
        String clienteMayor = "";
        double mayor = 0.0;
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getSaldo() > mayor) {
                mayor = cuenta.getSaldo();
                clienteMayor = cuenta.getTitular().getNombre();
            }
        }

        return clienteMayor;
    }
        
        


}
