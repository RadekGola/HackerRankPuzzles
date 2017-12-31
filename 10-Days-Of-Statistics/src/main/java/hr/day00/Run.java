package hr.day00;

import hr.Sandbox;

public class Run {

    public static void main(String[] args) {
        String input = "10\n" +
                "64630 11735 14216 99233 14470 4978 73429 38120 51135 67060";

        byte[] result = new Sandbox().apply(Solution.class, input.getBytes());

        System.out.print(new String(result));
    }


}
