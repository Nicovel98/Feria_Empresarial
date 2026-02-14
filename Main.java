import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FeriaEmpresarial feria = new FeriaEmpresarial();
        Scanner sc = new Scanner(System.in);

        // Datos de prueba iniciales
        feria.registrarStand(new Stand(1, "Pabellón A", "Grande"));
        feria.registrarStand(new Stand(2, "Pabellón A", "Pequeño"));

        int op;
        do {
            System.out.println("\n=== FERIA EMPRESARIAL ===");
            System.out.println("1. Registrar Empresa");
            System.out.println("2. Registrar Visitante");
            System.out.println("3. Registrar Stand");
            System.out.println("4. Asignar Stand a Empresa");
            System.out.println("5. Dejar Comentario (Interacción)");
            System.out.println("6. Ver Reportes");
            System.out.println("7. Salir");
            System.out.print("Opción: \n");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("\nNombre Empresa: ");
                    String nomE = sc.nextLine();
                    System.out.print("Sector: ");
                    String sec = sc.nextLine();
                    System.out.print("Correo: ");
                    String corE = sc.nextLine();
                    feria.registrarEmpresa(new Empresa(nomE, sec, corE));
                    System.out.println("Empresa registrada!");
                    break;
                case 2:
                    System.out.print("\nNombre Visitante: ");
                    String nomV = sc.nextLine();
                    System.out.print("ID: ");
                    String idV = sc.nextLine();
                    System.out.print("Correo: ");
                    String corV = sc.nextLine();
                    feria.registrarVisitante(new Visitante(nomV, idV, corV));
                    System.out.println("Visitante registrado!");
                    break;
                case 3:
                    System.out.print("\nNúmero Stand: ");
                    int numS = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ubicación: ");
                    String ubi = sc.nextLine();
                    System.out.print("Tamaño: ");
                    String tam = sc.nextLine();
                    feria.registrarStand(new Stand(numS, ubi, tam));
                    System.out.println("Stand registrado!");
                    break;
                case 4:
                    System.out.print("\nNombre Empresa: ");
                    String ne = sc.nextLine();
                    System.out.print("Número Stand: ");
                    int ns = sc.nextInt();
                    if (feria.asignarStandAEmpresa(ne, ns))
                        System.out.println("Stand Asignado!");
                    else
                        System.out.println("Error en asignación.");
                    break;
                case 5:
                    System.out.print("\nID Visitante: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre Empresa a visitar: ");
                    String nEmp = sc.nextLine();
                    System.out.print("Calificación (1-5): ");
                    int cal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Comentario: ");
                    String txt = sc.nextLine();
                    feria.dejarComentario(id, nEmp, cal, txt);
                    break;
                case 6:
                    feria.reporteEmpresasStands();
                    feria.reporteCalificaciones();
                    break;
            }
        } while (op != 7);
    }
}
