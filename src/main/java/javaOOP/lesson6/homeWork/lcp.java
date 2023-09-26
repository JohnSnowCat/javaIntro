/*  4) Переписать код в соответствии с Liskov Substitution Principle: */
public class lcp {

  public class Shape {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}
//оставляем без изменений
  public class Rectangle extends Shape{
    private int width;
    private int height;

    public void setWidth(int width) {
      this.width = width;
    }

    public void setHeight(int height) {
      this.height = height;
    }

    public int area() {
      return this.width * this.height;
    }
  }

  public class Square extends Shape {
    
    @Override
    public void setWidth(int width) {
      super.setWidth(width);
      super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
      super.setWidth(height);
      super.setHeight(height);
    }
  }
}
