import java.time.LocalDate;

public class Taxi extends Car{
  private int order;
  private double orderPerKM;
  private final double total;

  public Taxi(String nopol, int year, double price,double tax, int seat,
              LocalDate transactionDate, int order,
              double orderPerKM) {
    super(nopol, "Taxi",year , seat, price, tax, transactionDate);
    this.order = order;
    this.orderPerKM = orderPerKM;
    this.total = order*orderPerKM;
    super.setTotal(total);
  }

  public int getOrder() {
    return order;
  }


  public double getOrderPerKM() {
    return orderPerKM;
  }


  public double getTotal() {
    return total;
  }

  public String infoVehicle() {
    return "Taxi [Nopol=" + super.getNopol() + ", Vehicle Type=" + super.getVehicleType() + ", year=" + super.getYear() +
            ", price=" + super.formatRupiah.format(super.getPrice()) + ", tax=" + super.formatRupiah.format(super.getTax())
            + ", seat="+super.getSeat() + ", transactionDate="
            + super.getTransactionDate() + ", order= "+ super.formatRupiah.format(getOrder())+
            ", driveorderPerKM="+ super.formatRupiah.format(getOrderPerKM()) + ", Total="+ super.formatRupiah.format(getTotal()) + "]";
  }
}
