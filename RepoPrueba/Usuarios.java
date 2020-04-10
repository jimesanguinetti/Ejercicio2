ackage usuario;
public class Usuario {
    
    //A: atributos
    private String nombre;
    private String cedula;
    private String contra;
    private int edad;
    private int cantHijos;
    private int saldo;

    //B: Getters, setters, constructores
    public Usuario(String nombre, String cedula, String contra, int edad, int cantHijos, int saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contra = contra;
        this.edad = edad;
        this.cantHijos = cantHijos;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getContra() {
        return contra;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //C: equals redefinido
    @Override
    public boolean equals (Object o){
        return this.getCedula() == ((Usuario)o).getCedula();
    }

}