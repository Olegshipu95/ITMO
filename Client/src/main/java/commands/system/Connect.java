package commands.system;

import clientServer.ConnectWithServer;
import collections.CommandCollection;
import commands.*;
import exceptions.IncorrectArgsException;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class Connect extends CommandsToCollection {
    public Connect() {
        super("connect", CommandArgs.CONNECT_ARGS, "This command is using for connecting with server");
    }

    @Override
    public Result function(String... args) {
        try {
            args = checkTypeArgs(args);
        } catch (IncorrectArgsException e) {
            return new Result(false);
        }
        try {
            ConnectWithServer.getInstance().setIPAddressAndPort(InetAddress.getByName(args[0]),Integer.valueOf(args[1]));
        } catch (UnknownHostException e) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Data is incorrect, write the command again ");
            return new Result(arrayList,false);
        }
        DataClients dataClients = new DataClients("connect",args);
        ArrayList<String> arrayList = new ArrayList<>();

        try {
            DataServer dataServer = ConnectWithServer.getInstance().connectWithServer(dataClients);
            for (CommandData commandData:dataServer.getCommandDataHashSet()) {
                CommandCollection.serverCommands.put(commandData.getName(),commandData);
            }
        } catch (IOException e) {
            return new Result(false);
        }
        arrayList.add("Command has done. Update help");
        return new Result(arrayList,true);
    }
}
