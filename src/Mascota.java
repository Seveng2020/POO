public class Mascota {
    private String raza;
    private String nombre;
    private String tipo;

    public Mascota (String nombre, String raza,String tipo){
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                ", nombre de mascota='" + nombre + '\'';
    }
}
