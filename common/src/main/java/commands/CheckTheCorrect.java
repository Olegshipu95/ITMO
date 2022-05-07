package commands;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import entities.Mood;
import entities.WeaponType;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTheCorrect {

    public static Boolean checkTheCorrect(boolean type)  {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                if (!scanner.hasNext()) {
                    System.exit(0);
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

    public static Float checkTheCorrect(Float type) {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                if (!scanner.hasNext()) {
                    System.exit(0);
                }

                type = Float.valueOf(scanner.next());
                return type;
            } catch (NumberFormatException var4) {
                System.out.print("Incorrect data entered, please re-enter: ");
            }
        }
    }

    public static Integer checkTheCorrect(int type)  {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            try {
                if (!scanner.hasNext()) {
                    System.exit(0);
                }

                type = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException var4) {
                System.out.print("Incorrect data entered, please re-enter: ");
                continue;
            }

            return type;
        }
    }

    public static String checkTheCorrect(String type)  {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            try {
                if (!scanner.hasNext()) {
                    System.exit(0);
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

    public static Mood checkTheCorrect(Mood type){
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
                    System.exit(1);
                }

                type = Mood.valueOf(scanner.nextLine());
                return type;
            } catch (IllegalArgumentException var8) {
                System.out.println("Incorrect data entered, please re-enter: ");
            }
        }
    }

    public static WeaponType checkTheCorrect(WeaponType type) {
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
                    System.exit(0);
                }

                type = WeaponType.valueOf(scanner.nextLine());
                return type;
            } catch (IllegalArgumentException var8) {
                System.out.println("Incorrect data entered, please re-enter: ");
            }
        }
    }
    public static String[] fillingArgs(String[] args,int shift){
        if(shift<0){
            System.out.println("You write incorrect shift, so then I will make it equal to 0");
            shift = 0;
        }
        if(args.length!=(10 + shift))args = arrayToDesiredSize(args,(10+shift));
        try {
            String name = String.valueOf(args[shift]);
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException var22) {
            System.out.print("Enter a file name: ");
            args[shift] = CheckTheCorrect.checkTheCorrect(new String());
        }
        try {
            Float.valueOf(args[shift+1]);
        } catch (NumberFormatException var21) {
            System.out.print("Enter a float value for the x coordinate: ");
            args[shift+1] = CheckTheCorrect.checkTheCorrect(1.1F).toString();
        }
        try {
            Integer.valueOf(args[shift+2]);
        } catch (NumberFormatException var20) {
            System.out.print("Enter an Integer value for the y coordinate: ");
            args[shift+2] = CheckTheCorrect.checkTheCorrect(Integer.valueOf(0)).toString();
        }
        try {
            if (!args[shift+3].equals("true") && !args[shift+3].equals("false")) {
                throw new NumberFormatException();
            }
            Boolean.valueOf(args[shift+3]);
        } catch (NumberFormatException var19) {
            System.out.print("Enter a bool value for realHero: ");
            args[shift+3] = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false)).toString();
        }


        try {
            if (!args[shift+4].equals("true") && !args[shift+4].equals("false")) {
                throw new NumberFormatException();
            }
            Boolean.valueOf(args[shift+4]);
        } catch (NumberFormatException var18) {
            System.out.print("Enter a bool value for hasToothpick: ");
            args[shift+4] = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false)).toString();
        }


        try {
            Float.valueOf(args[shift+5]);
        } catch (NumberFormatException var17) {
            System.out.print("Enter a float value for impactSpeed: ");
            args[shift+5] = CheckTheCorrect.checkTheCorrect(0.0F).toString();
        }
        try {
            Integer.valueOf(args[shift+6]);
        } catch (NumberFormatException var16) {
            System.out.print("Enter an Integer value for the y coordinate: ");
            args[shift+6] = CheckTheCorrect.checkTheCorrect(Integer.valueOf(0)).toString();
        }

        try {
            WeaponType.valueOf(args[shift+7]);
        } catch (IllegalArgumentException var14) {
            WeaponType weaponType = null;
            args[shift+7] = CheckTheCorrect.checkTheCorrect(weaponType).toString();
        }

        try {
            Mood.valueOf(args[shift+8]);
        } catch (IllegalArgumentException var15) {
            Mood mood = null;
            args[shift+8] = CheckTheCorrect.checkTheCorrect(mood).toString();
        }

        try {
            if (!args[shift+9].equals("true") && !args[shift+9].equals("false")) {
                throw new NumberFormatException();
            }
            args[shift+9] = Boolean.valueOf(args[shift+9]).toString();
        } catch (NumberFormatException var13) {
            System.out.print("Enter a bool value for cool: ");
            args[shift+9]=CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false)).toString();
        }
        return args;
    }


    public static String[] arrayToDesiredSize(String[] args, int x){
        String[] local = args;
        if (args.length > x) {
            args = new String[x];
            args = (String[]) Arrays.copyOfRange(local, 0, args.length);
        }
        if (args.length < x) {
            args = new String[x];
            Arrays.fill(args, "");

            for(int i = 0; i < local.length; ++i) {
                args[i] = local[i];
            }

        }
        return args;
    }
}
