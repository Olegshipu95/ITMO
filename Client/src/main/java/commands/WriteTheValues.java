package commands;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Exceptions.StupidUserException;
import collections.IdCollection;
import collections.StackCollection;
import entities.*;
import org.apache.commons.csv.CSVRecord;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class WriteTheValues {

    public static boolean createObject(String[] args) throws StupidUserException {
        int id = IdCollection.createId();
        Mood mood = null;
        WeaponType weaponType = null;

        String name;
        try {
            name = String.valueOf(args[0]);
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException var22) {
            System.out.print("Enter a file name: ");
            name = CheckTheCorrect.checkTheCorrect(new String());
        }

        Float x;
        try {
            x = Float.valueOf(args[1]);
        } catch (NumberFormatException var21) {
            System.out.print("Enter a float value for the x coordinate: ");
            x = CheckTheCorrect.checkTheCorrect(1.1F);
        }

        Integer y;
        try {
            y = Integer.valueOf(args[2]);
        } catch (NumberFormatException var20) {
            System.out.print("Enter an Integer value for the y coordinate: ");
            y = CheckTheCorrect.checkTheCorrect(Integer.valueOf(0));
        }

        boolean realHero;
        try {
            if (!args[3].equals("true") && !args[3].equals("false")) {
                throw new NumberFormatException();
            }

            realHero = Boolean.valueOf(args[3]);
        } catch (NumberFormatException var19) {
            System.out.print("Enter a bool value for realHero: ");
            realHero = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false));
        }

        boolean hasToothpick;
        try {
            if (!args[4].equals("true") && !args[4].equals("false")) {
                throw new NumberFormatException();
            }

            hasToothpick = Boolean.valueOf(args[4]);
        } catch (NumberFormatException var18) {
            System.out.print("Enter a bool value for hasToothpick: ");
            hasToothpick = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false));
        }

        Float impactSpeed;
        try {
            impactSpeed = Float.valueOf(args[5]);
        } catch (NumberFormatException var17) {
            System.out.print("Enter a float value for impactSpeed: ");
            impactSpeed = CheckTheCorrect.checkTheCorrect(0.0F);
        }

        Integer minutesOfWait;
        try {
            minutesOfWait = Integer.valueOf(args[6]);
        } catch (NumberFormatException var16) {
            System.out.print("Enter an Integer value for the y coordinate: ");
            minutesOfWait = CheckTheCorrect.checkTheCorrect(Integer.valueOf(0));
        }

        try {
            mood = Mood.valueOf(args[8]);
        } catch (IllegalArgumentException var15) {
            mood = CheckTheCorrect.checkTheCorrect(mood);
        }

        try {
            weaponType = WeaponType.valueOf(args[7]);
        } catch (IllegalArgumentException var14) {
            weaponType = CheckTheCorrect.checkTheCorrect(weaponType);
        }

        boolean cool;
        try {
            if (!args[9].equals("true") && !args[9].equals("false")) {
                throw new NumberFormatException();
            }

            cool = Boolean.valueOf(args[9]);
        } catch (NumberFormatException var13) {
            System.out.print("Enter a bool value for cool: ");
            cool = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false));
        }

        StackCollection.entitiesCollection.push(new HumanBeing(id, name, new Coordinates(x, y), realHero, hasToothpick, impactSpeed, minutesOfWait, weaponType, mood, new Car(cool)));
        return true;
    }

    public static boolean createObject(String[] args, int id) throws StupidUserException {
        Mood mood = null;
        WeaponType weaponType = null;

        String name;
        try {
            name = String.valueOf(args[0]);
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException var22) {
            System.out.print("Enter a file name: ");
            name = CheckTheCorrect.checkTheCorrect(new String());
        }

        Float x;
        try {
            x = Float.valueOf(args[1]);
        } catch (NumberFormatException var21) {
            System.out.print("Enter a float value for the x coordinate: ");
            x = CheckTheCorrect.checkTheCorrect(1.1F);
        }

        Integer y;
        try {
            y = Integer.valueOf(args[2]);
        } catch (NumberFormatException var20) {
            System.out.print("Enter an Integer value for the y coordinate: ");
            y = CheckTheCorrect.checkTheCorrect(Integer.valueOf(0));
        }

        boolean realHero;
        try {
            if (!args[3].equals("true") && !args[3].equals("false")) {
                throw new NumberFormatException();
            }

            realHero = Boolean.valueOf(args[3]);
        } catch (NumberFormatException var19) {
            System.out.print("Enter a bool value for realHero: ");
            realHero = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false));
        }

        boolean hasToothpick;
        try {
            if (!args[4].equals("true") && !args[4].equals("false")) {
                throw new NumberFormatException();
            }

            hasToothpick = Boolean.valueOf(args[4]);
        } catch (NumberFormatException var18) {
            System.out.print("Enter a bool value for hasToothpick: ");
            hasToothpick = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false));
        }

        Float impactSpeed;
        try {
            impactSpeed = Float.valueOf(args[5]);
        } catch (NumberFormatException var17) {
            System.out.print("Enter a float value for impactSpeed: ");
            impactSpeed = CheckTheCorrect.checkTheCorrect(0.0F);
        }

        Integer minutesOfWait;
        try {
            minutesOfWait = Integer.valueOf(args[6]);
        } catch (NumberFormatException var16) {
            System.out.print("Enter an Integer value for the y coordinate: ");
            minutesOfWait = CheckTheCorrect.checkTheCorrect(Integer.valueOf(0));
        }

        try {
            mood = Mood.valueOf(args[8]);
        } catch (IllegalArgumentException var15) {
            mood = CheckTheCorrect.checkTheCorrect(mood);
        }

        try {
            weaponType = WeaponType.valueOf(args[7]);
        } catch (IllegalArgumentException var14) {
            weaponType = CheckTheCorrect.checkTheCorrect(weaponType);
        }

        boolean cool;
        try {
            if (!args[9].equals("true") && !args[9].equals("false")) {
                throw new NumberFormatException();
            }

            cool = Boolean.valueOf(args[9]);
        } catch (NumberFormatException var13) {
            System.out.println("Enter a bool value for cool");
            cool = CheckTheCorrect.checkTheCorrect(Boolean.valueOf(false));
        }

        StackCollection.entitiesCollection.push(new HumanBeing(id, name, new Coordinates(x, y), realHero, hasToothpick, impactSpeed, minutesOfWait, weaponType, mood, new Car(cool)));
        return true;
    }

    public static boolean createObject(CSVRecord arguments) {
        Mood mood = null;
        WeaponType weaponType = null;

        String name;
        Integer y;
        Integer minutesOfWait;
        Float x;
        Float impactSpeed;
        boolean realHero;
        boolean hasToothpick;
        boolean cool;
        int id;
        LocalDateTime localDateTime;
        try {
            id = Integer.valueOf(arguments.get(0));
            if (IdCollection.idCollection.contains(id)) {
                return false;
            }

            name = String.valueOf(arguments.get(1));
            if (name == null || name.trim().isEmpty()) {
                return false;
            }

            x = Float.valueOf(arguments.get(2));
            y = Integer.valueOf(arguments.get(3));
            int year = Integer.valueOf(arguments.get(4));
            int month = Integer.valueOf(arguments.get(5));
            int dayOfMonth = Integer.valueOf(arguments.get(6));
            int hour = Integer.valueOf(arguments.get(7));
            int minute = Integer.valueOf(arguments.get(8));
            localDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
            realHero = Boolean.valueOf(arguments.get(9));
            hasToothpick = Boolean.valueOf(arguments.get(10));
            impactSpeed = Float.valueOf(arguments.get(11));
            minutesOfWait = Integer.valueOf(arguments.get(12));
            mood = Mood.valueOf(arguments.get(14));
            weaponType = WeaponType.valueOf(arguments.get(13));
            cool = Boolean.valueOf(arguments.get(15));
        } catch (NumberFormatException var19) {
            return false;
        } catch (IllegalArgumentException var20) {
            return false;
        } catch (DateTimeException var21) {
            return false;
        }

        StackCollection.entitiesCollection.push(new HumanBeing(id, name, new Coordinates(x, y), localDateTime, realHero, hasToothpick, impactSpeed, minutesOfWait, weaponType, mood, new Car(cool)));
        return true;
    }
}
