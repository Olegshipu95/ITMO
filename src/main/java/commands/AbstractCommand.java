package commands;

import entities.Mood;
import entities.WeaponType;

public abstract class AbstractCommand {
    public abstract boolean function();
    public abstract boolean function(String[] arguments);
    }
