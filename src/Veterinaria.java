import jdk.jshell.Diag;

public class Veterinaria {
    public static void main(String[] args) {
        Veterinario vet1 = new Veterinario(132151,"Lionel","Messi");
        Mascota mascota = new Mascota("Picha","Chiwawa","Perro");
        Cliente cliente1 = new Cliente("Juana","Dearco");
        vet1.RecibirMascota();
        vet1.AtenderMascota();
        Diagnostico diag;
        diag = vet1.GenerarDiagnostico(mascota,"Se le da un desparacitante");


        System.out.println(diag.toString());


    }
}
