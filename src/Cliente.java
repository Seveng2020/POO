public class Cliente {
    private String nombreCliente;
    private String apellidocliente;


    public Cliente(String nombreCliente, String apellidocliente) {
        this.nombreCliente = nombreCliente;
        this.apellidocliente = apellidocliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidocliente() {
        return apellidocliente;
    }

    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }
}
