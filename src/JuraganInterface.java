import java.text.NumberFormat;
import java.util.List;

public interface JuraganInterface {
  List<Vehicle> initVehicle();
  int TotalCar(List<Vehicle> listVehicle);
  int TotalPlane(List<Vehicle> vehicleList);

  int TotalBoat(List<Vehicle> listVehicle);

  String TotalTax(List<Vehicle> vehicleList);

  double TotalIncomeCar(List<Vehicle> vehicleList);

  double TotalIncomePlane(List<Vehicle> vehicleList);

  double TotalIncomeBoat(List<Vehicle> vehicleList);
  String SubTotal(List<Vehicle> vehicleList);
  void print(List<Vehicle> vehicleList);
}
