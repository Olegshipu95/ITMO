//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands;

import Exceptions.StupidUserException;
import entities.Mood;
import entities.WeaponType;

import java.util.Scanner;

public class CheckTheCorrect {
    public CheckTheCorrect() {
    }

    public static boolean checkTheCorrect(boolean type) throws StupidUserException {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }

                String local = scanner.next();
                if (!local.equals("true") && !local.equals("false")) {
                    throw new NumberFormatException();
                }

                type = Boolean.valueOf(local);
                return type;
            } catch (Exception var4) {
                System.out.print("Incorrect data entered, please re-enter: ");
            }
        }
    }

    public static Float checkTheCorrect(Float type) throws StupidUserException {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }

                type = Float.valueOf(scanner.next());
                return type;
            } catch (NumberFormatException var4) {
                System.out.print("Incorrect data entered, please re-enter: ");
            }
        }
    }

    public static Integer checkTheCorrect(int type) throws StupidUserException {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            try {
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }

                type = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException var4) {
                System.out.print("Incorrect data entered, please re-enter: ");
                continue;
            }

            return type;
        }
    }

    public static String checkTheCorrect(String type) throws StupidUserException {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }

                type = scanner.nextLine();
                if (type != null && !type.trim().isEmpty()) {
                    return type;
                }

                throw new IllegalArgumentException();
            } catch (IllegalArgumentException var4) {
                System.out.print("Incorrect data entered, please re-enter: ");
            }
        }
    }

    public static Mood checkTheCorrect(Mood type) throws StupidUserException {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Введите значение для класса Mood из тех, которые представлены сейчас перед вами: ");
                Mood[] obj = Mood.values();
                Mood[] var4 = obj;
                int var5 = obj.length;

                for(int var6 = 0; var6 < var5; ++var6) {
                    Mood localObj = var4[var6];
                    System.out.print(localObj + " ");
                }

                System.out.println();
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }

                type = Mood.valueOf(scanner.nextLine());
                return type;
            } catch (IllegalArgumentException var8) {
                System.out.println("Incorrect data entered, please re-enter: ");
            }
        }
    }

    public static WeaponType checkTheCorrect(WeaponType type) throws StupidUserException {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter a value from those for the WeaponType class that are now in front of you: ");
                WeaponType[] obj = WeaponType.values();
                WeaponType[] var4 = obj;
                int var5 = obj.length;

                for(int var6 = 0; var6 < var5; ++var6) {
                    WeaponType localObj = var4[var6];
                    System.out.print(localObj + " ");
                }

                System.out.println();
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }

                type = WeaponType.valueOf(scanner.nextLine());
                return type;
            } catch (IllegalArgumentException var8) {
                System.out.println("Incorrect data entered, please re-enter: ");
            }
        }
    }
}
