package Others.PlacementTraining;

import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            double hr = Integer.parseInt(s.substring(0, 2));
            double min = Integer.parseInt(s.substring(3, 5));

            min = min * 6;
            hr = (hr * 30) + (min * 30) / 360;
            if (hr > 360) {
                hr = hr - 360;
            }
            if (Math.abs(hr - min) <= 180) {
                System.out.println(Math.abs(hr - min));
            } else {
                if (hr > min) {
                    hr = 360 - hr;
                } else {
                    min = 360 - min;
                }
                System.out.printf("%.1f", Math.abs(hr + min));
            }
    }
}
