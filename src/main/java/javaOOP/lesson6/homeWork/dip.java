/*
5) Переписать код в соответствии с Dependency Inversion Principle:
*/
public class dip {
  //Создем интерфейс
  public interface Engine {
    void start();
}

// Класс PetrolEngine реализует интерфейс Engine
public class PetrolEngine implements Engine {
    @Override
    public void start() {
        // Логика запуска бензинового двигателя
    }
}

// Класс DieselEngine реализует интерфейс Engine
public class DieselEngine implements Engine {
    @Override
    public void start() {
        // Логика запуска дизельного двигателя
    }
}

// Класс Car принимает объект, реализующий интерфейс Engine
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

}
// Разорвать зависимость классов Car и PetrolEngine. У машины же может быть
// DieselEngine.
