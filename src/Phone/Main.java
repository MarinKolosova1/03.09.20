package Phone;

import java.util.ArrayList;
import java.util.Scanner;
/*
123 iPhone 133,5
456 Galaxy 140,6
789 Pixel 137,8
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите количество телефонов ");
        n = in.nextInt();
        Phone[] Phones = new Phone[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите номер, модель и вес для телефона " + (i+1));
            Phones[i] = new Phone(in.next(), in.next(), in.nextDouble());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Телефон " + (i+1) + ":");
            System.out.println("Номер " + Phones[i].number + ", модель " + Phones[i].model + ", вес " + Phones[i].weight);
        }

        String callerName;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Телефон" + (i+1) + "\nНомер телефона: " + Phones[i].getNumber());
            System.out.println("Кто звонит? (введите имя)");
            callerName = in.next();
            Phones[i].receiveCall(callerName);
        }

        String callerNumber;
        System.out.println("Кто звонит? (введите имя и номер телефона)");
        callerName = in.next();
        callerNumber = in.next();
        Phones[n-1].receiveCall(callerName, callerNumber);

        int addresseesCounter;
        System.out.println("Кому отправить сообщение? (введите количество получателей и номера телефонов)");
        addresseesCounter = in.nextInt();
        String[] addressees = new String[addresseesCounter];
        for (int i = 0; i < addresseesCounter; i++) {
            addressees[i] = in.next();
        }
        Phones[n-1].sendMessage(addressees);

    }
}
