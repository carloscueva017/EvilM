package heroes.server.net;
import heroes.Config;

import java.io.IOException;
import java.net.DatagramPacket;

public abstract class BroadcastServer extends BroacastAbstract {

    public BroadcastServer() {
      super("bcast-server", Config.PORT_BROADCAST);
    }

    @Override public final void run() {
      for (;;) {
        try {
          accept();
        }
        catch (IOException e) {
            // ¯\_(ツ)_/¯
        }
      }
    }

    private void accept () throws IOException {

      final DatagramPacket ping = receive();

      if (Datagrams.isHello(ping)) {
        final DatagramPacket pong = Datagrams.here();
        pong.setSocketAddress(ping.getSocketAddress());
        socket.send(pong);
        onClient(ping.getAddress().getHostAddress());
      }
    }
    
    protected abstract void onClient(String address);
  }