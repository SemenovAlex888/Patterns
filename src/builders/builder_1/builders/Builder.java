package builders.builder_1.builders;

import builders.builder_1.cars.CarType;
import builders.builder_1.components.Engine;
import builders.builder_1.components.GPSNavigator;
import builders.builder_1.components.Transmission;
import builders.builder_1.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 * @author Semenov Alexey
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
