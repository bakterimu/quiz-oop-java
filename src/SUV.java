import java.time.LocalDate;

public class SUV extends Car{
  private double rent;
  private double driver;

  private double total;

  public SUV(String nopol, int year, double price,double tax, int seat,
             LocalDate transactionDate, double rent, double driver) {
    super(nopol, "SUV",year, seat, price, tax, transactionDate);
    this.rent = rent;
    this.driver = driver;
    this.total = rent+driver;
    super.setTotal(total);
  }


  public double getRent() {
    return rent;
  }

  public double getDriver() {
    return driver;
  }

  public double getTotal() {
    return total;
  }
  public String infoVehicle() {
    return "SUV [Nopol=" + super.getNopol() + ", Vehicle Type=" + super.getVehicleType() + ", year=" + super.getYear() +
            ", price=" + super.formatRupiah.format(super.getPrice()) + ", tax=" + super.formatRupiah.format(super.getTax())
            + ", seat="+super.getSeat() + ", transactionDate="
            + super.getTransactionDate() + ", rent= "+ super.formatRupiah.format(getRent())+
            ", driver="+ super.formatRupiah.format(getDriver()) + ", Total="+ super.formatRupiah.format(getTotal()) + "]";
  }
}
