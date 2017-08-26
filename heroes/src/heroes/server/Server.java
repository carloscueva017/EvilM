package heroes.server;

import heroes.server.net.BroadcastServer;

public class Server {

  public static void main(String[] args) {

    System.out.println("server");
 
    new BroadcastServer() {
		@Override protected void onClient(String address) {
			System.out.println(String.format("cliente en %s", address));
		}
    }.start();

  }

}
