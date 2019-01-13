package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = in.nextLine();
        int Len_Arr;
        if (S.indexOf(".") != -1){
            System.out.println("Число введено в неправильном формате!");
        }
        else {
            if (S.indexOf(",") == -1) { //пользователь ввел целое число
                Len_Arr = S.length();
            } else {//пользователь ввел число с плавающей запятой, берем только целую часть, так как по условию далее будет преобразование к int
                Len_Arr = S.indexOf(",");
            }
            int i;
            int[] NumFromCh = new int[Len_Arr];
            int X = 0;
            for (i = 0; i < Len_Arr; ++i) {
                NumFromCh[i] = Character.digit(S.charAt(i), 10);
                X = X + NumFromCh[i] * (int) Math.pow(10, Len_Arr - 1 - i);
            }
            System.out.println("Строка " + S);
            System.out.println("Число типа int " + X);
            double Y = (double) X;
            System.out.println("Число типа double " + Y);
        }
    }
}