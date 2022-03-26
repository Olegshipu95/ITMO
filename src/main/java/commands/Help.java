package commands;

import static collections.CommandCollection.commandColl;

public class Help extends AbstractCommand{
    @Override
    public void function() {
        for(AbstractCommand a:commandColl){
            System.out.println(a);
        }
    }
}
