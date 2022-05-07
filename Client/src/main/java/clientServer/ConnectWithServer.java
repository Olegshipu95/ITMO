package clientServer;

import collections.CommandCollection;
import collections.HistoryCollection;
import commands.DataClients;
import commands.DataServer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.*;

public class ConnectWithServer {
    /* Порт сервера, к которому собирается
  подключиться клиентский сокет */
    private int port;
    private InetAddress IPAddress;
    private static ConnectWithServer instance;

    private ConnectWithServer() {
    }

    public static ConnectWithServer getInstance() {
        if (instance == null) {        //если объект еще не создан
            instance = new ConnectWithServer();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }

    public void setIPAddressAndPort(InetAddress inetAddress, int port) {
        IPAddress = inetAddress;
        this.port = port;
    }

    public DataServer connectWithServer(DataClients dataClients) throws IOException {
      /* Создайте экземпляр клиентского сокета.
Нет необходимости в привязке к определенному порту */

        DatagramSocket clientSocket = new DatagramSocket();
        try {
            IPAddress = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
        }

        // Создайте соответствующие буферы
        byte[] sendingDataBuffer = dataClients.getBytes();
        byte[] receivingDataBuffer = new byte[8192];
      /* Преобразуйте данные в байты
       и разместите в буферах */

        // Создайте UDP-пакет
        DatagramPacket sendingPacket = new DatagramPacket(sendingDataBuffer, sendingDataBuffer.length, IPAddress, port);

        // Отправьте UDP-пакет серверу
        try {
            clientSocket.send(sendingPacket);
        } catch (IOException e) {
            System.out.println("Problems with server");
            return null;
        }
        // Получите ответ от сервера, т.е. предложение из заглавных букв
        DatagramPacket receivingPacket = new DatagramPacket(receivingDataBuffer, receivingDataBuffer.length);
        clientSocket.receive(receivingPacket);
        byte[] byteMessage = receivingPacket.getData();
        DataServer obj;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(byteMessage));
            obj = (DataServer) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            return null;
        }
        clientSocket.close();
        return obj;
    }
}