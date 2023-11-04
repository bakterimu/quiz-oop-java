import java.time.LocalDate;

public class Car extends Vehicle{
  private double price;
  private LocalDate transactionDate;
  private double total;

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public Car(String nopol, String vehicleType, int year,
             int seat, double price, double tax,
             LocalDate transactionDate) {
    super(nopol, year, vehicleType, seat, tax);
    this.price = price;
    this.transactionDate = transactionDate;
  }

  public double getPrice() {
    return price;
  }

  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  @Override
  public String infoVehicle() {
    return "Car [Nopol=" + super.getNopol() + ", Vehicle Type=" + super.getVehicleType() + ", year=" + super.getYear() +
            ", price=" + super.formatRupiah.format(price)
            + ", tax=" + super.formatRupiah.format(super.getTax()) + ", transactionDate=" + transactionDate + "]";
  }
}
