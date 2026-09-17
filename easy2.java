package com.diagnostic;

import java.util.Scanner;

public class easy2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String srt_no_glas = str.replaceAll("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]", "");
        System.out.println(srt_no_glas);
    }
}
