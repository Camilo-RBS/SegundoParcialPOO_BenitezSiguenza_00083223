public class Empresa {

    private String nombre;
    private String organizacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    private Empresa(Empresa builder) {
        this.nombre = builder.nombre;
        this.organizacion = builder.organizacion;
    }

}
