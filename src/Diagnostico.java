import java.time.LocalDateTime;

public class Diagnostico {
    private Mascota mascota;
    private String descripcion;
    private LocalDateTime fecha;

    public Diagnostico(Mascota mascota,String descripcion, LocalDateTime fecha) {
        this.mascota = mascota;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    public Diagnostico(){}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "mascota=" + mascota +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
