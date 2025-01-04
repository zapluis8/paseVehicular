abstract class ControlPluma {
    protected E_num estado;

    public ControlPluma() {
        this.estado = E_num.ABAJO;
    }

    public abstract ControlPluma moverPluma(E_num nuevoEstado);

    public E_num getEstado() {
        return estado;
    }
}
