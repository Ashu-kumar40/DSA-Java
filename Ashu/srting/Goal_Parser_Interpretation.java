package com.Ashu.srting;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        command.replace("()", "o");
        System.out.println(command.replace("(al)", "al"));
        System.out.println(command);

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
//            if ()
        }

    }
}
