package commands.system;

import collections.IdCollection;
import collections.StackCollection;
import commands.WriteTheValues;
import commands.AbstractCommand;
import entities.*;

import java.util.Scanner;

public class Add extends AbstractCommand {//Сделан полностью
    @Override
    public boolean function() {
        try {
            commands.WriteTheValues.createObject();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
