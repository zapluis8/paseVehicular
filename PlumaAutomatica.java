class PlumaAutomatica extends ControlPluma {
    private SistemaLed leds;

    public PlumaAutomatica() {
        this.leds = new SistemaLed();
    }

    @Override
    public PlumaAutomatica moverPluma(E_num nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Pluma automática movida a: " + estado);
        if (estado == E_num.ARRIBA) {
            System.out.println(leds.encenderLed("Verde"));
        } else {
            System.out.println(leds.encenderLed("Rojo"));
        }
        return this;
    }
}
