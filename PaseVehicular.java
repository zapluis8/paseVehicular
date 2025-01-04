class PaseVehicular extends PlumaAutomatica implements Boton {
    private SistemaLed sistemaLed;

    public PaseVehicular() {
        sistemaLed = new SistemaLed();
    }

    @Override
    public boolean leerBoton() {
        // Simulación de botón
        return Math.random() > 0.5;
    }

    public PaseVehicular procesarBoton() {
        if (leerBoton()) {
            return moverPluma(E_num.ARRIBA);
        } else {
            return moverPluma(E_num.ABAJO);
        }
    }
}
