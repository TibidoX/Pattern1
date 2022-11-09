package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractTrack track;
        String name, e_type, b_type;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите производителя: ");
        name = scanner.nextLine();
        System.out.println("Введите тип двигателя: ");
        e_type = scanner.nextLine();
        System.out.println("Введите тип кузова: ");
        b_type = scanner.nextLine();

        if ((e_type.equals("e_type1") || e_type.equals("e_type2")) && (b_type.equals("b_type1")) )
            track = new ax_2(name, e_type, b_type);
        else if (e_type.equals("e_type3") && b_type.equals("b_type2"))
            track = new ax_3(name, e_type, b_type);
        else if (e_type.equals("e_type4") && (b_type.equals("b_type3") || b_type.equals("b_type4")))
            track = new ax_4(name, e_type, b_type);
        else track = new Default(name);

        System.out.println(track.GetName());
        System.out.println(track.GetTruckType());
        System.out.println(track.GetEngineType());
        System.out.println(track.GetBodyType());
    }
}