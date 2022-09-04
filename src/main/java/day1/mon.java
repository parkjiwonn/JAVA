package day1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class mon {
    public static void main(String[] args) {
        System.out.println("나의 하루 일과");
        int Num ;
        Scanner scan = new Scanner(System.in);
        System.out.println(" 오전 9시 일어난다. ");
        System.out.println("1. 일어난다.  |   2. 조금 더 자게 알람을 다시 맞춘다.  ");
        Num = scan.nextInt();

        if(Num ==1 )
        {
            int Choice ;
            Scanner scan1 = new Scanner(System.in);
            System.out.println("1. 샤워를 한다. \n2. 아침을 먹는다.\n3. 운동을 한다.\n4. 공부를 한다.");
            Choice = scan1.nextInt();
            switch (Choice)
            {
                case 1:

                    System.out.println("샤워를 한 후...\n");
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("오늘 약속이 있는가?\n1. Yes\t2. No");
                    int Num2;
                    Num2 = scan2.nextInt();
                    if(Num2==1)
                    {
                        System.out.println("화장을 한다.");

                        System.out.println("오늘 누구를 만나는가?\n친구\t애인\t그외");


                        Scanner InputStr1 = new Scanner(System.in);
                        String str1 = InputStr1.nextLine();


                        if ("애인".equals(str1))
                        {
                            System.out.println("커플티 입고 나가기");
                            System.out.println("오늘 비가 오는가?\n1.YES\t2.NO");

                            int Rain;
                            Scanner ScanRain = new Scanner(System.in);
                            Rain = ScanRain.nextInt();

                            if (Rain == 1) {
                                System.out.println("우산을 챙겨나간다.");
                                System.out.println("<나가기 전에 마스크 확인>");
                                System.out.println("마스크 챙겼는가?\n1.YES\t2.NO");

                                int Mask;
                                Scanner ScanMask = new Scanner(System.in);
                                Mask = ScanMask.nextInt();

                                if (Mask == 2) {
                                    System.out.println("마스크를 챙기러 간다.");
                                    System.out.println("오늘 사람이 많이 모이는 곳에 가는가?\n1.YES\t2.NO");

                                    int People;
                                    Scanner ScanPeople = new Scanner(System.in);
                                    People = ScanPeople.nextInt();

                                    if (People == 1) {
                                        System.out.println("KF-94 마스크를 챙긴다.");
                                        System.out.println("나갈 준비를 한다.");
                                    } else {
                                        System.out.println("덴탈 마스크를 챙긴다.");
                                        System.out.println("나갈 준비를 한다.");
                                    }


                                } else {
                                    System.out.println("마스크 쓰고 나갈 준비를 한다.");

                                }


                            } else
                            {
                                System.out.println("우산 없이 외출한다.");
                                System.out.println("나가기전 마스크 챙겼는가?\n1.Yes\t2.No");

                                int Mask2 ;
                                Scanner ScanMask2= new Scanner(System.in);
                                Mask2=ScanMask2.nextInt();

                                if(Mask2==1)
                                {
                                    System.out.println("마스크 쓰고 외출한다.");
                                }

                                else
                                {
                                    System.out.println("마스크를 챙기러 간다.");
                                    System.out.println("오늘 사람 많은곳으로 가는가?\n1.Yes\t2.No");

                                    int Peo2;
                                    Scanner ScanPeo2 = new Scanner(System.in);
                                    Peo2=ScanPeo2.nextInt();

                                    if(Peo2==1)
                                    {
                                        System.out.println("KF-94 마스크를 쓴다.");
                                    }

                                    else
                                    {
                                        System.out.println("덴탈마스크를 쓴다.");
                                    }

                                }

                            }
                        }



                        else if("친구".equals(str1))
                        {
                            int Cloth ;
                            Scanner ScanCloth = new Scanner(System.in);

                            System.out.println("친구와 옷을 맞춰입기로 했나요?\n1.Yes\t2.No");
                            Cloth = ScanCloth.nextInt();

                            if(Cloth==1)
                            {
                                System.out.println("트윈룩 입고 나가기");
                                System.out.println("오늘 비가 오는가?\n1.Yes\t2.No");

                                int Rain2;
                                Scanner ScanRain2 = new Scanner(System.in);
                                Rain2= ScanRain2.nextInt();

                                if(Rain2==1)
                                {
                                    System.out.println("우산을 챙겨나간다.");
                                    System.out.println("마스크를 챙겼는가?\n1.Yes\t2.No");

                                    int Mask3 ;
                                    Scanner ScanMask3 = new Scanner(System.in);
                                    Mask3= ScanMask3.nextInt();

                                    if (Mask3==2)
                                    {
                                        System.out.println("오늘 사람이 많이 모이는 곳에 가는가?\n1.Yes\t2.No");
                                        int Peo3;
                                        Scanner ScanPeo3 = new Scanner(System.in);
                                        Peo3=ScanPeo3.nextInt();

                                        if(Peo3==1)
                                        {
                                            System.out.println("kF-94 마스크를 챙겨나간다.");
                                        }

                                        else
                                        {
                                            System.out.println("덴탈 마스크를 챙겨나간다.");
                                        }
                                    }

                                    else
                                    {
                                        System.out.println("마스크 쓰고 외출한다.");
                                    }

                                }

                                else
                                {
                                    System.out.println("우산 없이 그냥 나간다.");
                                    System.out.println("마스크를 챙겼는가?\n1.Yes\t2.No");

                                    int Mask4 ;
                                    Scanner ScanMask4 = new Scanner(System.in);
                                    Mask4= ScanMask4.nextInt();

                                    if (Mask4==2)
                                    {
                                        System.out.println("마스크를 챙기러 간다.");
                                        System.out.println("오늘 사람이 많이 모이는 곳에 가는가?\n1.Yes\t2.No");
                                        int Peo4;
                                        Scanner ScanPeo4 = new Scanner(System.in);
                                        Peo4=ScanPeo4.nextInt();

                                        if(Peo4==1)
                                        {
                                            System.out.println("kF-94 마스크를 챙겨나간다.");
                                        }

                                        else
                                        {
                                            System.out.println("덴탈 마스크를 챙겨나간다.");
                                        }
                                    }

                                    else
                                    {
                                        System.out.println("마스크 쓰고 외출한다.");
                                    }
                                }


                            }
                            else
                            {
                                System.out.println("아무 옷이나 입고 나가기");
                                System.out.println("오늘 비가 오는가?\n1.Yes\t2.No");

                                int Rain3;
                                Scanner ScanRain3 = new Scanner(System.in);
                                Rain3= ScanRain3.nextInt();

                                if(Rain3==1)
                                {
                                    System.out.println("우산을 챙겨 나간다.");
                                    System.out.println("마스크를 챙겼는가?\n1.Yes\t2.No");

                                    int Mask5;
                                    Scanner ScanMask5 =new Scanner(System.in);
                                    Mask5 = ScanMask5.nextInt();

                                    if(Mask5 == 1)
                                    {
                                        System.out.println("마스크 쓰고 나간다.");
                                    }

                                    else
                                    {
                                        System.out.println("마스크를 챙기러 간다.");
                                        System.out.println("오늘 사람 많은 곳을 가는가?\n1.Yes\t2.No");

                                        int Peo5;
                                        Scanner ScanPeo5 = new Scanner(System.in);
                                        Peo5=ScanPeo5.nextInt();

                                        if(Peo5==1)
                                        {
                                            System.out.println("KF-94 마스크를 착용한다.");
                                        }

                                        else
                                        {

                                            System.out.println("덴탈마스크를 착용한다.");

                                        }
                                    }
                                }

                                else
                                {
                                    System.out.println("우산을 챙기지 않고 그냥 나간다.");
                                    System.out.println("마스크를 챙겼는가?\n1.Yes\t2.No");

                                    int Mask6;
                                    Scanner ScanMask6 =new Scanner(System.in);
                                    Mask6 = ScanMask6.nextInt();

                                    if(Mask6 == 1)
                                    {
                                        System.out.println("마스크 쓰고 나간다.");
                                    }

                                    else
                                    {
                                        System.out.println("마스크를 챙기러 간다.");
                                        System.out.println("오늘 사람 많은 곳을 가는가?\n1.Yes\t2.No");

                                        int Peo6;
                                        Scanner ScanPeo6 = new Scanner(System.in);
                                        Peo6=ScanPeo6.nextInt();

                                        if(Peo6==1)
                                        {
                                            System.out.println("KF-94 마스크를 착용한다.");
                                        }

                                        else
                                        {

                                            System.out.println("덴탈마스크를 착용한다.");

                                        }
                                    }

                                }





                            }
                        }
                        else
                        {
                            System.out.println("옷 대충 입고 나가기.");
                            System.out.println("오늘 비가 오는가?\n1.Yes\t2.No");

                            int Rain4;
                            Scanner ScanRain4 = new Scanner(System.in);
                            Rain4= ScanRain4.nextInt();

                            if(Rain4==1)
                            {
                                System.out.println("우산을 챙겨 나간다.");
                                System.out.println("마스크를 챙겼는가?\n1.Yes\t2.No");

                                int Mask6;
                                Scanner ScanMask6 =new Scanner(System.in);
                                Mask6 = ScanMask6.nextInt();

                                if(Mask6 == 1)
                                {
                                    System.out.println("마스크 쓰고 나간다.");
                                }

                                else
                                {
                                    System.out.println("마스크를 챙기러 간다.");
                                    System.out.println("오늘 사람 많은 곳을 가는가?\n1.Yes\t2.No");

                                    int Peo6;
                                    Scanner ScanPeo6 = new Scanner(System.in);
                                    Peo6=ScanPeo6.nextInt();

                                    if(Peo6==1)
                                    {
                                        System.out.println("KF-94 마스크를 착용한다.");
                                    }

                                    else
                                    {

                                        System.out.println("덴탈마스크를 착용한다.");

                                    }
                                }
                            }

                            else
                            {
                                System.out.println("우산을 챙기지 않고 그냥 나간다.");
                                System.out.println("마스크를 챙겼는가?\n1.Yes\t2.No");

                                int Mask7;
                                Scanner ScanMask7 =new Scanner(System.in);
                                Mask7 = ScanMask7.nextInt();

                                if(Mask7 == 1)
                                {
                                    System.out.println("마스크 쓰고 나간다.");
                                }

                                else
                                {
                                    System.out.println("마스크를 챙기러 간다.");
                                    System.out.println("오늘 사람 많은 곳을 가는가?\n1.Yes\t2.No");

                                    int Peo7;
                                    Scanner ScanPeo7 = new Scanner(System.in);
                                    Peo7=ScanPeo7.nextInt();

                                    if(Peo7==1)
                                    {
                                        System.out.println("KF-94 마스크를 착용한다.");
                                    }

                                    else
                                    {

                                        System.out.println("덴탈마스크를 착용한다.");

                                    }
                                }

                            }

                        }

                        break;




                    }
                    else
                    {

                        System.out.println("기초제품만 바른다.");
                        System.out.println("오늘 자외선이 강한 날씨인가?\n1.Yes\t2.No");

                        int Sun;
                        Scanner ScanSun = new Scanner(System.in);
                        Sun = ScanSun.nextInt();

                        if(Sun == 1)
                        {
                            System.out.println("썬크림을 많이 바른다.");
                        }

                        else
                        {
                            System.out.println("썬크림을 적당히 바른다.");
                        }

                        break;





                    }

                case 2:
                    System.out.println("부얶으로 나간다.");
                    System.out.println("냉장고에 먹을게 있나?\n1.Yes\t2.No");
                    int Num4;
                    Scanner ScanFood = new Scanner(System.in);
                    Num4 = ScanFood.nextInt();

                    if (Num4==1)
                    {
                        System.out.println("알아서 요리해 먹는다.");
                        System.out.println("현재 식단조절를 하는가?\n1.Yes\t2.No");

                        int Breakfast ;
                        Scanner ScanBr = new Scanner(System.in);
                        Breakfast=ScanBr.nextInt();

                        if(Breakfast==1)
                        {
                            System.out.println("냉동고를 열어 닭가슴살을 해동시킨다.");
                            System.out.println("집에 고구마가 있는가?\n1.Yes\t2.No");

                            int Sweet;
                            Scanner ScanSweet = new Scanner(System.in);
                            Sweet = ScanSweet.nextInt();

                            if(Sweet==1)
                            {
                                System.out.println("고구마랑 닭가슴살을 같이 먹는다.");

                            }
                            else
                            {
                                System.out.println("닭가슴살만 먹는다.");
                            }


                        }

                        else
                        {
                            System.out.println("집에 있는 재료들로 아침을 해먹는다.");
                            System.out.println("혹시 요리하기 귀찮은가?\n1.Yes\t2.No");

                            int Ans ;
                            Scanner ScanAns = new Scanner(System.in);
                            Ans = ScanAns.nextInt();

                            if(Ans ==1)
                            {
                                System.out.println("아침을 건너뛴다.");
                            }

                            else
                            {
                                System.out.println("냉장고 안 김치통을 열어본다.");
                                System.out.println("김치가 잘 익었는가?\n1.묵은지\t2.적당히 잘 익음\t3.겉절이 그자체");

                                int Kim;
                                Scanner ScanKim = new Scanner(System.in);
                                Kim = ScanKim.nextInt();

                                switch (Kim)
                                {

                                    case 1 :
                                        System.out.println("묶은지로 김치찌개를 해먹는다.");
                                        System.out.println("혹시 밥이 없는가?\n1.Yes\t2.No");
                                        int Rice ;
                                        Scanner ScanRice = new Scanner(System.in);
                                        Rice = ScanRice.nextInt();

                                        if(Rice==1)
                                        {
                                            System.out.println("햇반도 없는가?\n1.Yes\t2.No");

                                            int Hat;
                                            Scanner ScanHat = new Scanner(System.in);
                                            Hat = ScanHat.nextInt();

                                            if(Hat==1)
                                            {
                                                System.out.println("밥을 새로 지어서 같이 먹는다.");
                                            }

                                            else
                                            {
                                                System.out.println("햇반 돌려서 같이 먹는다.");
                                            }

                                        }

                                        else
                                        {
                                            System.out.println("밥을 퍼서 같이 먹는다.");
                                        }


                                        break;

                                    case 2:
                                        System.out.println("김치볶음밥을 해먹는다.");
                                        System.out.println("혹시 밥이 없는가?\n1.Yes\t2.No");
                                        int Rice2 ;
                                        Scanner ScanRice2 = new Scanner(System.in);
                                        Rice2 = ScanRice2.nextInt();

                                        if(Rice2==1)
                                        {
                                            System.out.println("햇반도 없는가?\n1.Yes\t2.No");

                                            int Hat2;
                                            Scanner ScanHat2 = new Scanner(System.in);
                                            Hat2 = ScanHat2.nextInt();

                                            if(Hat2==1)
                                            {
                                                System.out.println("밥을 새로 지어서 같이 먹는다.");
                                            }

                                            else
                                            {
                                                System.out.println("햇반 돌려서 같이 먹는다.");
                                            }

                                        }

                                        else
                                        {
                                            System.out.println("밥을 퍼서 같이 먹는다.");
                                        }

                                        break;

                                    case 3 :
                                        System.out.println("혹시 냉장고에 고기가 있는가?\n1.Yes\t2.No");

                                        int Meat ;
                                        Scanner ScanMeat = new Scanner(System.in);
                                        Meat = ScanMeat.nextInt();

                                        if(Meat==1)
                                        {
                                            System.out.println("고기를 삶아서 보쌈을 만든다.");
                                            System.out.println("보쌈과 같이 먹는다.");
                                        }

                                        else
                                        {
                                            System.out.println("혹시 밥이 없는가?\n1.Yes\t2.No");
                                            int Rice3 ;
                                            Scanner ScanRice3 = new Scanner(System.in);
                                            Rice3 = ScanRice3.nextInt();

                                            if(Rice3==1)
                                            {
                                                System.out.println("햇반도 없는가?\n1.Yes\t2.No");

                                                int Hat3;
                                                Scanner ScanHat3 = new Scanner(System.in);
                                                Hat3 = ScanHat3.nextInt();

                                                if(Hat3==1)
                                                {
                                                    System.out.println("밥을 새로 지어서 같이 먹는다.");
                                                }

                                                else
                                                {
                                                    System.out.println("햇반 돌려서 같이 먹는다.");
                                                }

                                            }

                                            else
                                            {
                                                System.out.println("밥을 퍼서 같이 먹는다.");
                                            }

                                        }


                                }


                            }



                        }



                    }
                    else
                    {
                        System.out.println("밖에 못나갈정도로 추운가?\n1.Yes\t2.No");
                        int Num5;
                        Scanner ScanOut = new Scanner(System.in);
                        Num5 = ScanOut.nextInt();
                        if(Num5==1)
                        {
                            int Money ;
                            System.out.println("15000원 마라탕을 시켜먹고싶은데");
                            System.out.println("배달 시킬정도로 잔고가 넉넉한가?");
                            System.out.println("본인의 잔고를 입력하시오 : ");
                            Scanner ScanMoney = new Scanner(System.in);
                            Money = ScanMoney.nextInt();
                            if(Money<15000)
                            {
                                System.out.println("돈을 아끼기 위해 굶는다.");

                            }
                            else
                            {
                                System.out.println("배달 시켜먹는다.");
                            }

                        }
                        else
                        {
                            System.out.println("나가서 사먹는다.");
                            System.out.println("어떤 음식을 사먹을 것인가?");

                            System.out.println("어제 먹은 음식의 종류는?\n1. 한식\t2.양식\t3.일식");

                            int Dish;
                            Scanner ScanDish = new Scanner(System.in);
                            Dish = ScanDish.nextInt();

                            switch (Dish)
                            {

                                case 1 :
                                    System.out.println("어제 먹은 음식과 똑같아도 상관없나?\n1.Yes\t2.No");

                                    int Care;
                                    Scanner ScanCare = new Scanner(System.in);
                                    Care = ScanCare.nextInt();

                                    if(Care==1)
                                    {
                                        System.out.println("그러면 한식을 먹는다.");
                                    }
                                    else
                                    {
                                        System.out.println("그러면 양식과 일식 중 하나를 고른다.");
                                        System.out.println("지금 시간에 가장 사람이 붐비는 식당은 어디인가?");

                                        Scanner FoodStr3 = new Scanner(System.in);
                                        String str1 = FoodStr3.nextLine();

                                        if("일식".equals(str1))
                                        {
                                            System.out.println("집 근처 양식을 먹을 수 있는 식당으로 간다.");
                                        }

                                        else
                                        {
                                            System.out.println("집 근처 일식을 먹을 수 있는 식당으로 간다.");
                                        }
                                    }

                                    break;



                                case 2 :

                                    System.out.println("어제 먹은 음식과 똑같아도 상관없나?\n1.Yes\t2.No");
                                    int Care2;
                                    Scanner ScanCare2 = new Scanner(System.in);
                                    Care2 = ScanCare2.nextInt();

                                    if(Care2 ==1)
                                    {
                                        System.out.println("그러면 양식을 먹는다.");
                                    }

                                    else
                                    {
                                        System.out.println("그러면 한식과 일식 중 하나를 고른다.");
                                        System.out.println("지금 시간에 가장 사람이 붐비는 식당은 어디인가?");

                                        Scanner FoodStr2 = new Scanner(System.in);
                                        String str1 = FoodStr2.nextLine();

                                        if("한식".equals(str1))
                                        {
                                            System.out.println("집 근처 일식을 먹을 수 있는 식당으로 간다.");
                                        }

                                        else
                                        {
                                            System.out.println("집 근처 한식을 먹을 수 있는 식당으로 간다.");
                                        }
                                    }

                                    break;



                                case 3 :

                                    System.out.println("어제 먹은 음식과 똑같아도 상관없나?\n1.Yes\t2.No");

                                    int Care3;
                                    Scanner ScanCare3 = new Scanner(System.in);
                                    Care3 = ScanCare3.nextInt();

                                    if(Care3 ==1)
                                    {
                                        System.out.println("그러면 일식을 먹는다.");
                                    }

                                    else
                                    {
                                        System.out.println("그러면 한식과 양식 중 하나를 고른다.");
                                        System.out.println("지금 시간에 가장 사람이 붐비는 식당은 어디인가?");

                                        Scanner FoodStr1 = new Scanner(System.in);
                                        String str1 = FoodStr1.nextLine();

                                        if("한식".equals(str1))
                                        {
                                            System.out.println("집 근처 양식을 먹을 수 있는 식당으로 간다.");
                                        }

                                        else
                                        {
                                            System.out.println("집 근처 한식을 먹을 수 있는 식당으로 간다.");
                                        }

                                    }

                                    break;


                            }


                        }
                    }

                    break;

                case 3:
                    System.out.println("오늘의 날씨를 확인한다...");
                    System.out.println("비가 올 예정인가?\n1.Yes\t2.No");
                    int Num6;
                    Scanner ScanWeather = new Scanner(System.in);
                    Num6 = ScanWeather.nextInt();

                    if(Num6==1)
                    {

                        System.out.println("런닝머신을 탄다.");
                        System.out.println("버즈를 들고 왔는가?\n1.yes\t2.No");
                        int Buzz ;
                        Scanner ScanBuzz = new Scanner(System.in);
                        Buzz = ScanBuzz.nextInt();

                        if(Buzz==1)
                        {
                            System.out.println("넷플릭스보면서 런닝하기");
                        }
                        else
                        {
                            System.out.println("런닝머신 앞 티비 보며 런닝하기.");
                        }
                    }
                    else
                    {
                        System.out.println("조깅을 한다.");
                        System.out.println("같이 조깅을 하는 친구와 시간이 맞는가?\n1.yes\t2.No");
                        int Friend;
                        Scanner ScanFriend = new Scanner(System.in);
                        Friend = ScanFriend.nextInt();

                        if(Friend ==1)
                        {
                            System.out.println("친구와 함께 조깅을 한다.");
                            System.out.println("이후에 스케줄이 서로 없는가?\n1.yes\t2.No");
                            int Schedule;
                            Scanner ScanSchedule = new Scanner(System.in);
                            Schedule = ScanSchedule.nextInt();

                            if(Schedule==1)
                            {
                                System.out.println("친구와 함께 밥을 먹는다.");
                            }
                            else
                            {
                                System.out.println("집에 간다.");
                            }

                        }

                        else
                        {
                            System.out.println("집에 간다.");
                        }

                    }

                    break;



                case 4:
                    System.out.println("공부를 한다.");
                    System.out.println("오늘 학원가서 공부할 것인가?\n1.yes\t2.No");
                    int Num7;
                    Scanner ScanStudy = new Scanner(System.in);
                    Num7 = ScanStudy.nextInt();

                    if(Num7==1)
                    {
                        System.out.println("학원을 간다...");
                        System.out.println("학원가기전 카페를 들를 것인가?\n1.Yes\t2.No");

                        int Cafe ;
                        Scanner ScanCafe = new Scanner(System.in);
                        Cafe = ScanCafe.nextInt();

                        if(Cafe ==1)
                        {
                            System.out.println("======================MENU=========================");
                            System.out.println("1. 아메리카노 3500원\t2.카페라떼 4000원\t3.프라페 5000원\n");

                            System.out.println("지금 내 잔고 상태는?");
                            int Wallet ;
                            Scanner ScanWallet = new Scanner(System.in);
                            Wallet = ScanWallet.nextInt();

                            if(Wallet <=3500)
                            {
                                System.out.println("현재 잔고로는 아메리카노도 마실수 없습니다.");
                                System.out.println("포기하고 학원으로 간다.");
                                System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                int Question;
                                Scanner ScanQ = new Scanner(System.in);
                                Question = ScanQ.nextInt();

                                if(Question == 1)
                                {
                                    System.out.println("2학원에서 공부한다.");
                                }
                                else
                                {
                                    System.out.println("1학원에서 공부한다.");
                                }
                            }

                            else if(Wallet<4000)
                            {
                                System.out.println("현재잔고로는 아메리카노만 주문할 수 있습니다.");
                                System.out.println("어떤 아메리카노를 선택하겠습니까?\n1.ICE\t2.HOT");
                                int Ice;
                                Scanner ScanIce = new Scanner(System.in);
                                Ice = ScanIce.nextInt();

                                if(Ice==1)
                                {
                                    System.out.println("아이스 아메리카노를 주문했습니다..");
                                    System.out.println("이젠 학원으로 간다.");
                                    System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                    int Question;
                                    Scanner ScanQ = new Scanner(System.in);
                                    Question = ScanQ.nextInt();

                                    if(Question == 1)
                                    {
                                        System.out.println("2학원에서 공부한다.");
                                    }
                                    else
                                    {
                                        System.out.println("1학원에서 공부한다.");
                                    }

                                }

                                else
                                {
                                    System.out.println("따뜻한 아메리카노를 주문했습니다..");
                                    System.out.println("이젠 학원으로 간다.");
                                    System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                    int Question;
                                    Scanner ScanQ = new Scanner(System.in);
                                    Question = ScanQ.nextInt();

                                    if(Question == 1)
                                    {
                                        System.out.println("2학원에서 공부한다.");
                                    }
                                    else
                                    {
                                        System.out.println("1학원에서 공부한다.");
                                    }
                                }

                            }



                            else if (Wallet<=4000 || Wallet<5000)
                            {
                                System.out.println("현재 잔고로는 아메리카노 및 카페라떼를 마실 수 있습니다.");
                                System.out.println("어떤 음료수를 마시겠는가?\n1.아메리카노\t2.카페라떼");

                                int Drink ;
                                Scanner ScanDrink = new Scanner(System.in);
                                Drink = ScanDrink.nextInt();

                                if(Drink == 1)
                                {
                                    System.out.println("어떤 아메리카노를 선택하겠습니까?\n1.ICE\t2.HOT");
                                    int Ice;
                                    Scanner ScanIce = new Scanner(System.in);
                                    Ice = ScanIce.nextInt();

                                    if(Ice==1)
                                    {
                                        System.out.println("아이스 아메리카노를 주문했습니다..");
                                        System.out.println("이젠 학원으로 간다.");
                                        System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                        int Question;
                                        Scanner ScanQ = new Scanner(System.in);
                                        Question = ScanQ.nextInt();

                                        if(Question == 1)
                                        {
                                            System.out.println("2학원에서 공부한다.");
                                        }
                                        else
                                        {
                                            System.out.println("1학원에서 공부한다.");
                                        }

                                    }

                                    else
                                    {
                                        System.out.println("따뜻한 아메리카노를 주문했습니다..");
                                        System.out.println("이젠 학원으로 간다.");
                                        System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                        int Question;
                                        Scanner ScanQ = new Scanner(System.in);
                                        Question = ScanQ.nextInt();

                                        if(Question == 1)
                                        {
                                            System.out.println("2학원에서 공부한다.");
                                        }
                                        else
                                        {
                                            System.out.println("1학원에서 공부한다.");
                                        }
                                    }
                                }

                                else
                                {

                                    System.out.println("어떤 카페라떼를 선택하겠습니까?\n1.ICE\t2.HOT");
                                    int Ice2;
                                    Scanner ScanIce2 = new Scanner(System.in);
                                    Ice2 = ScanIce2.nextInt();

                                    if(Ice2==1)
                                    {
                                        System.out.println("아이스 카페라떼를 주문했습니다..");
                                        System.out.println("이젠 학원으로 간다.");
                                        System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                        int Question;
                                        Scanner ScanQ = new Scanner(System.in);
                                        Question = ScanQ.nextInt();

                                        if(Question == 1)
                                        {
                                            System.out.println("2학원에서 공부한다.");
                                        }
                                        else
                                        {
                                            System.out.println("1학원에서 공부한다.");
                                        }

                                    }

                                    else
                                    {
                                        System.out.println("따뜻한 카페라떼를 주문했습니다..");
                                        System.out.println("이젠 학원으로 간다.");
                                        System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                        int Question;
                                        Scanner ScanQ = new Scanner(System.in);
                                        Question = ScanQ.nextInt();

                                        if(Question == 1)
                                        {
                                            System.out.println("2학원에서 공부한다.");
                                        }
                                        else
                                        {
                                            System.out.println("1학원에서 공부한다.");
                                        }
                                    }
                                }


                            }


                            else if (Wallet>=5000)
                            {
                                System.out.println("현재 잔고로는 모든 메뉴를 마실 수 있습니다.");
                                System.out.println("어떤 음료수를 마시겠는가?\n1.아메리카노\t2.카페라떼\t3.프라페");

                                int Drink5;
                                Scanner ScanDrink5 = new Scanner(System.in);
                                Drink5 = ScanDrink5.nextInt();

                                switch (Drink5)
                                {

                                    case 1 :

                                        System.out.println("어떤 아메리카노를 선택하겠습니까?\n1.ICE\t2.HOT");
                                        int Ice3;
                                        Scanner ScanIce3 = new Scanner(System.in);
                                        Ice3 = ScanIce3.nextInt();

                                        if(Ice3==1)
                                        {
                                            System.out.println("아이스 아메리카노를 주문했습니다..");
                                            System.out.println("이젠 학원으로 간다.");
                                            System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                            int Question;
                                            Scanner ScanQ = new Scanner(System.in);
                                            Question = ScanQ.nextInt();

                                            if(Question == 1)
                                            {
                                                System.out.println("2학원에서 공부한다.");
                                            }
                                            else
                                            {
                                                System.out.println("1학원에서 공부한다.");
                                            }

                                        }

                                        else
                                        {
                                            System.out.println("따뜻한 아메리카노를 주문했습니다..");
                                            System.out.println("이젠 학원으로 간다.");
                                            System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                            int Question;
                                            Scanner ScanQ = new Scanner(System.in);
                                            Question = ScanQ.nextInt();

                                            if(Question == 1)
                                            {
                                                System.out.println("2학원에서 공부한다.");
                                            }
                                            else
                                            {
                                                System.out.println("1학원에서 공부한다.");
                                            }
                                        }

                                        break;

                                    case 2 :

                                        System.out.println("어떤 카페라떼를 선택하겠습니까?\n1.ICE\t2.HOT");
                                        int Ice4;
                                        Scanner ScanIce4 = new Scanner(System.in);
                                        Ice4 = ScanIce4.nextInt();

                                        if(Ice4==1)
                                        {
                                            System.out.println("아이스 카페라떼를 주문했습니다..");
                                            System.out.println("이젠 학원으로 간다.");
                                            System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                            int Question;
                                            Scanner ScanQ = new Scanner(System.in);
                                            Question = ScanQ.nextInt();

                                            if(Question == 1)
                                            {
                                                System.out.println("2학원에서 공부한다.");
                                            }
                                            else
                                            {
                                                System.out.println("1학원에서 공부한다.");
                                            }

                                        }

                                        else
                                        {
                                            System.out.println("따뜻한 카페라떼를 주문했습니다..");
                                            System.out.println("이젠 학원으로 간다.");
                                            System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                            int Question;
                                            Scanner ScanQ = new Scanner(System.in);
                                            Question = ScanQ.nextInt();

                                            if(Question == 1)
                                            {
                                                System.out.println("2학원에서 공부한다.");
                                            }
                                            else
                                            {
                                                System.out.println("1학원에서 공부한다.");
                                            }
                                        }

                                        break;

                                    case 3:
                                        System.out.println("프라페를 주문했습니다.");
                                        System.out.println("프라페를 받고 카페를 나온다.");
                                        System.out.println("이젠 학원으로 간다.");
                                        System.out.println("질문이 많은가?\n1.Yes\t2.No");
                                        int Question;
                                        Scanner ScanQ = new Scanner(System.in);
                                        Question = ScanQ.nextInt();

                                        if(Question == 1)
                                        {
                                            System.out.println("2학원에서 공부한다.");
                                        }
                                        else
                                        {
                                            System.out.println("1학원에서 공부한다.");
                                        }

                                        break;




                                }



                            }






                        }

                        else
                        {
                            System.out.println("카페를 가지 않고 그냥 학원을 간다.");
                            System.out.println("질문이 많은가?\n1.Yes\t2.No");
                            int Question;
                            Scanner ScanQ = new Scanner(System.in);
                            Question = ScanQ.nextInt();

                             if(Question == 1)
                             {
                                System.out.println("2학원에서 공부한다.");
                             }
                             else
                             {
                            System.out.println("1학원에서 공부한다.");
                             }

                        }


                    }
                    else
                    {
                        System.out.println("오늘 한파주의보인가?\n1.yes\t2.No");
                        int Where;
                        Scanner ScanWhere = new Scanner(System.in);
                        Where = ScanWhere.nextInt();

                        if(Where ==1)
                        {
                            System.out.println("집에서 공부한다.\n");
                            System.out.println("간식을 먹으면서 공부할 것인가?\n1.yes\t2.No");

                            int Snack;
                            Scanner ScanSnack = new Scanner(System.in);
                            Snack = ScanSnack.nextInt();

                            if(Snack==1)
                            {
                                System.out.println("지금 다이어트 중인가?\n1.yes\t2.No");

                                int Diet ;
                                Scanner ScanDiet = new Scanner(System.in);
                                Diet = ScanDiet.nextInt();

                                if (Diet==1)
                                {
                                    System.out.println("냉장고 문을 닫는다.");
                                    System.out.println("다시 방에 들어와 공부를 한다.");
                                }

                                else
                                {
                                    System.out.println("냉장고 문을 연다.");
                                    System.out.println("<집에 있는 간식>");
                                    System.out.println("1. 어제 먹다 남은 케이크");
                                    System.out.println("2. 과일");
                                    System.out.println("어떤 것을 먹을 것인가?");

                                    int Food;
                                    Scanner Scan10 = new Scanner(System.in);
                                    Food = Scan10.nextInt();

                                    if(Food==1)
                                    {
                                        System.out.println("커피랑 같이 먹을 것인가?\n1.YES\t2.NO");

                                        int Coffee;
                                        Scanner ScanCo = new Scanner(System.in);
                                        Coffee = ScanCo.nextInt();

                                        if(Coffee==1)
                                        {
                                            System.out.println("커피랑 케잌을 먹으면서 공부를 한다.");
                                        }
                                        else
                                        {
                                            System.out.println("케잌만 먹으면서 공부를 한다.");

                                        }


                                    }


                                }

                            }

                            else
                            {
                                System.out.println("간식을 먹지 않고 공부를 한다.");

                            }






                        }
                        else
                        {
                            System.out.println("스터디 카페에 가서 공부한다.");
                            System.out.println("스터디 카페에 어떻게 갈 것인가?");
                            System.out.println("1. 걸어서    2. 버스를 탄다.");
                            int Way ;
                            Scanner ScanWay = new Scanner(System.in);
                            Way = ScanWay.nextInt();

                            if (Way == 1)
                            {
                                System.out.println("걸어간다.");
                                System.out.println("가는 길이 심심한가?\n1.yes\t2.No");

                                int Boring ;
                                Scanner ScanBo = new Scanner(System.in);
                                Boring = ScanBo.nextInt();

                                if(Boring == 1)
                                {
                                    System.out.println("음악을 들으며 간다. 음악을 골라보자");
                                    System.out.println("오늘의 어떤 노래를 들을 것인가?");
                                    System.out.println("1. 아이돌 음악\t2. 밴드 음악 \t3. 발라드");

                                    int Music1;
                                    Scanner ScanNu = new Scanner(System.in);
                                    Music1 = ScanNu.nextInt();

                                    switch (Music1)
                                    {

                                        case 1:
                                            System.out.println(" 어떤 아이돌의 음악을 들을 것인가?");
                                            System.out.println("1. 요즘 아이돌\t2. 옛날 아이돌");

                                            int Idol;
                                            Scanner ScanIdol = new Scanner(System.in);
                                            Idol = ScanIdol.nextInt();

                                            if(Idol==1)
                                            {
                                                System.out.println("요즘 아이돌 음악 Playlist를 듣는다.");
                                                System.out.println("듣고 있는 음악이 질리는가?\n1.YES\t2.NO");

                                                int Sicked;
                                                Scanner ScanSicked = new Scanner(System.in);
                                                Sicked = ScanSicked.nextInt();

                                                if (Sicked==1)
                                                {
                                                    System.out.println("다른 음악을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                                else
                                                {
                                                    System.out.println("계속 그 음악들을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                            }

                                            else
                                            {

                                                System.out.println("옛날 아이돌 음악 Playlist를 듣는다.");
                                                System.out.println("듣고 있는 음악이 질리는가?\n1.YES\t2.NO");

                                                int Sicked2;
                                                Scanner ScanSicked2 = new Scanner(System.in);
                                                Sicked2 = ScanSicked2.nextInt();

                                                if (Sicked2==1)
                                                {
                                                    System.out.println("다른 음악을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                                else
                                                {
                                                    System.out.println("계속 그 음악들을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }


                                            }


                                            break;




                                        case 2:

                                            System.out.println("어떤 밴드 음악을 들을 것 인가?");
                                            System.out.println("1. 옛날 밴드 음악\t2. 요즘 밴드 밴드");

                                            int Band1;
                                            Scanner ScanBand1 = new Scanner(System.in);
                                            Band1 = ScanBand1.nextInt();

                                            if(Band1==1)
                                            {
                                                System.out.println("옛날 밴드 음악 Playlist를 듣는다.");
                                                System.out.println("듣고 있는 음악이 질리는가?\n1.YES\t2.NO");

                                                int Sicked3;
                                                Scanner ScanSicked3 = new Scanner(System.in);
                                                Sicked3 = ScanSicked3.nextInt();

                                                if (Sicked3==1)
                                                {
                                                    System.out.println("다른 음악을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                                else
                                                {
                                                    System.out.println("계속 그 음악들을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                            }

                                            else
                                            {

                                                System.out.println("요즘 밴드 음악 Playlist를 듣는다.");
                                                System.out.println("듣고 있는 음악이 질리는가?\n1.YES\t2.NO");

                                                int Sicked4;
                                                Scanner ScanSicked4 = new Scanner(System.in);
                                                Sicked4 = ScanSicked4.nextInt();

                                                if (Sicked4==1)
                                                {
                                                    System.out.println("다른 음악을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                                else
                                                {
                                                    System.out.println("계속 그 음악들을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }


                                            }


                                            break;



                                        case 3:

                                            System.out.println("어떤 발라드 음악을 들을 것 인가?");
                                            System.out.println("1. 옛날 발라드 음악\t2. 요즘 발라드 밴드");

                                            int Bal1;
                                            Scanner ScanBal1 = new Scanner(System.in);
                                            Bal1 = ScanBal1.nextInt();

                                            if(Bal1==1)
                                            {
                                                System.out.println("옛날 발라드 음악 Playlist를 듣는다.");
                                                System.out.println("듣고 있는 음악이 질리는가?\n1.YES\t2.NO");

                                                int Sicked5;
                                                Scanner ScanSicked5 = new Scanner(System.in);
                                                Sicked5 = ScanSicked5.nextInt();

                                                if (Sicked5==1)
                                                {
                                                    System.out.println("다른 음악을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                                else
                                                {
                                                    System.out.println("계속 그 음악들을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                            }

                                            else
                                            {

                                                System.out.println("요즘 발라드 음악 Playlist를 듣는다.");
                                                System.out.println("듣고 있는 음악이 질리는가?\n1.YES\t2.NO");

                                                int Sicked6;
                                                Scanner ScanSicked6 = new Scanner(System.in);
                                                Sicked6 = ScanSicked6.nextInt();

                                                if (Sicked6==1)
                                                {
                                                    System.out.println("다른 음악을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }

                                                else
                                                {
                                                    System.out.println("계속 그 음악들을 들으며 걸어 간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }


                                            }

                                            break;


                                    }


                                }

                                else
                                {
                                    System.out.println("그냥 걸어 간다.");
                                    System.out.println("가다가 친구를 만났다.");
                                    System.out.println("얼마나 친분이 있는 친구인가?");
                                    System.out.println("1: 엄청 친함. 당장이라도 아는척 하고 말 걸고 싶음.\t2: 그럭저럭 친함. 인사는 할 수 있음\t3: 얼굴만 암. 인사하기 어색함.");

                                    int Friend ;
                                    Scanner ScanFriend = new Scanner(System.in);
                                    Friend = ScanFriend.nextInt();

                                    switch (Friend)
                                    {

                                        case(1):

                                            System.out.println("친구를 불러 잠깐 대화를 나눈다.");
                                            System.out.println("얘기를 하다보니 할 얘기가 많은가?\n1.YES\t2.NO");

                                            int Talk ;
                                            Scanner ScanTalk = new Scanner(System.in);
                                            Talk = ScanTalk.nextInt();

                                            if(Talk == 1)
                                            {
                                                    System.out.println("친구에게 할 얘기가 많으니 여기서 이러지 말고 자리를 이동하자고 한다.");
                                                    System.out.println("근처 공원으로 이동한다.");


                                                    System.out.println("공원에 간다.");
                                                    System.out.println("공원에 도착");
                                                    System.out.println("공원 안 어떤 장소에서 대화를 나눌 것인가?");
                                                    System.out.println("1. 산책로를 걸으며 이야기를 나눈다.\t2. 공원벤치에 앉아 이야기를 나눈다.");

                                                    int Park;
                                                    Scanner ScanPark = new Scanner(System.in);
                                                    Park = ScanPark.nextInt();

                                                    if(Park == 1)
                                                    {
                                                        System.out.println("산책로로 향한다.");
                                                        System.out.println("산책로에 사람이 너무 많다.");
                                                        System.out.println("벤치로 이동하겠는가?\n1.YES\t2.NO");

                                                        int Walk;
                                                        Scanner ScanWalk = new Scanner(System.in);
                                                        Walk = ScanWalk.nextInt();

                                                        if(Walk ==1)
                                                        {
                                                            System.out.println(" 벤치를 찾아 떠난다.");
                                                            System.out.println("벤치를 찾아 이야기를 나눈다.");
                                                        }

                                                        else
                                                        {
                                                            System.out.println("산책로를 돌며 이야기를 나눈다.");
                                                        }


                                                    }

                                                    else
                                                    {
                                                        System.out.println("벤치를 찾아 나선다.");
                                                        System.out.println("사람이 없는 벤치를 찾기 어렵다.");
                                                        System.out.println("산책로를 걸으며 이야기를 나누겠는가?\n1.YES\t2.NO");

                                                        int bench;
                                                        Scanner ScanBench = new Scanner(System.in);
                                                        bench = ScanBench.nextInt();

                                                        if(bench == 1)
                                                        {
                                                            System.out.println("친구와 산책로를 걸으며 이야기를 나눈다.");
                                                        }

                                                        else
                                                        {
                                                            System.out.println("친구와 다른 벤치를 찾아 떠난다.");
                                                            System.out.println("벤치를 찾아 친구와 이야기를 나눈다.");
                                                        }


                                                    }








                                            }

                                            else
                                            {
                                                System.out.println("스터디 카페 가는 중이니 나중에 카톡하겠다고 한다.");
                                                System.out.println("다시 제 갈길을 간다.");
                                                System.out.println("스터디 카페에 도착한다.");
                                            }

                                            break;

                                        case(2):

                                            System.out.println("친구를 불러 인사를 나눈다.");
                                            System.out.println("더 이상 할 얘기가 있는가?\n1.YES\t2.NO");

                                            int Talk2;
                                            Scanner ScanTalk2 = new Scanner(System.in);
                                            Talk2 = ScanTalk2.nextInt();

                                            if (Talk2==1)
                                            {
                                                System.out.println("좀 더 이야기를 나눈 후 다시 갈 길을 간다.");
                                                System.out.println("스터디 카페에 도착한다.");
                                            }

                                            else
                                            {
                                                System.out.println("인사하고 바로 다시 갈 길을 간다.");
                                                System.out.println("스터디 카페에 도착한다.");
                                            }

                                            break;

                                        case(3):

                                            System.out.println("가다가 눈이 마주쳤는가?\n1.YES\t2.NO");

                                            int Eye ;
                                            Scanner ScanEye = new Scanner(System.in);
                                            Eye = ScanEye.nextInt();

                                            if(Eye==1)
                                            {
                                                System.out.println("그 사람 먼저 아는체 하는가?\n1.YES\t2.NO");

                                                int Know;
                                                Scanner ScanKnow = new Scanner(System.in);
                                                Know = ScanKnow.nextInt();


                                                if(Know==1)
                                                {

                                                    System.out.println("그 사람의 이름이 기억나는가?\n1.YES\t2.NO");

                                                    int Name;
                                                    Scanner ScanName = new Scanner(System.in);
                                                    Name = ScanName.nextInt();

                                                    if(Name==1)
                                                    {
                                                        System.out.println("그 사람 이름을 부르며 같이 아는체를 한다.");
                                                        System.out.println("그리곤 다시 제 갈 길을 간다.");
                                                        System.out.println("스터디 카페에 도착한다.");
                                                    }

                                                    else
                                                    {
                                                        System.out.println("그 사람이 자기 이름을 말하기 전까지 이름을 아는 척 하지 않는다.");
                                                        System.out.println("그리곤 다시 제 갈길을 간다.");
                                                        System.out.println("스터디 카페에 도착한다.");
                                                    }



                                                }


                                                else
                                                {
                                                    System.out.println("안심하며 뻘쭘하게 지나간다.");
                                                    System.out.println("스터디 카페에 도착한다.");
                                                }



                                            }


                                            else
                                            {
                                                System.out.println("그냥 모르는 척 지나친다. ");
                                                System.out.println("스터디 카페에 도착한다.");
                                            }





                                    }






                                }


                            }

                            else
                            {
                                System.out.println("버스를 탄다.");
                                System.out.println("정류장으로 간다.");
                                System.out.println("저기 정류장으로 오고있는 버스가 보인다.");
                                System.out.println("지금 뛸 체력이 되는가?\n1,YES\t2.NO");

                                int Bus;
                                Scanner ScanBus = new Scanner(System.in);
                                Bus = ScanBus.nextInt();

                                if(Bus==1)
                                {
                                    System.out.println("버스를 타기 위해 뛴다.");
                                    System.out.println("버스 탑승");
                                    System.out.println("버스를 타고 스터디카페로 간다.");

                                }

                                else
                                {
                                    System.out.println("체력이 없으니 그냥 걷는다.");
                                    System.out.println("버스를 놓치고 만다.");
                                    System.out.println("다음 버스를 기다리겠는가?\n1.YES\t2.NO");

                                    int Wait;
                                    Scanner ScanWait = new Scanner(System.in);
                                    Wait = ScanWait.nextInt();

                                    if(Wait == 1)
                                    {
                                        System.out.println("버스를 기다렸다 탄다.");
                                        System.out.println("스터디 카페로 향한다.");
                                    }

                                    else
                                    {
                                        System.out.println("버스를 기다리지 않고 바로 스터디 카페로 간다.");

                                    }


                                }





                            }





                        }
                    }


            }



        }

        else
        {

            System.out.println("어제 몇시에 취침했나요?");
            System.out.println("1. 오전 12시\t2. 오전 2시\t3. 밤샘 ");
            int AlarmNum ;
            Scanner ScanAlarm = new Scanner(System.in);
            AlarmNum = ScanAlarm.nextInt();


           switch (AlarmNum)
           {
               case 1:
                   System.out.println("어제 과제를 끝낸 분량은? (%)");

                   int HwChoice ;
                   Scanner ScanHw = new Scanner(System.in);
                   HwChoice = ScanHw.nextInt();
                   if(HwChoice<50)
                   {
                       System.out.println("지금 잠이 오는가?");
                   }
                   else if(HwChoice>=50 || HwChoice<=80)
                   {
                       System.out.println("오늘 안에 다 끝낼수 있는가?\n1.yes\t2.No");
                       int Finish ;
                       Scanner ScanFinish = new Scanner(System.in);
                       Finish = ScanFinish.nextInt();

                       if(Finish==1)
                       {
                           System.out.println("1시간 더 자고 일어난다.");
                       }
                       else
                       {
                           System.out.println("얼른 침대 밖을 벗어난다.");
                       }


                   }
                   else
                   {
                       System.out.println("만족하는가?\n1.yes\t2.No");
                       int Satisfy ;
                       Scanner ScanSatisfy = new Scanner(System.in);
                       Satisfy = ScanSatisfy.nextInt();

                       if(Satisfy==1)
                       {
                           System.out.println("1시간 더 자고 일어난다.");

                       }
                       else
                       {
                           System.out.println("얼른 일어난다.");
                       }


                   }

                   break;




               case 2:
                   System.out.println("어제 과제를 끝낸 분량은? (%)");

                   int HwChoice2 ;
                   Scanner ScanHw2 = new Scanner(System.in);
                   HwChoice2 = ScanHw2.nextInt();
                   if(HwChoice2<50)
                   {
                       System.out.println("지금 잠이 오는가?");
                   }
                   else if(HwChoice2>=50 || HwChoice2<=80)
                   {
                       System.out.println("오늘 안에 다 끝낼수 있는가?\n1.yes\t2.No");
                       int Finish2 ;
                       Scanner ScanFinish2 = new Scanner(System.in);
                       Finish2 = ScanFinish2.nextInt();

                       if(Finish2==1)
                       {
                           System.out.println("1시간 더 자고 일어난다.");
                       }
                       else
                       {
                           System.out.println("얼른 침대 밖을 벗어난다.");
                       }


                   }
                   else
                   {
                       System.out.println("만족하는가?\n1.yes\t2.No");
                       int Satisfy2 ;
                       Scanner ScanSatisfy2 = new Scanner(System.in);
                       Satisfy2 = ScanSatisfy2.nextInt();

                       if(Satisfy2==1)
                       {
                           System.out.println("1시간 더 자고 일어난다.");

                       }
                       else
                       {
                           System.out.println("얼른 일어난다.");
                       }


                   }

                   break;

               case 3:
                   System.out.println("계속 잔다.");
                   break;

               default:
                   System.out.println("보기에 없는 숫자를 입력했습니다.");
                   break;

           }



        }

    }
}
