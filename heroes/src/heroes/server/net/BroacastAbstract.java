package heroes.server.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

abstract class BroacastAbstract extends Thread {

  protected final DatagramSocket socket;

  public BroacastAbstract(String name) {
    super(name);
    try {
      socket = new DatagramSocket();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public BroacastAbstract(String name, int port) {
    super(name);
    try {
      socket = new DatagramSocket(port);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected DatagramPacket receive() throws IOException {
    final DatagramPacket buffer = Datagrams.buffer();
    socket.receive(buffer);
    return buffer;
  }
}
