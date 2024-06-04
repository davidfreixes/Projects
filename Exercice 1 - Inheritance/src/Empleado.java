import java.util.Objects;

public abstract class Empleado {
    protected int id;
    protected String name;
    protected String email;

    public Empleado(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract String describir();

    public abstract double calcularSalario();
}
