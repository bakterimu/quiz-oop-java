import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Plane extends Vehicle{
  private double price;
  private double tax;
  private LocalDate transactionDate;
  private double orderPerHours;
  private double total;

  public Plane(String nopol, int year, double price,double tax, int seat,
               LocalDate transactionDate, double orderPerHours) {
    super(nopol, year, "PrivateJet", seat, tax);
    this.price = price;
    this.tax = tax;
    this.transactionDate = transactionDate;
    this.orderPerHours = orderPerHours;
    this.total = orderPerHours;
  }

  public double getPrice() {
    return price;
  }

  public double getTax() {
    return tax;
  }

  public LocalDate getTransactionDate() {
    return transactionDate;
  }


  public double getOrderPerHours() {
    return orderPerHours;
  }


  public double getTotal() {
    return total;
  }

  @Override
  public String infoVehicle() {
    return "Private Jet [Nopol=" + super.getNopol() + ", Vehicle Type=" + super.getVehicleType() + ", year=" + super.getYear() +
            ", price=" + super.formatRupiah.format(getPrice()) + ", tax=" + super.formatRupiah.format(super.getTax())
            + ", seat="+super.getSeat() + ", transactionDate="
            + getTransactionDate() + ", orderPerHours= "+ super.formatRupiah.format(getOrderPerHours())+
            ", Total="+ super.formatRupiah.format(getTotal()) + "]";
  }
}
