package collections;

import commands.WriteTheValues;

import java.util.ArrayList;

public class HistoryCollection {
    public static ArrayList<String> historyCollectrion = new ArrayList(14);
    private static HistoryCollection instance;
    private HistoryCollection(){}
    public static synchronized HistoryCollection getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new HistoryCollection();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
    public synchronized void capacity(String history) {
        if (historyCollectrion.size() == 13) {
            historyCollectrion.remove(0);
            historyCollectrion.add(history);
        } else {
            historyCollectrion.add(history);
        }

    }
}