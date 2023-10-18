import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class VehicleTest {
    Car car = new Car("Москвич", "6", 2023);
    Motorcycle moto = new Motorcycle("ЗИД", "Сова", 1996);

    //- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    @Test
    void WheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }


    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }


    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }


    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }


    @Test
    void parkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park
    // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}