package ru.geekbrains;

public class HomeWork {
    public static void main(String[] args) {

        byte exOne = 2;
        short exTwo = 10;
        int exThree = 30;
        long exFour = 700L;

        float exFive = 15.6f;
        double exSix = 30.25;

        char exSeven = 'k';

        boolean exEight = true;

        System.out.println("Урок 1");
        System.out.println(calculate(5.5f,8.8f,9.3f,1.8f));
       System.out.println(task10and20(5,6));
       isPositiveOrNegative(-30);
        System.out.println(isPositiveOrNegative1(10));
        printMassage("Андрей");

        }

    public static float calculate(float a, float b, float c, float d) {

        return a*(b+(c/d));

    }

    public static boolean task10and20(int x1, int x2) {

        boolean bool=false;
        if (((x1+x2) >= 10)&&((x1+x2)<=20)) bool = true;

       return bool;
        }





    public static void isPositiveOrNegative(int x){
        if (x>=0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isPositiveOrNegative1(int x){
        if (x>=0){
            return false;
        } else {
            return true;
        }
    }

    public static void printMassage(String name){
        System.out.println("Привет, "+name+"!");
    }

}
