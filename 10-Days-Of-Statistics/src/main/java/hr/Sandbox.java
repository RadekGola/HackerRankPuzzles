package hr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.BiFunction;

public class Sandbox implements BiFunction<Class,byte[],byte[]>{

    @Override
    public byte[] apply(Class aClass, byte[] input) {
        try {
            ByteArrayInputStream inStream = new ByteArrayInputStream(input);
            System.setIn(inStream);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream out = new PrintStream(outputStream);
            PrintStream originalOut = System.out;
            System.setOut(out);

            aClass.getMethod("main",String[].class).invoke(null, (Object)new String[0]);

            System.setOut(originalOut);
            return outputStream.toByteArray();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
