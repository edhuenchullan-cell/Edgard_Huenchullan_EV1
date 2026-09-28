public class BicicletaMontaña extends Bicicleta {
    private int suspensiones;

    //constructor que hereda los atributos de la clase padre Bicicleta, además de contar con los suyos propios
    public BicicletaMontaña(String codigo, int año, double peso, int suspensiones) {
        super(codigo, año, peso);
        setSuspensiones(suspensiones);
    }

    public int getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(int suspensiones) {
        this.suspensiones = suspensiones;
    }

    // se sobreescribe metodo con el comportamiento especifico necesario para la subclase
    @Override
    public double calcularCostoMantencion(){
        double costo = 30000;
        if (suspensiones > 1){
            costo *= 1.15;
        }
        return costo;

    }

    @Override
    public String mostrarDetalle() {
        return "Tipo: Bicicleta de Montaña | Código: " + getCodigo() + " | Año: " + getAño() +
                " | Peso: " + getPeso() + " kg" +
                " | Suspensiones: " + suspensiones +
                " | Costo mantención: $" + (int) calcularCostoMantencion();
    }
}
