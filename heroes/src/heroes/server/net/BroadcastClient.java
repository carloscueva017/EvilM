package heroes.server.net;

import java.io.IOException;
import java.net.DatagramPacket;

public abstract class BroadcastClient extends BroacastAbstract {

  public BroadcastClient() {
    super("bcast-client");
  }

  @Override public final void run() {

    final DatagramPacket hello = Datagrams.hello();

    try {

      socket.send(hello);

      final DatagramPacket result = receive();
      final String address = result.getAddress().getHostAddress();

      onDiscovery(address);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected abstract void onDiscovery(String address);
}
