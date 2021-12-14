package com.sylvie;

public class poker {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                String tt = "c";
                switch (i){
                    case 1:
                        tt = "d";
                        break;
                    case 2:
                        tt = "h";
                        break;
                    case 3:
                        tt = "s";
                        break;
                }
                System.out.print((j+1)+tt);
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
