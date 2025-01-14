package exercices;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {

    private final Character SEPARATOR = '@';
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(var str: strs) {
            encoded.append(str.length()).append(SEPARATOR).append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i+1;
            while(str.charAt(j) != SEPARATOR) {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j + 1, j+1+len);
            decoded.add(word);
            i = j + len + 1;
        }
        return decoded;
    }
}
