public class CuentaBancaria {
    private String nombresTitular;
    private String apellidosTitular;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, String numeroCuenta, String tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    public String getNombresTitular() {
        return nombresTitular;
    }

    public void setNombresTitular(String nombresTitular) {
        this.nombresTitular = nombresTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public void setApellidosTitular(String apellidosTitular) {
        this.apellidosTitular = apellidosTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se han depositado " + cantidad + " unidades. Saldo actual: " + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + " unidades. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. No se puede realizar la operación.");
        }
    }

    public void imprimirInformacion() {
        System.out.println("Titular: " + nombresTitular + " " + apellidosTitular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Natalia", "Martinez", "25683416", "Cuenta de ahorros");

        cuenta.imprimirInformacion();

        cuenta.depositar(2500);

        cuenta.retirar(655);

        cuenta.imprimirInformacion();
    }
}