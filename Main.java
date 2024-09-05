package cuenta_programacion2;

public class Main {

public static void main(String[] args) {

    int valor = 100000;
    Cuenta cuenta = new Cuenta();
    System.out.println(cuenta.consultarSaldo());
    cuenta.consignar(valor);
    System.out.println(cuenta.consultarSaldo());
    boolean pudoRetirar = cuenta.retirar(50000.5);
    System.out.println("Pudo retirar " +pudoRetirar);
    System.out.println(cuenta.consultarSaldo());
    
    boolean pudoSegundoRetiro = cuenta.retirar(50000.5);
    System.out.println("Pudo retirar " +pudoSegundoRetiro);
    System.out.println(cuenta.consultarSaldo());



}

}


