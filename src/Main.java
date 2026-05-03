public class Main {
    public static void main(String[] args) {
        // 1. Declaración de variables
        int a = 10;
        Persona p = new Persona("Carlos");
         // Mostrar valores iniciales
        System.out.println("--- ANTES de llamar al método ---");
        System.out.println("Valor de a (primitivo): " + a);
        System.out.println("Nombre de p (objeto): " + p.nombre);
        System.out.println();
 // 2. Llamada al método
        cambiarValores(a, p);

        // Mostrar valores finales
        System.out.println("--- DESPUÉS de llamar al método ---");
        System.out.println("Valor de a (primitivo): " + a);
        System.out.println("Nombre de p (objeto): " + p.nombre);
        
        System.out.println("\nConclusión:");
        System.out.println("- El int no cambió (Copia en Stack).");
        System.out.println("- El nombre cambió a 'Luis' (Referencia al Heap).");
        System.out.println("- La referencia no es 'Ana' (Reasignación local fallida).");
    }
public static void cambiarValores(int x, Persona persona) {
        // Intento de modificar el primitivo
        x = 99;

        // Modificar atributo del objeto (afecta al objeto real en el Heap)
        persona.nombre = "Luis";

        // Reasignar el parámetro a un nuevo objeto (solo afecta la variable local)
        persona = new Persona("Ana");
    }
}