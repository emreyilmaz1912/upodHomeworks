package practices.circle;

public class Circle {
    double radius = 0.0 ;
    // final double pi = 3.14;

    public  Circle(){
    this.radius = 10;
    }
    public Circle(double n) {

        this.radius = n;
    }

    double areaCircle(){
        double area = Math.PI * Math.pow(this.radius,2);
        return area;

    }

    double perimeterCircle (){
        double  perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    void printInfo(){
        System.out.println("Dairenin alanı : " + areaCircle());
        System.out.println("Dairenin çevresi : " + perimeterCircle());

    }
}

