import java.time.LocalDateTime;

public class Veterinario {
    private int matricula;
    private String nombre;
    private String apellido;


    public Veterinario(int Matricula, String Nombre, String Apellido) {
        this.matricula = Matricula;
        this.nombre = Nombre;
        this.apellido = Apellido;
    }
    public void RecibirMascota() {
        System.out.println("Mascota Recibida");
    }
    public boolean AtenderMascota() {
        return true;
    }
    public Diagnostico GenerarDiagnostico(Mascota mascota,String descripcion) {
        Diagnostico diag = new Diagnostico(mascota,descripcion, LocalDateTime.now());

        return diag;
    }
}