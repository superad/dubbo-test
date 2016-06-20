package service;

import org.junit.Test;

import java.util.UUID;

/**
 * Created by fgm on 2016/6/4.
 */
public class SeqService {

    public static String[] chars_62 = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };

    public static String[] chars_36 = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9"};

    @Test
    public void test(){
        System.out.println(chars_36.length);
        String seq=generateSeq();
       //
        System.out.println(Character.MAX_RADIX);
       // System.out.println(Integer.parseInt(seq,36));
    }




    public static String generateSeq() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            System.out.println(str);
            int x = Integer.parseInt(str, 16);
           // shortBuffer.append(chars_36[x % 0x3E]);
            shortBuffer.append(chars_36[x % 0x24]);
        }
        return shortBuffer.toString();

    }

}
