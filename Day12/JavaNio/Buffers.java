package Day12.JavaNio;

import java.nio.CharBuffer;
import java.nio.IntBuffer;

class Buffers {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(30);
        for (int i = 1; i <= 26; i++) {
            intBuffer.put(i);
        }
        System.out.println("Position: " + intBuffer.position());
        System.out.println("Limit: " + intBuffer.limit());
        System.out.println("Capacity: " + intBuffer.capacity());

        intBuffer.flip();

        System.out.println("Position: " + intBuffer.position());
        System.out.println("Limit: " + intBuffer.limit());
        System.out.println("Capacity: " + intBuffer.capacity());

        System.err.println("Integer Buffer");
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
        intBuffer.clear();
        System.out.println("Position: " + intBuffer.position());
        System.out.println("Limit: " + intBuffer.limit());
        System.out.println("Capacity: " + intBuffer.capacity());

        CharBuffer charBuffer = CharBuffer.allocate(26);
        for (char i = 'a'; i <= 'z'; i++) {
            charBuffer.put(i);
        }
        System.out.println("Position: " + charBuffer.position());
        System.out.println("Limit: " + charBuffer.limit());
        System.out.println("Capacity: " + charBuffer.capacity());

        charBuffer.flip();

        System.out.println("Position: " + charBuffer.position());
        System.out.println("Limit: " + charBuffer.limit());
        System.out.println("Capacity: " + charBuffer.capacity());

        System.err.println("Character Buffer");
        while (charBuffer.hasRemaining()) {
            System.out.println(charBuffer.get());
        }
        charBuffer.clear();
        System.out.println("Position: " + charBuffer.position());
        System.out.println("Limit: " + charBuffer.limit());
        System.out.println("Capacity: " + charBuffer.capacity());

    }
}