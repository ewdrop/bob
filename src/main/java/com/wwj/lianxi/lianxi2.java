package com.wwj.lianxi;

import java.util.Random;
import java.util.Scanner;

public class lianxi2 {
    /**
     * int rounds = 0;
        while (true){
     System.out.println("欢迎玩猜数字游戏");
        Scanner sc = new Scanner(System.in);
        playOneRound(sc);
        rounds++;
        System.out.println("是否继续(y/n)");
        String renew = sc.next();
        if (!"y".equalsIgnoreCase(renew)||renew.isEmpty){
            break;
        }
    }
     sc.close();

    public static int generateSecret(){
        Random random = new Random();
        int result = random.nextInt(99)+1;
        return result;
    }

    public static void playOneRound(Scanner scanner){
        int value = generateSecret();
        int count = 0;
        boolean flag = true;
        while(flag){
            System.out.print("请输入你猜的数字");
            int guess = scanner.nextInt();
            count++;
            if (value > guess){
                System.out.println("猜小了");
            } else if (value < guess) {
                System.out.println("猜大了");
            }else {
                System.out.println("一共猜了"+count+"次");
                flag = false;
            }
        }
    }*/
}
