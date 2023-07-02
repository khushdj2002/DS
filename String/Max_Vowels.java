package String;

public class Max_Vowels {
    public static void main(String[] args) {
        String s = "Welalcome";
        int k=3;
        int count=0;
        int max=0;
        String a = s.substring(0,k);
        StringBuilder sb = new StringBuilder(a);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                count++;
            }
        }
        max=count;
        for (int i = 0; i < s.length() - k; i++) {
            char c = sb.charAt(i);
            char d = s.charAt(i+k);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count--;
            }
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'){
                count++;
            }
            if(count>max){
                max=count;
            }
            sb.append(d);
        }
        System.out.println(max);
    }
}
