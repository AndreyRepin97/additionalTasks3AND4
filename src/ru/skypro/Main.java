package ru.skypro;

public class Main {
    public static void main(String[] args) {

        // 1.3 Условные операторы
        // Задание 6.

        System.out.println("Task 6");

        int age = 19;
        int salary = 58000;
        double limit;

        if (age >= 23) {
            limit = salary * 3;
        } else
            limit = salary * 2;
        if (salary >= 80000) {
            limit = limit * 1.5;
        } else {
            if (salary >= 50000) {
                limit = limit * 1.2;
            }
        }

        System.out.println(limit);
        System.out.println();

        // 1.3 Условные операторы
        // Задание 7.

        System.out.println("Task 7");

        double baseRate = 0.1;
        int creditTime = 12;
        double wantedSum = 330000;
        age = 25;
        salary = 60000;

        if (age < 23) {
            baseRate = baseRate + 0.01;
        } else {
            if (age < 30) {
                baseRate = baseRate + 0.05;
            }
        }
        if (salary > 80000) {
            baseRate = baseRate - 0.007;
        }

        wantedSum = wantedSum + wantedSum * baseRate;

        int maxPay = salary / 2;
        double pay = wantedSum / creditTime;

        System.out.println("Максимальный платеж при заработной плате " + salary + " рублей: " + maxPay + " рублей.");
        System.out.println("Платеж по кредиту: " + pay + " рублей.");

        if (maxPay > pay) {
            System.out.println("Кредит одобрен.");
        } else
            System.out.println("Кредит не одобрен.");


        // 1.4 Циклы
        // Задание 4.

        System.out.println();
        System.out.println("Task 4");

        int[] arr = new int[31];

        for (int i=0;i<arr.length;i++){
            arr[i] = i;
            }

        for (int i=1;i<arr.length;i++){
            System.out.print(arr[i]+":");
            if (arr[i]%15==0){
                System.out.print(" ping pong");
            }else{
                if (arr[i]%3==0) {
                    System.out.print(" ping");
                }else{
                    if(arr[i]%5==0){
                        System.out.print(" pong");
                    }else{
                        if (arr[i]%15==0){
                            System.out.print(" ping pong");
                        }
                    }
                }
            }
            System.out.println();
        }

        // 1.4 Циклы

        // Задание 5 вариант 1.

        System.out.println();
        System.out.println("Task 5 option 1");

        int[] arrFibo1 = new int[20];

        arrFibo1[0]=0;
        arrFibo1[1]=1;

        System.out.print(arrFibo1[0]+",");
        System.out.print(arrFibo1[1]+",");

        for(int i=2;i<arrFibo1.length;i++){
            arrFibo1[i]=arrFibo1[i-2]+arrFibo1[i-1];
            System.out.print(arrFibo1[i]);
            if(i<arrFibo1.length-1){
                System.out.print(",");
            }
        }

        System.out.println();

        // Задание 5 вариант 2.

        System.out.println();
        System.out.println("Task 5 option 2");

        int[] arrFibo2 = new int[20];

        for(int i=0;i<arrFibo2.length;i++){
            if (i<2){
                arrFibo2[i]=i;
            }else{
                arrFibo2[i]=arrFibo2[i-2]+arrFibo2[i-1];
            }
            System.out.print(arrFibo2[i]);
            if(i<arrFibo2.length-1){
                System.out.print(",");
            }
        }
    }
}
