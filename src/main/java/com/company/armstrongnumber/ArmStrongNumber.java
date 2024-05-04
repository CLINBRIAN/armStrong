/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.armstrongnumber;

/**
 *
 * @author kamau
 */
public class ArmStrongNumber {

    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int r, sum = 0;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("is armstrong number");
        }
        else
            System.out.println("is not armstrong number");

    }
}
