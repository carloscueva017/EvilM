package heroes.server;

import heroes.server.net.BroadcastClient;

public class Client {

  public static void main(String[] args) {

    System.out.println("client");

    new BroadcastClient() {
      protected void onDiscovery (String address) {
        System.out.println(String.format("Server at %s", address));
      }
    }.start();
  }
}
