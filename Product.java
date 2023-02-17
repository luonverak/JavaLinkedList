package LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        LinkedList<Data> linkedList=new LinkedList<>();
        Data data=new Data();
        Scanner sc = new Scanner(System.in);
        int i,n=0,op=0;
        do
        {
            System.out.println("------------- P R O D U C T ----------------");
            System.out.println("\t 1,   Add");
            System.out.println("\t 2,   Output");
            System.out.println("\t 3,   Search");
            System.out.println("\t 4,   Update");
            System.out.println("\t 5,   Insert");
            System.out.println("\t 6,   Remove");
            System.out.println("\t 7,   Sort");
            System.out.println("\t 8,   Add more");
            System.out.println("\t 9,   Clear");
            System.out.println("\t 10,   Exit");
            System.out.print("Choose option on the menu = ");op=sc.nextInt();
            switch(op)
            {
                case 1:{
                    System.out.print("Input number of product = ");
                    n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        data=new Data();
                        data.Input();
                        linkedList.add(data);
                    }
                }break;
                case 2:{
                    if(linkedList.isEmpty()){
                        System.out.println("Non Data !");
                    }
                    for(i=0;i<linkedList.size();i++)
                    {
                        linkedList.get(i).Output();
                    }
                }break;
                case 3:{
                    int var;
                    System.out.print("Search by code = ");var=sc.nextInt();
                    for(i=0;i<linkedList.size();i++)
                    {
                        if(var==linkedList.get(i).getCode())
                        {
                            linkedList.get(i).Output();
                        }
                    }
                }break;
                case 4:{
                    int var;
                    System.out.print("Search by code = ");var=sc.nextInt();
                    for(i=0;i<linkedList.size();i++)
                    {
                        if(var==linkedList.get(i).getCode())
                        {
                            data=new Data();
                            data.Input();
                            linkedList.set(i,data);
                        }
                    }
                }break;
                case 5:{
                    int var;
                    System.out.print("Search by code = ");var=sc.nextInt();
                    for(i=0;i<linkedList.size();i++)
                    {
                        if(var==linkedList.get(i).getCode())
                        {
                            data=new Data();
                            data.Input();
                            linkedList.add(i,data);
                            break;
                        }
                    }
                }break;
                case 6:{
                    int var;
                    System.out.print("Search by code = ");var=sc.nextInt();
                    for(i=0;i<linkedList.size();i++)
                    {
                        if(var==linkedList.get(i).getCode())
                        {
                            linkedList.remove(i);
                        }
                    }
                }break;
                case 7:{
                    Collections.sort(linkedList, Comparator.comparing(Data::getPrice));
                }break;
                case 8:{
                    int add;
                    System.out.print("Add more data = ");add=sc.nextInt();
                    for(i=n;i<n+add;i++){
                        data=new Data();
                        data.Input();
                        linkedList.addLast(data);
                    }
                }break;
                
            }
        }while(op!=10);
    }
}
