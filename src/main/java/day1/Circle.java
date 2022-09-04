package day1;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        int D;                      //지름
        int x, y;                   //x좌표, y좌표
        int Num;                    //입력하는 반지름
        int star;                   //별 찍히는 부분

        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 반지름을 입력하세요: ");
        Num = sc.nextInt();
        D = 2 * Num;                //지름은 반지름의 2배


        for (int row = 0; row <= D; row++) {         //행과 열 범위를 0부터 지름까지.
            for (int col = 0; col <= D; col++) {

                x = row - Num;                      //x축과 y축 요소들 만들기 위함.
                y = col - Num;                      //ex) 반지름 3이면 -3,-2,-1,0,1,2,3
                star = x * x + y * y;               //원의 공식 > 반지름^2 = (x-a)^2 + (y-b)^2
                                                    // 원의 중심이 원점이라고 가정하고 진행하면
                                                    // 원의 공식 > 반지금^2 = x^2

                if (star <= Num * Num +1) {          //원의 모양을 자연스럽게 하기 위함.
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
