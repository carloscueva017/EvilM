package heroes.server.net;

import heroes.Config;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

final class Datagrams {

  private final static InetAddress ADDR;
  private final static String HELLO = "Hola Hola Vecinillo!";
  private final static String HERE = "Perfectirijillo!!";

  static {
    try {
      ADDR = InetAddress.getByName("255.255.255.255");
    }
    catch (UnknownHostException e) {
      throw new RuntimeException(e);
    }
  }

  public static DatagramPacket buffer() {
    final byte[] buff = new byte[100];
    return new DatagramPacket(buff, buff.length);
  }

  public static String unpack(DatagramPacket packet) {
    return new String(packet.getData());
  }

  static DatagramPacket pack(String msg) {
    final byte[] bytes = msg.getBytes();
    return new DatagramPacket(bytes, bytes.length, ADDR, Config.PORT_BROADCAST);
  }

  static DatagramPacket hello () {
    return pack(HELLO);
  }

  static DatagramPacket here () {
    return pack(HERE);
  }

  public static boolean isHello(DatagramPacket packet) {
    final String msg = unpack(packet);
    return HELLO.equals(msg.trim());
  }

}
