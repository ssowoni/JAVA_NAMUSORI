package part3;

//다형성
public class Ex3_6 {

    public static void main(String[] args) {

        String str;

        Shape shape = new Rectangle("Rectangle", 100); // upcasting
        System.out.println(shape.getType());
        shape.draw();
        //shape.getArea();  에러 발생

        Rectangle rec = (Rectangle) shape; // down casting
        System.out.println(rec.getArea());
        System.out.println(rec.getType());

    }
}



class Shape{
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void draw(){
        System.out.println("Shape draw");
    }


}

class Rectangle extends Shape{

    private double area;


    public Rectangle(String type, double area) {
        super(type);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void draw(){
        System.out.println("Rectangle draw");
    }

}