package commands;

import collections.CommandCollection;
import exceptions.IncorrectArgsException;

public abstract class CommandsToCollection extends AbstractCommand {
    @Override
    public abstract Result function(String... var1) ;

    public CommandsToCollection(String name, CommandArgs commandArgs, String description) {
        super(name, commandArgs, description);
        if(!(CommandCollection.commandColl.containsKey(name))){
            CommandCollection.commandColl.put(name,this);
        }
        if(!(CommandCollection.clientCommands.containsKey(name))){
            CommandCollection.clientCommands.put(name,description);
        }

    }
    public String[] checkTypeArgs(String[] args) throws IncorrectArgsException {

        try {
            return ArgsValidator.argsValidator(getData().getCommandArgs(),args);
        } catch (IncorrectArgsException e) {
            System.out.println(e.getMessage());
            throw new IncorrectArgsException();
        }
    }
}
