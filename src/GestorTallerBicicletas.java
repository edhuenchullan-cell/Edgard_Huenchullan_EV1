import java.util.ArrayList;

// se crea un array que solo acepta objetos de la clase Bicicleta, llamado "bicicletas"
public class GestorTallerBicicletas {
    ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();

    // se define el metodo para registrar cada bicicleta en la lista previamente creada, para finalmente mostrar en consola el mensaje de confirmación
    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        System.out.println(bicicleta.getCodigo() + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
    }

    // se crea otro array pero este en su lugar guarda las coincidencias comparando el codigo de la bicicleta en cada iteracion del for
    public ArrayList<Bicicleta> buscarPorCodigo(String codigo) {
        ArrayList<Bicicleta> resultado = new ArrayList<Bicicleta>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getCodigo().equals(codigo)){
                resultado.add(bicicleta);
            }
        }
        return resultado;

    }
}

