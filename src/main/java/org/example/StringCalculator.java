package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int calculate(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] chuncks = text.split(",");
        int total = 0;
        for (String item : chuncks) {
            int num = Integer.parseInt(item);
            total += num;
        }
        return total;
    }

}
