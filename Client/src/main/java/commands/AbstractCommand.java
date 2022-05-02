package commands;

import collections.CommandCollection;
import commands.Command;
import lombok.Getter;

@Getter
public abstract class AbstractCommand implements Command {

    private final String name;
    private final boolean hasArgs;
    private final String description;

    protected AbstractCommand(String name, boolean typeArgs, String description) {
        this.name = name;
        hasArgs = typeArgs;
        this.description = description;
        if(!(CommandCollection.commandColl.containsKey(this.getName()))){
            CommandCollection.commandColl.put(this.getName(),this);
        }
        if(!(CommandCollection.commandInfo.containsKey(this.getName()))){
            CommandCollection.commandInfo.put(this.getName(),this.getDescription());
        }
    }

    public boolean checkTypeArgs(String[] args){
        boolean arguments;
        if(args.length > 0)arguments = true;
        else arguments = false;
        return arguments == hasArgs;
    }
}
