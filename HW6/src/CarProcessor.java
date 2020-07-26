import java.text.DecimalFormat;
import java.util.Calendar;

public class CarProcessor {

    private final static int DEFAULT_SIZE = 5;

    Car[] myCars;

    public CarProcessor() {
        this.myCars = new Car[DEFAULT_SIZE];
    }

    public CarProcessor(Car[] myCars) {
        this.myCars = myCars;
    }

    public void showCarsBrand(String brand) {
        if(!isEmpty()) {
            showCarsBrand(this.myCars, brand);
        }
    }


    public void showCarsBrand(Car[] cars, String brand) {
        for (Car car : cars) {
            if (car.brand.equals(brand)) {
                System.out.println(car);
            }

        }
    }

    public void showCarsYear(String model, int year) {
        if(!isEmpty()) {
            showCarsYear(this.myCars, model, year);
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

    public void showCarsPrice(int year, double price) {
        if(!isEmpty()) {
            showCarsPrice(this.myCars, year, price);
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
    private boolean isEmpty() {
        return isEmpty(this.myCars);
    }

    private boolean isEmpty(Car[] cars) {
        return (cars == null) || (cars.length == 0);
    }
}
