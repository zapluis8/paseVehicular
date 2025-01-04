class SistemaLed implements Dispositivo {
    @Override
    public String encenderLed(String color) {
        return "LED " + color + " encendido.";
    }

    @Override
    public String apagarLed() {
        return "LED apagado.";
    }
}
