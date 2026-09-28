import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // se instancian las 4 bicicletas con sus respectivos atributos
        BicicletaElectrica bici1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        bici1.activarGarantiaExtendida();

        BicicletaElectrica bici2 = new BicicletaElectrica("BIC-E02", 2022, 24, 45, true);

        BicicletaMontaña bici3 = new BicicletaMontaña("BIC-M01", 2021, 13.5, 2);

        BicicletaMontaña bici4 = new BicicletaMontaña("BIC-M02", 2020, 12, 1);


        // se crea un objeto de la clase gestor para registrar las bicicletas previamente creadas
        GestorTallerBicicletas gestor = new GestorTallerBicicletas();
        gestor.registrarBicicleta(bici1);
        gestor.registrarBicicleta(bici2);
        gestor.registrarBicicleta(bici3);
        gestor.registrarBicicleta(bici4);

        System.out.println();
        System.out.println("=== BUSQUEDA POR CODIGO: BIC-E01 ===");

        ArrayList<Bicicleta> resultadoBusqueda = gestor.buscarPorCodigo("BIC-E01");
        for (Bicicleta bicicleta : resultadoBusqueda) {
            System.out.println(bicicleta.mostrarDetalle());
        }

        System.out.println();
        System.out.println("=== LISTADO DE BICICLETAS ===");
        for (Bicicleta bicicleta : gestor.bicicletas){
            System.out.println(bicicleta);
        }
    }
}