package LinkedList;

import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Data {

    private int code;
    private String name;
    private int qty;
    private float price;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code = ");
        code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name = ");
        name = sc.nextLine();
        System.out.print("Enter qty  = ");
        qty = sc.nextInt();
        System.out.print("Enter price= ");
        price = sc.nextFloat();
    }

    public float Total() {
        return (qty * price);
    }

    public void Output() {
        System.out.println("\t" + code
                + "\t" + name
                + "\t" + qty
                + "\t" + price
                + "\t" + Total());
    }
}
