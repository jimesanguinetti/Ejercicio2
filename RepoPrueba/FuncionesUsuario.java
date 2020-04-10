package usuario;

public class FuncionesUsuario {  
    public int calculoDeImpuestos(Usuario u){
        int edad = u.getEdad();
        int hijos = u.getCantHijos();
        int impuestos = 0;
        if(edad >= 18 && edad <= 30){
            impuestos = 2000;
        }
        if(edad > 30 && edad <= 65){
            impuestos = 7000;
        }
        if(edad > 65){
            impuestos = 2000;
        }
        return impuestos - ((hijos*3)/100);
    }
    public void cobroDeSueldo(int serviciosLaborales, Usuario u){
        int saldo = u.getSaldo() + serviciosLaborales;
        u.setSaldo(saldo);
    }
}