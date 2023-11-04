import java.text.NumberFormat;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    JuraganImplementation jr = new JuraganImplementation();
    var list = jr.initVehicle();
    System.out.println("Total Car: "+jr.TotalCar(list));
    System.out.println("Total Income Car: Rp."+jr.formatRupiah.format(jr.TotalIncomeCar(list)));
    System.out.println();
    System.out.println("Total Plane: "+jr.TotalPlane(list));
    System.out.println("Total Income Plane: "+jr.formatRupiah.format(jr.TotalIncomePlane(list)));
    System.out.println();
    System.out.println("Total Boat: "+jr.TotalBoat(list));
    System.out.println("Total Income Boat: "+jr.formatRupiah.format(jr.TotalIncomeBoat(list)));
    System.out.println();
    System.out.println("Total Tax: "+jr.TotalTax(list));
    System.out.println();
    System.out.println("Sub Total :"+jr.SubTotal(list));
    System.out.println();
    jr.print(list);
  }
}
