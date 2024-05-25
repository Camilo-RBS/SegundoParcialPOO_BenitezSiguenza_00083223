
public static class EmpresaBuilder {
    private String nombre;
    private Organizacion organizacion;

    public EmpresaBuilder() {
    }

    public EmpresaBuilder(String nombre) {
        this.nombre = nombre;
        this.organizacion = new Organizacion();
    }

    public EmpresaBuilder agregarPrincipal(String nombreDep) {
        this.organizacion.agregarPrincipal(nombreDep);
        return this;
    }

    public EmpresaBuilder agregarSecundario(String nombreDepartamento, String depPrincipal) {
        this.organizacion.agregarSecundario(nombreDepartamento, depPrincipal);
        return this;
    }


    public Empresa build() {
        return new Empresa(this);
    }
}

public void mostrarOrganigrama() {
    this.organizacion.mostrarOrganizacion();
}