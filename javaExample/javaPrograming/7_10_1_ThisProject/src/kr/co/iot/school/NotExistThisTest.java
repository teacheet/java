package kr.co.iot.school;

class Circle{ //클래스 접근지정자가 public 이면 안된다.
    private double radius = 0;
    public void setRadius(double radius) {

        this.radius = radius;
    }
    public  double getArea(){

        return Math.PI*radius*radius;
    }
    public  void display(){

        System.out.format("반지름 %f의 넓이는 %f 임! \n",radius,getArea());
    }
}
public class NotExistThisTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.setRadius(2);
        circle2.setRadius(3);
        circle1.display();
        circle2.display();
    }
}
