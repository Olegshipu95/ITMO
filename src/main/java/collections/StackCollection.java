package collections;
import entities.*;

import java.util.Scanner;
import java.util.Stack;

public class StackCollection {
    public static Stack<HumanBeing> entitiesCollection = new Stack<>();

    public static Stack<HumanBeing> fromFile(){
        String[][] substr = Parser.substringsOfStream();
        for (int i = 0; i < substr.length; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < substr[i].length; j++) {
                line.append(substr[i][j] + "\n");
            }

            Scanner scanner = new Scanner(line.toString().trim());
            scanner.useDelimiter("\n");
            int id;
            String name;
            Integer y, minutesOfWait;
            Float x, impactSpeed;
            boolean realHero, hasToothpick, cool;
            Mood mood;
            WeaponType weaponType;
            if(scanner.hasNextInt()){
                id = scanner.nextInt();
            }
            else continue;
            if(scanner.hasNextLine()){
                name = scanner.nextLine();
            }
            else continue;
            if(scanner.hasNextFloat()){
                x = scanner.nextFloat();
            }
            else continue;
            if(scanner.hasNextInt()){
                y = scanner.nextInt();
            }
            else continue;
            if(scanner.hasNextBoolean()){
                realHero = scanner.nextBoolean();
            }
            else realHero = false;
            if(scanner.hasNextBoolean()){
                hasToothpick = scanner.nextBoolean();
            }
            else hasToothpick = false;
            if(scanner.hasNextFloat()){
                impactSpeed = scanner.nextFloat();
            }
            else continue;
            if(scanner.hasNextInt()){
                minutesOfWait = scanner.nextInt();
            }
            else continue;
            if(scanner.hasNextLine()){
                try{
                    weaponType = WeaponType.valueOf(scanner.nextLine());
                }
                catch (IllegalArgumentException e){
                    continue;
                }
            }
            else continue;
            if(scanner.hasNextLine()){
                try{
                    mood = Mood.valueOf(scanner.nextLine());
                }
                catch (IllegalArgumentException e){
                    continue;
                }
            }
            else continue;
            if(scanner.hasNextBoolean()){
                cool = scanner.nextBoolean();
            }
            else cool = false;
            HumanBeing obj = new HumanBeing(id,name,new Coordinates(x,y),realHero,hasToothpick,
                    impactSpeed,minutesOfWait,weaponType,mood,new Car(cool));
            entitiesCollection.push(obj);

        }

        return entitiesCollection;
    }
    public static Stack<HumanBeing> cloneCollection(Stack<HumanBeing> a){
        a = entitiesCollection;
        return a;
    }
}
