package commands;

import collections.IdCollection;
import collections.StackCollection;
import entities.*;
import org.apache.commons.csv.CSVRecord;

import java.time.LocalDateTime;
import java.util.Scanner;

public class WriteTheValues {
    static Scanner scanner = new Scanner(System.in);


    public static boolean checkTheCorrect(boolean type, String advice) {
        while (true) {
            try {
                System.out.println(advice);
                type = scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }

    public static Float checkTheCorrect(Float type, String advice) {
        while (true) {
            try {
                System.out.println(advice);
                type = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }

    public static Integer checkTheCorrect(int type, String advice) {
        while (true) {
            try {
                System.out.println(advice);
                type = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }

    public static String checkTheCorrect(String type) {
        while (true) {
            try {
                System.out.println("Введите имя объекта: ");
                type = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }

    public static Mood checkTheCorrect(Mood type) {
        while (true) {
            try {
                System.out.println("Введите значение из тех, которые представлены сейчас перед вами: ");
                Mood[] obj = Mood.values();
                for (Mood localObj : obj) {
                    System.out.print(localObj);
                }
                System.out.println();
                type = Mood.valueOf(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }


    public static WeaponType checkTheCorrect(WeaponType type) {
        while (true) {
            try {
                System.out.println("Введите значение из тех, которые представлены сейчас перед вами: ");
                WeaponType[] obj = WeaponType.values();
                for (WeaponType localObj : obj) {
                    System.out.print(localObj);
                }
                System.out.println();
                type = WeaponType.valueOf(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }

    public static void createObject(String[] args) {
        int id = IdCollection.createId();
        String name;
        Integer y, minutesOfWait;
        Float x, impactSpeed;
        boolean realHero, hasToothpick, cool;
        Mood mood = null;
        WeaponType weaponType = null;
        try {
            name = String.valueOf(args[0]);
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            name = checkTheCorrect(new String());
        }
        try {
            x = Float.valueOf(args[1]);
        } catch (NumberFormatException e) {
            x = checkTheCorrect(Float.valueOf(0), "Введите значение float для x координаты");
        }
        try {
            y = Integer.valueOf(args[2]);
        } catch (NumberFormatException e) {
            y = checkTheCorrect(Integer.valueOf(0), "Введите значение Integer для координаты x");
        }
        try {
            realHero = Boolean.valueOf(args[3]);
        } catch (NumberFormatException e) {
            realHero = checkTheCorrect(Boolean.valueOf(false), "Введите значение bool для realHero");
        }
        try {
            hasToothpick = Boolean.valueOf(args[4]);
        } catch (NumberFormatException e) {
            hasToothpick = checkTheCorrect(Boolean.valueOf(false), "Введите значение bool для hasToothpick");
        }
        try {
            impactSpeed = Float.valueOf(args[5]);
        } catch (NumberFormatException e) {
            impactSpeed = checkTheCorrect(Float.valueOf(0), "Введите значение float для impactSpeed");
        }
        minutesOfWait = Integer.valueOf(args[6]);
        try {
            mood = Mood.valueOf(args[7]);
        } catch (IllegalArgumentException ex) {
            mood = checkTheCorrect(mood);
        }
        try {
            weaponType = WeaponType.valueOf(args[8]);
        } catch (IllegalArgumentException ex) {
            weaponType = checkTheCorrect(weaponType);
        }
        try {
            cool = Boolean.valueOf(args[9]);
        } catch (NumberFormatException e) {
            cool = checkTheCorrect(Boolean.valueOf(false), "Введите значение bool для cool");
        }

        StackCollection.entitiesCollection.push(new HumanBeing(id, name, new Coordinates(x, y), realHero, hasToothpick, impactSpeed, minutesOfWait, weaponType, mood, new Car(cool)));
    }

    public static void createObject(String[] args, int id) {
        String name;
        Integer y, minutesOfWait;
        Float x, impactSpeed;
        boolean realHero, hasToothpick, cool;
        Mood mood = null;
        WeaponType weaponType = null;
        try {
            name = String.valueOf(args[0]);
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            name = checkTheCorrect(new String());
        }
        try {
            x = Float.valueOf(args[1]);
        } catch (NumberFormatException e) {
            x = checkTheCorrect(Float.valueOf(0), "Введите значение float для x координаты");
        }
        try {
            y = Integer.valueOf(args[2]);
        } catch (NumberFormatException e) {
            y = checkTheCorrect(Integer.valueOf(0), "Введите значение Integer для координаты x");
        }
        try {
            realHero = Boolean.valueOf(args[3]);
        } catch (NumberFormatException e) {
            realHero = checkTheCorrect(Boolean.valueOf(false), "Введите значение bool для realHero");
        }
        try {
            hasToothpick = Boolean.valueOf(args[4]);
        } catch (NumberFormatException e) {
            hasToothpick = checkTheCorrect(Boolean.valueOf(false), "Введите значение bool для hasToothpick");
        }
        try {
            impactSpeed = Float.valueOf(args[5]);
        } catch (NumberFormatException e) {
            impactSpeed = checkTheCorrect(Float.valueOf(0), "Введите значение float для impactSpeed");
        }
        try {
            minutesOfWait = Integer.valueOf(args[6]);
        } catch (NumberFormatException e) {
            minutesOfWait = checkTheCorrect(Integer.valueOf(0), "Введите значение Integer для координаты minutesOfWait");
        }
        try {
            mood = Mood.valueOf(args[7]);
        } catch (IllegalArgumentException ex) {
            mood = checkTheCorrect(mood);
        }
        try {
            weaponType = WeaponType.valueOf(args[8]);
        } catch (IllegalArgumentException ex) {
            weaponType = checkTheCorrect(weaponType);
        }
        try {
            cool = Boolean.valueOf(args[9]);
        } catch (NumberFormatException e) {
            cool = checkTheCorrect(Boolean.valueOf(false), "Введите значение bool для cool");
        }
        StackCollection.entitiesCollection.push(new HumanBeing(id, name, new Coordinates(x, y), realHero, hasToothpick, impactSpeed, minutesOfWait, weaponType, mood, new Car(cool)));
    }


    public static boolean createObject(CSVRecord arguments) {
        String name;
        Integer y, minutesOfWait;
        Float x, impactSpeed;
        boolean realHero, hasToothpick, cool;
        Mood mood = null;
        WeaponType weaponType = null;
        int id, year, month, dayOfMonth, hour, minute;
        LocalDateTime localDateTime;
        try {
            id = Integer.valueOf(arguments.get(0));
            if(IdCollection.idCollection.contains(id))return false;
            name = String.valueOf(arguments.get(1));
            if (name == null || name.trim().isEmpty()) {
                return false;
            }
            x = Float.valueOf(arguments.get(2));
            y = Integer.valueOf(arguments.get(3));
            year = Integer.valueOf(arguments.get(4));

            month = Integer.valueOf(arguments.get(5));
            dayOfMonth = Integer.valueOf(arguments.get(6));
            hour = Integer.valueOf(arguments.get(7));
            minute = Integer.valueOf(arguments.get(8));
            localDateTime = LocalDateTime.of(year,month, dayOfMonth,hour,minute);
            realHero = Boolean.valueOf(arguments.get(9));

            hasToothpick = Boolean.valueOf(arguments.get(10));

            impactSpeed = Float.valueOf(arguments.get(11));

            minutesOfWait = Integer.valueOf(arguments.get(12));

            mood = Mood.valueOf(arguments.get(13));
            weaponType = WeaponType.valueOf(arguments.get(14));
            cool = Boolean.valueOf(arguments.get(15));
        } catch (NumberFormatException e) {
            return false;
        }
        catch (IllegalArgumentException e){
            return false;
        }
        catch (java.time.DateTimeException e){
            return false;
        }
        StackCollection.entitiesCollection.push(new HumanBeing(id, name, new Coordinates(x, y),localDateTime, realHero, hasToothpick, impactSpeed, minutesOfWait, weaponType, mood, new Car(cool)));
        return true;
    }

}
