public class Aiudita {
    public static void main(String[] args) {
        // Crear una instancia de PaseVehicular
        PaseVehicular paseVehicular = new PaseVehicular();

        // Imprimir estado inicial
        System.out.println("Estado inicial de la pluma: " + paseVehicular.getEstado());

        // Simular interacción con el botón (uso de la interfaz 'Boton')
        System.out.println("\n--- Simulando interacción con el botón físico ---");
        for (int i = 0; i < 5; i++) { // Simular 5 interacciones con el botón
            System.out.print("Interacción #" + (i + 1) + ": ");
            paseVehicular = paseVehicular.procesarBoton();
            System.out.println("Estado de la pluma: " + paseVehicular.getEstado());
        }

        // Mostrar la interfaz gráfica
        System.out.println("\n--- Iniciando interfaz gráfica ---");
        javax.swing.SwingUtilities.invokeLater(() -> new InterfazPaseVehicular());
    }
}
