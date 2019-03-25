import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        List<Car> cars = ExelidanWakitxva.listLoader();
        Car car=cars.get(1);
        System.out.println(car.getMark());
    }
}
