/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Market;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class ItemMagager {
    ArrayList<Item> item;
    int n;
    public void setItem(){
        item=new ArrayList<>();
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>10){
            System.out.println("The maximum of Item is 10!!!");
        }else{
            for(int i=0;i<n;i++){
            Item a=new Item();
            a.input();
            item.add(a);
            }
        }
    }
    public void getItem(){
        System.out.println("ItemID\tItemName\tPrice");
        for(int i=0;i<n;i++){
            item.get(i).display();
        }
        Item max=item.get(0);
        Item min=item.get(0);
        for(int a=0;a<n;a++){
            if(item.get(a).getPrice()>max.getPrice()){
                max=item.get(a);
            }
        }
        for(int b=0;b<n;b++){
            if(item.get(b).getPrice()<min.getPrice()){
                min=item.get(b);
            }
        }
        double sum=0;
        for(int c=0;c<n;c++){
            sum=sum+item.get(c).getPrice();
        }
        double avr=sum/n;
        System.out.println("Highest Item Price :"+max.getName()+" : "+max.getPrice());
        System.out.println("Lowest Item Price :"+min.getName()+" : "+min.getPrice());
        System.out.printf("Average Item Price :%.2f\n",avr);
        
    }
    public void findItem(){
        String find;
        boolean isfound=false;
        System.out.println("Enter name u need to find:");
        Scanner sc=new Scanner (System.in);
        find=sc.nextLine();
        for(int i=0;i<n;i++){
            if(find.equals(item.get(i).getName())){
                item.get(i).display();
                isfound=true;
            }
        }
        if(isfound==false){
            System.out.println("Noy found!!!!");
        }
    }
}
