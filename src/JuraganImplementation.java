import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class JuraganImplementation implements JuraganInterface{
  NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
  @Override
  public List<Vehicle> initVehicle() {
      Car suv1 = new SUV("D 1001 UM",2010, 350000000.0, 3500000.0, 4, LocalDate.of(2023,1,10),500000.0,150000.0);

      Car suv2 = new SUV("D 1002 UM",2010,350000000.0, 3500000.0, 4, LocalDate.of(2023,1,10),500000.0,150000.0);

      Car suv3 = new SUV("D 1003 UM",2015,350000000.0,3500000,5, LocalDate.of(2023,1,12),500000.0,150000.0);

      Car suv4 = new SUV("D 1004 UM",2015,350000000.0,3500000,5, LocalDate.of(2023,1,13),500000.0,150000.0);

      Car taxi1 = new Taxi("D 11 UK",2002,175000000.0,1750000.0,4,LocalDate.of(2023,1,12),45,4500.0);

      Car taxi2 = new Taxi("D 12 UK",2015,225000000.0,2250000.0,4,LocalDate.of(2023,1,13),75,4500.0);

      Car taxi3 = new Taxi("D 13 UK",2020,275000000.0,2750000.0,4,LocalDate.of(2023,1,13),90,4500.0);

      Plane jet1 = new Plane("ID 8089",2015,150000000000.0,1500000000.0,12,LocalDate.of(2023,12,23),55000000.0);

      Plane jet2= new Plane("ID 8099",2018,175000000000.0,1750000000.0,15,LocalDate.of(2023,12,25),75000000.0);

      Boat boat1 = new Boat("Boat18",2020,2000000000.0,20000000.0,12,LocalDate.of(2023,12,25),10000000.0);

      List<Vehicle> listveicle = List.of(suv1,suv2,suv3,suv4,taxi1,taxi2,taxi3, jet1,jet2,boat1);

      return listveicle;
  }

  @Override
  public int TotalCar(List<Vehicle> listVehicle) {
    int count = 0;
    for (Vehicle car: listVehicle) {
      if (car instanceof Car) count++;
    }
    return count;
  }

  @Override
  public int TotalPlane(List<Vehicle> vehicleList)
  {
    int count = 0;
    for (Vehicle plane: vehicleList) {
      if (plane instanceof Plane) count++;
    }
    return count;
  }

  @Override
  public int TotalBoat(List<Vehicle> listVehicle) {
    int count = 0;
    for (Vehicle car: listVehicle) {
      if (car instanceof Boat) count++;
    }
    return count;
  }

  @Override
  public String TotalTax(List<Vehicle> vehicleList) {
    double totalTax = 0;
    for (Vehicle vehicle :
            vehicleList) {
      totalTax += vehicle.getTax();
    }
    return formatRupiah.format(totalTax);
  }

  @Override
  public double TotalIncomeCar(List<Vehicle> vehicleList)
  {
    double total = 0;
    for (Vehicle vehicle: vehicleList) {
      if (vehicle instanceof Car){
        total = total + ((Car) vehicle).getTotal();
      }
    }
    return total;
  }

  @Override
  public double TotalIncomePlane(List<Vehicle> vehicleList) {
    double total = 0;
    for (Vehicle vehicle :
            vehicleList) {
      if (vehicle instanceof Plane){
        total = total + ((Plane) vehicle).getTotal();
      }
    }
    return total;
  }

  @Override
  public double TotalIncomeBoat(List<Vehicle> vehicleList) {
    double total = 0;
    for (Vehicle vehicle :
            vehicleList) {
      if (vehicle instanceof Boat){
        total = total + ((Boat) vehicle).getTotal();
      }
    }
    return total;
  }
  public String SubTotal(List<Vehicle> vehicleList){
    return formatRupiah.format(TotalIncomeBoat(vehicleList)+
            TotalIncomeCar(vehicleList)+TotalIncomePlane(vehicleList));
  }

  public void print(List<Vehicle> vehicleList){
    for (Vehicle vehicle: vehicleList) {
      System.out.println(vehicle.infoVehicle());
    }
  }
}
