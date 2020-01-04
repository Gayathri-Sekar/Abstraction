package Problem2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
        System.out.print("1.Star Door\r\n" + 
        		"\r\n" + "2.Gas Door\r\n" + "\r\n" + "3.Liquid Door");
        int choice;
        String gas;
        System.out.print("\nEnter Choice:");
        choice=sc.nextInt();
        System.out.print("Enter name:");
        name=sc.next();
        int star;
        int prime;
        if(choice==1)
        {
        	star=sc.nextInt();
        	StarDoor sd=new StarDoor(name,star);
        	sd.unlock();
        }
        else if(choice==2)
        {
        	System.out.print("Enter gas:");
        	gas=sc.next();
        	GlassDoor gd=new GlassDoor(name,gas);
        	gd.unlock();
        }
        else if(choice==3)
        {
        	System.out.print("Enter flow:");
        	prime=sc.nextInt();
        	LiqiudDoor ld=new LiqiudDoor(name,prime);
        	ld.unlock();
        }
	}

}
