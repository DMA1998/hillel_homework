import java.text.DecimalFormat;
import java.util.Calendar;

public class CarProcessor {

    public void showCarsBrand(Car[] cars, String brand) {
        for (Car car : cars) {
            if (car.brand.equals(brand)) {
                System.out.println(car);
            }

        }
    }

    public void showCarsYear(Car[] cars, String model, int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for (Car car : cars) {
            int exploitationYear = currentYear - car.year;
            if (year < exploitationYear) {
                if (car.model.equals(model)) {
                    System.out.println(car);
                }
            }
        }
    }

    public void showCarsPrice(Car[] cars, int year, double price) {
        for (Car car : cars) {
            if (car.year == year) {
                if (price < car.price) {
                    System.out.println(car);
                }
            }
        }
    }

    public void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }

    public static String roundPrice(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }


}
