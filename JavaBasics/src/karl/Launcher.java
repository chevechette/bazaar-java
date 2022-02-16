package karl;

import ajc.basics.*;

import java.util.ArrayList;
import java.util.Scanner;

// Karl's solution
public class Launcher {
    public static void main(String[] args) {
    	
        ArrayList<Orc> listOrc=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("bonjour");
            System.out.println("Que voulez vous faire?\n" +
                    "1: Ajouter un Orc\n" +
                    "2: Supprimer un Orc\n" +
                    "3: Afficher la force totale\n" +
                    "4: Quitter");
            String index = scanner.next();
            switch(index) {
                case "1":
                    System.out.println("Nom?");
                    String name=scanner.next();

                    System.out.println("Force?");
                    int force=Integer.parseInt(scanner.next());

                    System.out.println("Health?");
                    int healt=Integer.parseInt(scanner.next());

                    Orc orc=new Orc(name,healt,force);
                    listOrc.add(orc);
                    break;
                case "2":
                    if(listOrc.size()>0){
                    System.out.println("Quel Orc voulez vous supprimer");
                    for (int i = 0; i < listOrc.size(); i++) {
                        System.out.println(i+"/ "+listOrc.get(i).getName());
                    }
                    int orcIndex= Integer.parseInt(scanner.next());
                    System.out.println(listOrc.get(orcIndex).getName()+" supprimé, il reste "+(listOrc.size()-1)+" orcs");
                    listOrc.remove(orcIndex);}
                    else System.out.println("pas d'orc a supprimer");
                    break;
                case "3":
                    int forceCumul = 0;
                    for (Orc orc1:listOrc) {
                        forceCumul+= orc1.getForce();
                    }
                    System.out.println("Force cumulée: "+forceCumul);
                    break;
                case "4":
                    System.out.println("Au revoir");
                    System.exit(0);
                    break;
                default:continue;
            }
        }
    }
}

