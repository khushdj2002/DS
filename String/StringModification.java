package String;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringModification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        LinkedList<String> list = new LinkedList<>();
        list.add(s);
        
        int j =0;
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            if(arr[i].charAt(0)=='1'){
//                 System.out.println("1");
                String str = arr[i].substring(2,arr[i].length());

                s=s+str;
                list.add(s);
//                j++;
//                 System.out.println(s);
            }
            else if(arr[i].charAt(0)=='2'){
//                 System.out.println("2");
                char ch = arr[i].charAt(2);
                int ch1 = ch-'0';
                int ch2 = s.length()-ch1;
//                 System.out.println(ch1);
                String str2 =s.substring(0,ch2);
//                 System.out.println(str2);
                s=str2;
                list.add(s);
                j++;

            }
            else if(arr[i].charAt(0)=='3'){
//                 System.out.println("3");
                char ch3 = arr[i].charAt(2);
                int ch4 = ch3-'0';
                System.out.println(s.charAt(ch4-1));
//                list.add(s);
//                j++;
            }
            else if(arr[i].charAt(0)=='4'){
//                 System.out.println("4");
                list.removeLast();
                s= list.getLast();


//                System.out.println(s);
//                list.add(s);
//                s = list.get(--j);
//                 j--;
//                 System.out.println(s);
            }
//            System.out.println(arr[i]);
        }
//        System.out.println(Arrays.toString(arr));
    }
}
