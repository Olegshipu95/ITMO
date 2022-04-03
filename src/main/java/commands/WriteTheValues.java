package commands;

import collections.IdCollection;
import collections.StackCollection;
import entities.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WriteTheValues {
    static Scanner scanner = new Scanner(System.in);
    public static boolean checkTheCorrect(boolean type, String advice){
        while (true){
            try{
                System.out.println(advice);
                type = scanner.nextBoolean();
                break;
            }
            catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }

    public static Float checkTheCorrect(Float type,String advice){
        while (true){
            try{
                System.out.println(advice);
                type = scanner.nextFloat();
                break;
            }
            catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }
    public static Integer checkTheCorrect(Integer type, String advice){
        while (true){
            try{
                System.out.println(advice);
                type = scanner.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }
    public static String checkTheCorrect(String type){
        while (true){
            try{
                System.out.println("Введите имя объекта: ");
                type = scanner.nextLine();
                break;
            }
            catch (Exception e) {
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }
    public static Mood checkTheCorrect(Mood type){
        while (true){
            try{
                System.out.println("Введите значение из тех, которые представлены сейчас перед вами: ");
                Mood[] obj  = Mood.values();
                for (Mood localObj: obj) {
                    System.out.print(localObj);
                }
                System.out.println();
                type = Mood.valueOf(scanner.nextLine());;
                break;
            }
            catch (Exception e){
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }


    public static WeaponType checkTheCorrect(WeaponType type){
        while (true){
            try{
                System.out.println("Введите значение из тех, которые представлены сейчас перед вами: ");
                WeaponType[] obj = WeaponType.values();
                for (WeaponType localObj:obj) {
                    System.out.print(localObj);
                }
                System.out.println();
                type = WeaponType.valueOf(scanner.nextLine());
                break;
            }
            catch (Exception e){
                System.out.println("Введены некорректные данные, повторите ввод.");
            }
        }
        return type;
    }
    public static void createObject(){
        Scanner scanner = new Scanner(System.in);
        int id = IdCollection.createId();
        String name = null;
        Integer y  = null, minutesOfWait = null;
        Float x = null , impactSpeed  = null;
        boolean realHero = false, hasToothpick = false, cool = false;
        Mood mood = null;
        WeaponType weaponType = null;
        name = WriteTheValues.checkTheCorrect(name);
        x = WriteTheValues.checkTheCorrect(x,"Введите значение float x-координаты");
        y = WriteTheValues.checkTheCorrect(y,"Введите значение int y-координаты ");
        realHero = WriteTheValues.checkTheCorrect(realHero,"Введите bool значение для realHero");
        hasToothpick = WriteTheValues.checkTheCorrect(hasToothpick,"Введите значение bool для hasToothpick");
        impactSpeed = WriteTheValues.checkTheCorrect(impactSpeed,"Введите Float impactSpeed");
        minutesOfWait = WriteTheValues.checkTheCorrect(minutesOfWait,"Введите значение int minutesOfWait");
        mood = WriteTheValues.checkTheCorrect(mood);
        weaponType = WriteTheValues.checkTheCorrect(weaponType);
        cool = WriteTheValues.checkTheCorrect(cool,"Введите значение bool для конструктора Car");
        StackCollection.entitiesCollection.push(new HumanBeing(id,name,new Coordinates(x,y),realHero,hasToothpick,impactSpeed,minutesOfWait,weaponType,mood,new Car(cool)));
    }
    public static void createObject(int id){
        Scanner scanner = new Scanner(System.in);
        String name = null;
        Integer y  = null, minutesOfWait = null;
        Float x = null , impactSpeed  = null;
        boolean realHero = false, hasToothpick = false, cool = false;
        Mood mood = null;
        WeaponType weaponType = null;
        name = WriteTheValues.checkTheCorrect(name);
        x = WriteTheValues.checkTheCorrect(x,"Введите значение float x-координаты");
        y = WriteTheValues.checkTheCorrect(y,"Введите значение int y-координаты ");
        realHero = WriteTheValues.checkTheCorrect(realHero,"Введите bool значение для realHero");
        hasToothpick = WriteTheValues.checkTheCorrect(hasToothpick,"Введите значение bool для hasToothpick");
        impactSpeed = WriteTheValues.checkTheCorrect(impactSpeed,"Введите Float impactSpeed");
        minutesOfWait = WriteTheValues.checkTheCorrect(minutesOfWait,"Введите значение int minutesOfWait");
        mood = WriteTheValues.checkTheCorrect(mood);
        weaponType = WriteTheValues.checkTheCorrect(weaponType);
        cool = WriteTheValues.checkTheCorrect(cool,"Введите значение bool для конструктора Car");
        StackCollection.entitiesCollection.push(new HumanBeing(id,name,new Coordinates(x,y),realHero,hasToothpick,impactSpeed,minutesOfWait,weaponType,mood,new Car(cool)));
    }
}
