public abstract class Bicicleta {
    private String codigo;
    private int año;
    private double peso;

    // Se modifica la estructura del constructor para que antes de instanciar,
    // use los setters que validarán que los datos sean correctos
    public Bicicleta(String codigo, int año, double peso) {
        setCodigo(codigo);
        setAño(año);
        setPeso(peso);
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAño() {
        return año;
    }

    public double getPeso() {
        return peso;
    }
    // setCodigo con validacion de datos
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.strip().isEmpty()) {
            throw new IllegalArgumentException("El código de la bicicleta no puede estar vacío");
        }
        this.codigo = codigo;
    }
    // setAño con validacion de datos
    public void setAño(int año) {
        if (año < 2000 || año > 2026){
            throw new IllegalArgumentException("El año ingresado no es válido");
        }
        this.año = año;
    }

    // setPeso con validacion de datos
    public void setPeso(double peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        } this.peso = peso;
    }

    // metodo toString que solo contempla codigo y año
    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigo='" + codigo + '\'' +
                ", año=" + año +
                '}';
    }

    // metodo de calculo de costos que se sobreescribira en las subclases
    public double calcularCostoMantencion(){
        return 0;
    }

    public String mostrarDetalle() {
        return "Código: " + getCodigo() + " | Año: " + getAño();
    }
}
