
import java.io.ByteArrayOutputStream;

public class PasswordGenerator {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        byte[] bytes = new byte[8];
        int count;
        for(int i=0; i<bytes.length; i++){
            count = getRandomIntInRange(1,3);
            switch (count){
                case 1: bytes[i] = (byte) getRandomIntInRange(48, 57); break;
                case 2: bytes[i] = (byte) getRandomIntInRange(65, 90); break;
                case 3: bytes[i] = (byte) getRandomIntInRange(97, 122); break;
            }
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(bytes.length);
        baos.write(bytes,0, bytes.length);
        return baos;
    }
    public static int getRandomIntInRange(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
