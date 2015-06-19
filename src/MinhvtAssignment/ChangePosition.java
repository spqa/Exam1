/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhvtAssignment;

/**
 *
 * @author QuangAnh
 */
public class ChangePosition {
    public <E> void  changePosition(E[] inputArray){
        E temp1=inputArray[1];
        E temp2=inputArray[2];
        inputArray[2]=temp1;
        inputArray[1]=temp2;
        for (E inputArray1 : inputArray) {
            System.out.println(inputArray1);
        }
    }
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6};
        String[] b={"A","B","C","D","E"};
        ChangePosition c=new ChangePosition();
        c.changePosition(a);
        c.changePosition(b);
    }
}
