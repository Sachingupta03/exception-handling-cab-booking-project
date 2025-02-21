import com.sachin.controllers.DriverController;
import com.sachin.controllers.UserController;
import com.sachin.model.Driver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CabBookingOrder {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.registerUser(1,"Ramesh", "ramesh12@gmail.com", "9876543210", "Pune");
        userController.registerUser(2, " Rajendra", "rajendra@gmail.com","8765432109","Gujarat");
        userController.registerUser(3," Sumit", "sumit!0@gmial.com","9087654321","Bhopal"); // this should throw a exception

        System.out.println("\nRegister User:");
        userController.displayUsers();

        DriverController driverController = new DriverController();
        driverController.registerDriver(001,"Santosh","santosh@gmail.com", "87565443", "Bhagoli");

        System.out.println("\nRegisteredDrivers:");
        driverController.displayDrivers();

    }
}