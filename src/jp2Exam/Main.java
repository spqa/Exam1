/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp2Exam;

/**
 *
 * @author QuangAnh
 */
public class Main {

    public static void main(String[] args) {
        String line="";
        ThreadOne th = new ThreadOne(line);
        ThreadTwo th1 = new ThreadTwo(line);
        th.start();
        th1.start();
    }
}
