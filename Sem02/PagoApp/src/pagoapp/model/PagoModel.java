
package pagoapp.model;

public class PagoModel {
    //Input
    private int horasDia;
    private int dias;
    private double pagoHora;
    
    //output
    private double ingresos;
    private double renta;
    private double neto;

    /**
     * 
     */
    
    public PagoModel() {
    }

    
    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    /**
     * 
     * @param horasDia
     * @param dias
     * @param pagoHora 
     */
    public void setNeto(double neto) {    
        this.neto = neto;
    }

    public PagoModel(int horasDia, int dias, double pagoHora) {
        this.horasDia = horasDia;
        this.dias = dias;
        this.pagoHora = pagoHora;
    }
    
    
}
