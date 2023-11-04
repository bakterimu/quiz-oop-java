import java.text.NumberFormat;
import java.util.Locale;

public abstract class Vehicle {
  private String nopol;
  private int year;
  private String vehicleType;
  private int seat;
  private double tax;
  NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));

  public Vehicle(String nopol, int year, String vehicleType, int seat, double tax) {
    this.nopol = nopol;
    this.year = year;
    this.vehicleType = vehicleType;
    this.seat = seat;
    this.tax = tax;
  }

  public String getNopol() {
    return nopol;
  }

  public int getYear() {
    return year;
  }

  public String getVehicleType() {
    return vehicleType;
  }


  public int getSeat() {
    return seat;
  }

  public double getTax() {
    return tax;
  }

  public abstract String infoVehicle();
}
