package day1;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        System.out.println("마름모");
        System.out.print("마름모 크기를 입력하세요: ");                            //꼭지점 부터 가장 긴 별 출력까지의 길이

        int Num;

        Scanner scr = new Scanner(System.in);                                  // 크기 입력 받는 스캐너 선언
        Num = scr.nextInt();

        for(int line=1; line<=Num; line++)                                     // 줄 1번 부터 입력한 정수번쨰까지 반복
        {
            for(int e=0; e<Num-line; e++)                                      // 공백 출력 하기
            {
                System.out.print(" ");
            }

           for(int s =0; s<(2*line)-1; s++)                                    // 별 출력하기.
           {
               System.out.print("*");
           }
            System.out.println("");
        }

        for(int line=Num-1; line>0; line--)                                   //마름모 하단 부분 줄 반복
        {                                                                     //1-2-3-4(-3-2-1 ) 가로친 부분 나타냄.
            for(int e =0; e<Num-line; e++)                                    // 공백출력

            {
                System.out.print(" ");
            }

            for(int s=0; s <(2*line)-1; s++)                                  // 별출력하기.
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
