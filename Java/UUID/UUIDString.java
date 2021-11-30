import java.io.*;
import java.util.UUID;

public class UUIDString {
  public static void main(String[] args) {

	UUID uuid1 = UUID.randomUUID();
	UUID uuid2 = UUID.randomUUID();
	String randomUUIDString1 = uuid1.toString();
	String randomUUIDString2 = uuid2.toString();

	System.out.println("UUID version       = " + uuid1.version());
	System.out.println("UUID variant       = " + uuid1.variant());
	System.out.println("First Random UUID String = " + randomUUIDString1);
	System.out.println("Second Random UUID String = " + randomUUIDString2);
  }
}