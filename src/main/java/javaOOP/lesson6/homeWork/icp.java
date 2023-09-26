/* 3) Переписать код в соответствии с Interface Segregation Principle: */
public class icp {
  public interface getShapeArea {
    double area();
  }

  public interface getShapeVolume {
    double volume();
  }

  public class Circle implements getShapeArea {
    private double radius;

    public Circle(double radius) {
      this.radius = radius;
    }

    @Override
    public double area() {
      return 2 * 3.14 * radius;
    }
  }

  public class Cube implements getShapeArea, getShapeVolume {
    private int edge;

    public Cube(int edge) {
      this.edge = edge;
    }

    @Override
    public double area() {
      return 6 * edge * edge;
    }

    @Override
    public double volume() {
      return edge * edge * edge;
    }
  }
  /* Подсказка: круг не объемная фигура и этому классу не нужен метод volume(). */
}
