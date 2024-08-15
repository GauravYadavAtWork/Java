package Unit_3_JavaFeatures;

import java.util.Base64;

public class base64encoderanddecoder {
    public static void main(String[] args) {
        String str = "Hi, I am gaurav yadav";
        byte[] b = str.getBytes();
        // encoding to string
        String base64 = Base64.getEncoder().withoutPadding().encodeToString(b);
        System.out.println(base64);

        // decoding to bytes
        byte[] decodedbytes = Base64.getDecoder().decode(base64);
        System.out.println(new String(decodedbytes));
    }
}
