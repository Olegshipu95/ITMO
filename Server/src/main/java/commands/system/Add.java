//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import Exceptions.StupidUserException;
import commands.AbstractCommand;
import commands.WriteTheValues;

import java.util.Arrays;

public class Add extends AbstractCommand {
    public Add() {
        super("add", true,"add a new item to the collection.You should write:\n   string name,float x,Integer y,boolean realhero,boolean hasToothpick,Float impactSpeed,\n   Integer minutesOfWaiting,WeaponType weaponType,Mood mood,boolean bool" );
    }

    public boolean function(String ... arguments) {
        if(!checkTypeArgs(arguments)){
            arguments = new String[10];
            Arrays.fill(arguments, "");
        }
        try {
            String[] local = arguments;
            if (arguments.length > 10) {
                arguments = new String[10];
                arguments = (String[])Arrays.copyOfRange(local, 0, arguments.length);
            }

            if (arguments.length < 10) {
                arguments = new String[10];
                Arrays.fill(arguments, "");

                for(int i = 0; i < local.length; ++i) {
                    arguments[i] = local[i];
                }
            }

            WriteTheValues.createObject(arguments);
            return true;
        } catch (StupidUserException var4) {
            System.exit(1);
            return true;
        } catch (Exception var5) {
            return false;
        }
    }
}
