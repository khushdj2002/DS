package Map.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phone {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        String digits = "2345";
        String data[]  = new String[digits.length()];
        for (int i = 0; i < data.length; i++) {
            data[i]=map.get(Integer.parseInt(""+digits.charAt(i)));
        }
        System.out.println(Arrays.toString(data));
        List<String> ls = new ArrayList<>();

        if(digits.length()==0){
            System.out.println(ls);
        } else if (digits.length() == 1) {
            for (int i = 0; i < data[0].length(); i++) {
                ls.add(""+data[0].charAt(i));
            }
        } else if (digits.length() == 2) {
            for (int i = 0; i < data[0].length(); i++) {
                for (int j = 0; j < data[1].length(); j++) {
                    ls.add(""+data[0].charAt(i)+data[1].charAt(j));
                }
            }
        } else if (digits.length() == 3) {
            for (int i = 0; i < data[0].length(); i++) {
                for (int j = 0; j < data[1].length(); j++) {
                    for (int k = 0; k < data[2].length(); k++) {
                        ls.add(""+data[0].charAt(i)+data[1].charAt(j)+data[2].charAt(k));
                    }
                }
            }
        }
        else{
            for (int i = 0; i < data[0].length(); i++) {
                for (int j = 0; j < data[1].length(); j++) {
                    for (int k = 0; k < data[2].length(); k++) {
                        for (int l = 0; l < data[3].length(); l++) {
                            ls.add(""+data[0].charAt(i)+data[1].charAt(j)+data[2].charAt(k)+data[3].charAt(l));
                        }
                    }
                }
            }
        }

        System.out.println(ls);
    }
}
