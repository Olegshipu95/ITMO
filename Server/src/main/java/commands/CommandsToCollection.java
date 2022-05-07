package commands;

import collections.CommandCollection;

public abstract class CommandsToCollection extends AbstractCommand {

    public CommandsToCollection(String name, CommandArgs commandArgs, String description) {
        super(name, commandArgs, description);
        if(!(CommandCollection.getInstance().serverCollection.containsKey(name))){
            CommandCollection.getInstance().serverCollection.put(name,this);
        }
        if(!(CommandCollection.getInstance().commandsInfo.containsKey(name))){
            CommandCollection.getInstance().commandsInfo.put(name,description);
        }
    }
}
