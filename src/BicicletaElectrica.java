public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private double autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;


    //constructor que hereda los atributos de la clase padre Bicicleta, además de contar con los suyos propios
    public BicicletaElectrica(String codigo, int año, double peso, double autonomia, boolean bateriaCertificada) {
        super(codigo, año, peso);
        setAutonomia(autonomia);
        setBateriaCertificada(bateriaCertificada);
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }

    // se sobreescibe el metodo, para que tome el comportamiento especifico necesario de la subclase BicicletaElectrica
    @Override
    public double calcularCostoMantencion(){
        double costo = 45000;
        if (!bateriaCertificada){
            costo *= 1.25;
        }
        return costo;
    }

    @Override
    public boolean consultarGarantiaActiva(){
        return garantiaExtendida;
    }

    @Override
    public void activarGarantiaExtendida(){
        setGarantiaExtendida(true);
    }

    @Override
    public String mostrarDetalle() {
        return "Tipo: Bicicleta Eléctrica | Código: " + getCodigo() + " | Año: " + getAño() +
                " | Peso: " + getPeso() + " kg" +
                " | Autonomia: " + autonomia + " km" +
                " | Batería certificada: " + (bateriaCertificada ? "Si" : "No") +
                " | Garantia extendida: " + (garantiaExtendida ? "Si" : "No") +
                " | Costo mantención: $" + (int) calcularCostoMantencion();
    }
}
