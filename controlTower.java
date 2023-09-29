import java.util.Scanner;
import assignment2.Airplane;
import java.lang.Math;

public class Assignment2
{
  public static void main(String[] args)
  {
Scanner scan = new Scanner(System.in);
Airplane a = new Airplane();
System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
String b = scan.nextLine();
String c = b.toUpperCase();
Double d = scan.nextDouble();
int e = scan.nextInt();
int f = scan.nextInt();
Airplane g = new Airplane();
String air = ("AAA02");
double num = 15.8;
int num2 = 128;
int num3 = 30000;
Airplane h = new Airplane(air, num, num2, num3);
Airplane i = new Airplane(c, d, e,f);

System.out.println("");
System.out.println("Initial Positions:");
System.out.println("\"Airplane 1\": "+g);
System.out.println("\"Airplane 2\": "+h);
System.out.println("\"Airplane 3\": "+i); 
 
 System.out.println("");

System.out.println("Initial Distances:");
double j = g.distTo(h);
double k = g.distTo(i);
double l = h.distTo(i);

System.out.println("The distance between Airplane 1 and Airplane 2 is " +j + " miles.");
System.out.println("The distance between Airplane 1 and Airplane 3 is "+ k + " miles.");
System.out.println("The distance between Airplane 2 and Airplane 3 is " + l + " miles.");
 System.out.println("");

int m = g.getAlt();
int n = h.getAlt();
int o = i.getAlt();

int p = n - m;
int q = o - m;
int r = n - o;

System.out.println("Initial Height Differences:");
System.out.println("The difference in height between Airplane 1 and Airplane 2 is "+ p + " feet.");
System.out.println("The difference in height between Airplane 1 and Airplane 3 is "+ q + " feet.");
System.out.println("The difference in height between Airplane 2 and Airplane 3 is "+ r + " feet.");

System.out.println("");

g.gainAlt();
g.gainAlt();
g.gainAlt();
h.loseAlt();
h.loseAlt();
i.loseAlt();
i.loseAlt();
i.loseAlt();
i.loseAlt();
g.move(l, 65);
h.move(8 , 135);
i.move(5 , 55);

System.out.println("New Positions: ");
System.out.println("\"Airplane 1\": "+g);
System.out.println("\"Airplane 2\": "+h);
System.out.println("\"Airplane 3\": "+i); 

System.out.println("");

double s = g.distTo(h);
double t = g.distTo(i);
double u = h.distTo(i);

System.out.println("New Distances:");
System.out.println("The distance between Airplane 1 and Airplane 2 is " +s + " miles.");
System.out.println("The distance between Airplane 1 and Airplane 3 is "+ t + " miles.");
System.out.println("The distance between Airplane 2 and Airplane 3 is " +u + " miles.");

System.out.println("");

int v = g.getAlt();
int w = h.getAlt();
int x = i.getAlt();


int x2 = w - v;
int  y = x - v;
int  z = w - x;
int z1 = Math.abs(y);

System.out.println("New Height Differences:");
System.out.println("The difference in height between Airplane 1 and Airplane 2 is "+ x2 + " feet.");
System.out.println("The difference in height between Airplane 1 and Airplane 3 is "+ z1 + " feet.");
System.out.println("The difference in height between Airplane 2 and Airplane 3 is "+ z + " feet.");

  }
}
