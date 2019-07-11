package com.io.star;

public class starMain {
    public static void main(String[] args) {

        drawStar();
        drawAlphabet();

    }
    public static void drawStar(){
        char c = '*';

        for(int i = 1;i<6;i++)
        {
            for(int k = 5-i; k > 0 ;k--)
            {
                System.out.print(" ");
            }

            for(int j = 0;j < i;j++)
            {
                System.out.print(c);

            }

            System.out.println();
        }

    }
    public static void drawAlphabet(){
        char alphabet = 65;

        for(int i = 0; i <= 26;i++)
        {
            for(int j = 26;j>i;j-- ) {
                System.out.print(" ");
            }
            for(int k = 0;k<i;k++ ) {
                System.out.print(alphabet);
                alphabet++;
            }
            alphabet=65;
            System.out.println();
        }

    }

}
