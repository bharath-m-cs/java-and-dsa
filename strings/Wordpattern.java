package Strings;

import java.util.HashMap;

class Wordpattern {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        char ch[] = pattern.toCharArray();
        String[] st = s.split(" ");

        if (ch.length != st.length) {
            return false;
        }

        for (int i = 0; i < ch.length; i++) {

            if (map.containsKey(ch[i])) {
                String x = map.get(ch[i]);

                if (!x.equals(st[i])) {
                    return false;
                }
            }

            if (map2.containsKey(st[i])) {
                if (map2.get(st[i]) != ch[i]) {
                    return false;
                }
            }

            map.put(ch[i], st[i]);
            map2.put(st[i], ch[i]);
        }

        return true;

    }
}