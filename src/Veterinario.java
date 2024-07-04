<<<<<<< HEAD
import java.time.LocalDateTime;
=======
>>>>>>> 7418527ca30757d117e2a4b8552f49021e77e138

public class Veterinario {
    private int matricula;
    private String nombre;
    private String apellido;
<<<<<<< HEAD
=======
    private String mascota;
    private String nombreCliente;
    private String apellidocliente;
    private String diagnostico;
    private String raza;
>>>>>>> 7418527ca30757d117e2a4b8552f49021e77e138


    public Veterinario(int Matricula, String Nombre, String Apellido) {
        this.matricula = Matricula;
        this.nombre = Nombre;
        this.apellido = Apellido;
    }
<<<<<<< HEAD
    public void RecibirMascota() {
        System.out.println("Mascota Recibida");
=======
    public void RecibirMascota(String nombreCliente,String apellidocliente, String nombreMascota,String raza) {
        this.nombreCliente= nombreCliente;
        this.mascota = nombreMascota;
        this.apellidocliente = apellidocliente;
        this.raza = raza;

>>>>>>> 7418527ca30757d117e2a4b8552f49021e77e138
    }
    public boolean AtenderMascota() {
        return true;
    }
<<<<<<< HEAD
    public Diagnostico GenerarDiagnostico(Mascota mascota,String descripcion) {
        Diagnostico diag = new Diagnostico(mascota,descripcion, LocalDateTime.now());

        return diag;
=======
    public void Diagnostico(String diagnostico,String nombreCliente, String apellidocliente, String nombreMascota,int matricula) {

        this.diagnostico = diagnostico;
>>>>>>> 7418527ca30757d117e2a4b8552f49021e77e138
    }
}