import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> alphabet = new HashMap<>();
        alphabet.put(1, "A");
        alphabet.put(2, "B");
        alphabet.put(3, "C");
        alphabet.put(4, "D");
        alphabet.put(5, "E");
        alphabet.put(6, "F");
        alphabet.put(7, "G");
        alphabet.put(8, "H");
        alphabet.put(9, "I");
        alphabet.put(10, "J");
        alphabet.put(11, "K");
        alphabet.put(12, "L");
        alphabet.put(13, "M");
        alphabet.put(14, "N");
        alphabet.put(15, "O");
        alphabet.put(16, "P");
        alphabet.put(17, "Q");
        alphabet.put(18, "R");
        alphabet.put(19, "S");
        alphabet.put(20, "T");
        alphabet.put(21, "U");
        alphabet.put(22, "V");
        alphabet.put(23, "W");
        alphabet.put(24, "X");
        alphabet.put(25, "Y");
        alphabet.put(26, "Z");

        HashMap<String, Integer> index = new HashMap<>();
        index.put("A", 1);
        index.put("B", 2);
        index.put("C", 3);
        index.put("D", 4);
        index.put("E", 5);
        index.put("F", 6);
        index.put("G", 7);
        index.put("H", 8);
        index.put("I", 9);
        index.put("J", 10);
        index.put("K", 11);
        index.put("L", 12);
        index.put("M", 13);
        index.put("N", 14);
        index.put("O", 15);
        index.put("P", 16);
        index.put("Q", 17);
        index.put("R", 18);
        index.put("S", 19);
        index.put("T", 20);
        index.put("U", 21);
        index.put("V", 22);
        index.put("W", 23);
        index.put("X", 24);
        index.put("Y", 25);
        index.put("Z", 26);

        String test = "BOB";

        int shift = 1;
        String testEncrypt = encrypt(test, shift, alphabet, index);
        System.out.println(testEncrypt);
        String testDecrypt = decrypt(testEncrypt, shift, alphabet, index);
        System.out.println(testDecrypt);
    }

    public static String encrypt(String s, int k, HashMap<Integer, String> a, HashMap<String, Integer> ind){
        String builder = "";
        s.toUpperCase();
        for (int i = 0; i < s.length(); i++){
            int key = ind.get(String.valueOf(s.charAt(i)));
            int shifted = key + k;
            builder += a.get(shifted);
        }
        return builder;
    }

    public static String decrypt(String s, int k, HashMap<Integer, String> a, HashMap<String, Integer> ind){
        String builder = "";
        for (int i = 0; i < s.length(); i++){
            int key = ind.get(String.valueOf(s.charAt(i)));
            int shifted = key - k;
            builder += a.get(shifted);
        }
        return builder;
    }
}
