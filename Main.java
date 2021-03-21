import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
    String nm, nmf, isbn, na, m;
    int isbnn, n;
		File f = new File("test.txt");
    PrintWriter fw = new PrintWriter(f);
    File v = new File("eskere.txt");
    PrintWriter vw = new PrintWriter(v);
	  Scanner sfile = new Scanner(f);//Scanner collegato al file
    Scanner svile = new Scanner(v);
    int pro = 99;
    while (pro!=6){
      System.out.println("Scegli il programma:");
      System.out.println("1) Inserimento nuovo libro");
      System.out.println("2) Cancellazione libro ");
      System.out.println("3) Modifica del libro");
      System.out.println("4) Ricerca libro tramite ISBN");
      System.out.println("5) Ricerca libri tramite autore");
      System.out.println("6) Esci");
      pro=s.nextInt();
      if (pro==1){
        System.out.print("Inserire nome libro: ");
				nm = s.nextLine();
        System.out.print("Inserisci ISBN:");
        isbn = s.nextLine();
        System.out.print("Inserisci nome autore: ");
        na = s.nextLine();
        fw.write(nm+", "+ isbn +", "+ na);
      }
      else if(pro==2){
        System.out.print("Inserisci ISBN: ");
        n = s.nextInt();
        while (sfile.hasNextLine()) { // Lettura del file
          var str = sfile.nextLine();
          fw.write(" ");
          var res = str.split(", ");
          nm = res[0];
          isbn = res[1];
          na = res[2];
          isbnn = Integer.parseInt(isbn);
          if(isbnn!=n){
            vw.write(nm+", "+ isbn +", "+ na);
          }
        }
        
        while (svile.hasNextLine()){
          var str = sfile.nextLine();
          var res = str.split(", ");
          nm = res[0];
          isbn = res[1];
          na = res[2];
          fw.write(nm+", "+ isbn +", "+ na);
        }
      }
      else if(pro==3){
        System.out.print("Inserisci ISBN: ");
        n = s.nextInt();
        while (sfile.hasNextLine()) { // Lettura del file
          var str = sfile.nextLine();
          fw.write(" ");
          var res = str.split(", ");
          nm = res[0];
          isbn = res[1];
          na = res[2];
          isbnn = Integer.parseInt(isbn);
          if(isbnn==n){
            System.out.print("Inserire nuovo nome libro: ");
				    nm = s.nextLine();
            System.out.print("Inserisci nuovo nome autore: ");
            na = s.nextLine();
            vw.write(nm+", "+ isbn +", "+ na);
          }
          else {
            vw.write(nm+", "+ isbn +", "+ na);
          }
        }
        while (svile.hasNextLine()){
          var str = sfile.nextLine();
          var res = str.split(", ");
          nm = res[0];
          isbn = res[1];
          na = res[2];
          fw.write(nm+", "+ isbn +", "+ na);
          }
        }
        else if(pro==4){
          System.out.print("Inserisci ISBN: ");
          n = s.nextInt();
          while (sfile.hasNextLine()){
            var str = sfile.nextLine();
            var res = str.split(", ");
            nm = res[0];
            isbn = res[1];
            na = res[2];
            isbnn = Integer.parseInt(isbn);
            if(isbnn==n){
              System.out.print("Nome "+ nm + "Autore" + na);
          }
          }
        }
        else if(pro==5){
          System.out.print("Inserisci nome autore: ");
          m = s.nextLine();
          while (sfile.hasNextLine()){
            var str = sfile.nextLine();
            var res = str.split(", ");
            nm = res[0];
            isbn = res[1];
            na = res[2];
            if(m.equals(na)){
              System.out.print("Nome "+ nm + "ISBN " + isbn);
          }
          }
        }
      }
	}
}   