package com.Ashu.srting;

import java.util.ArrayList;

public class Count_items_matching_rule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> item = new ArrayList<ArrayList<String>>();
//        item = item = {{"phone", "blue", "pixel"},
//                {"computer", "silver", "lenovo"},
//                {"phone", "silver", "iphone"}};
        String[][] items = {{"phone", "blue", "pixel"},
                            {"computer", "silver", "lenovo"},
                            {"phone", "silver", "iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";
        int count = 0;
        if (ruleKey.equals("type")){
            for (int i = 0; i < items.length; i++) {
                if (ruleValue == items[i][0]){
                    count++;
                }
            }
        }
        if (ruleKey.equals("color")){
            for (int i = 0; i < items.length; i++) {
                if (ruleValue == items[i][1]){
                    count++;
                }
            }
        }
        if (ruleKey.equals("name")){
            for (int i = 0; i < items.length; i++) {
                if (ruleValue == items[i][2]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
