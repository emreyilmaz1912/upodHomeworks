package point_Odevi;

import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moveX;
        int moveY;
        int selected = 0;
        Point firstPoint = new Point(15, 5);
        Point secondPoint = new Point(4, 15);
        Point thirdPoint = secondPoint.clone();
        Point forthPoint = new Point();

        System.out.println("Birinci Point koordinatları: " + firstPoint.getX() + ", " + firstPoint.getY());
        Point.drawPoint(firstPoint);
        System.out.println("İkinci Point koordinatları: " + secondPoint.getX() + ", " + secondPoint.getY());
        Point.drawPoint(secondPoint);
        System.out.println("Birinci Point'in merkeze uzaklığı: " + firstPoint.distanceFromCenter());
        System.out.println("Birinci Point'in ikinci Point'e uzaklık: " + firstPoint.distanceOtherPoint(secondPoint));
        System.out.println("Üçüncü Point koordinatları: " + thirdPoint.getX() + ", " + thirdPoint.getY());
        Point.drawPoint(thirdPoint);
        System.out.println("Dördüncü Point koordinatları: " + forthPoint.getX() + ", " + forthPoint.getY());
        Point.drawPoint(forthPoint);
        System.out.println("Üçüncü Point'in merkeze uzaklığı: " + thirdPoint.distanceFromCenter());
        System.out.println("Üçüncü Point'in Dördüncü Point'e uzaklık: " + thirdPoint.distanceOtherPoint(forthPoint));

        Point.drawPoint(firstPoint, secondPoint, thirdPoint, forthPoint);

        while (selected != 5) {

            String menu = "1 - Birinci Point  | " + " Koordinatları : " + firstPoint.getX() + "," + firstPoint.getY() + "\n2 - İkinci Point   | " + " Koordinatları : " + +secondPoint.getX() + ", " + secondPoint.getY() + "\n3 - Üçüncü Point   | " + " Koordinatları : " + thirdPoint.getX() + ", " + thirdPoint.getY() + "\n4 - Dördüncü Point | " + " Koordinatları : " + forthPoint.getX() + ", " + forthPoint.getY() + "\n5 - Çıkış\n";
            System.out.print(menu);
            System.out.println("Hangi pointin koordinatlarını değiştirmek istersiniz? : ");
            selected = sc.nextInt();

            switch (selected) {
                case 1:
                    System.out.println("Birinci Point x yönünde ne kadar hareket ettirisin? :");
                    moveX = sc.nextInt();
                    System.out.println("Birinci Point y yönünde ne kadar hareket ettirirsin? :");
                    moveY = sc.nextInt();
                    firstPoint.move(moveX, moveY);
                    Point.drawPoint(firstPoint, secondPoint, thirdPoint, forthPoint);
                    System.out.println("Birinci Point yeni koordinatları: " + firstPoint.getX() + ", " + firstPoint.getY());
                    break;
                case 2:
                    System.out.println("İkinci Point x yönünde ne kadar hareket ettirisin? :");
                    moveX = sc.nextInt();
                    System.out.println("İkinci Point y yönünde ne kadar hareket ettirirsin? :");
                    moveY = sc.nextInt();
                    secondPoint.move(moveX, moveY);
                    Point.drawPoint(firstPoint, secondPoint, thirdPoint, forthPoint);
                    break;
                case 3:
                    System.out.println("Üçüncü Point x yönünde ne kadar hareket ettirisin? :");
                    moveX = sc.nextInt();
                    System.out.println("Üçüncü Point y yönünde ne kadar hareket ettirirsin? :");
                    moveY = sc.nextInt();
                    thirdPoint.move(moveX, moveY);
                    Point.drawPoint(firstPoint, secondPoint, thirdPoint, forthPoint);
                    break;
                case 4:
                    System.out.println("Dördüncü Point x yönünde ne kadar hareket ettirisin? :");
                    moveX = sc.nextInt();
                    System.out.println("Dördüncü Point y yönünde ne kadar hareket ettirirsin? :");
                    moveY = sc.nextInt();
                    forthPoint.move(moveX, moveY);
                    Point.drawPoint(firstPoint, secondPoint, thirdPoint, forthPoint);
                    break;
                case 5:
                    break;
            }
        }

    }
}
