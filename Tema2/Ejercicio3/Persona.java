import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable {
    private static final long serialVersionUID = 100L;
    String nombre, mail, annoNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String mail, String annoNacimiento) {
        this.nombre = nombre;
        this.mail = mail;
        this.annoNacimiento = annoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getAnnoNacimiento() {
        return annoNacimiento;
    }

    public void escribir() {
        System.out.println("Usuario -> nombre: " + this.nombre + ", mail: " + this.mail + ", Año de nacimineto: " + this.annoNacimiento);
    }

    @Override
    public String toString() {
        return "Usuario: " + this.nombre +
                ", mail: " + this.mail +
                ", Año de nacimiento: " + this.annoNacimiento + "\n";
    }
}
