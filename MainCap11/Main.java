/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCap11;

import capitulo_11.Actor;
import capitulo_11.Book;
import capitulo_11.Bridge;
import capitulo_11.BusinessLoan;
import capitulo_11.Chevy;
import capitulo_11.Child;
import capitulo_11.Division;
import capitulo_11.DomesticDivision;
import capitulo_11.Element;
import capitulo_11.Fiction;
import capitulo_11.Ford;
import capitulo_11.FullTime;
import capitulo_11.Health;
import capitulo_11.House;
import capitulo_11.IncomingPhoneCall;
import capitulo_11.InternationalDivision;
import capitulo_11.Jupiterian;
import capitulo_11.Leaf;
import capitulo_11.Life;
import capitulo_11.Lights;
import capitulo_11.Loan;
import capitulo_11.LoanConstants;
import capitulo_11.Martian;
import capitulo_11.MetalElement;
import capitulo_11.Musician;
import capitulo_11.NewspaperSubscriber;
import capitulo_11.NonFiction;
import capitulo_11.NonMetalElement;
import capitulo_11.Novel;
import capitulo_11.Novella;
import capitulo_11.OutGoingPhoneCall;
import capitulo_11.Page;
import capitulo_11.Pancake;
import capitulo_11.PartTime;
import capitulo_11.PhoneCall;
import capitulo_11.Poker;
import capitulo_11.School;
import capitulo_11.SevenDaySubscriber;
import capitulo_11.ShortStory;
import capitulo_11.Square;
import capitulo_11.Square2;
import capitulo_11.Triangle;
import capitulo_11.Triangle2;
import capitulo_11.Volume;
import capitulo_11.WeekDaySubscriber;
import capitulo_11.WeekendSubscriber;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Main implements LoanConstants {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        
        System.out.println("****************************************************Problem 1");
        Fiction fiction = new Fiction("Harry Potter");
        NonFiction nFiction = new NonFiction("El c\u00f3digo Da Vinci");
        
        System.out.println(fiction.toString());
        System.out.println(nFiction.toString());
        
        ArrayList<Book> books = new ArrayList<>();
        
        books.add(new Fiction("El Hobbit"));
        books.add(new NonFiction("Las Luces de Septiembre"));
        books.add(new Fiction("El Señor de los Anillos"));
        books.add(new NonFiction("Los Elefantes Pueden Recordar"));
        books.add(new Fiction("El Silmarilion"));
        books.add(new NonFiction("La Divina Comedia"));
        books.add(new Fiction("La Guerra de los Mundos"));
        books.add(new NonFiction("Los Miserables"));
        books.add(new Fiction("Yo, Robot"));
        books.add(new NonFiction("En el Nombre de la Rosa"));
        
        for(Book aux:books){
            System.out.println(aux.toString());
        }
        
        
        System.out.println("****************************************************Problem 2");
        
        IncomingPhoneCall phoneCalls1=new IncomingPhoneCall("9711265641");
        OutGoingPhoneCall phoneCalls2=new OutGoingPhoneCall("9711524625",3);
        
        System.out.println(phoneCalls1.getInfo());
        System.out.println(phoneCalls2.getInfo());
        
        ArrayList<PhoneCall> phoneCalls=new ArrayList<>();
        
        phoneCalls.add(new IncomingPhoneCall("1234567890"));
        phoneCalls.add(new IncomingPhoneCall("0987654321"));
        phoneCalls.add(new IncomingPhoneCall("1029384756"));
        phoneCalls.add(new IncomingPhoneCall("5647382910"));
        phoneCalls.add(new IncomingPhoneCall("1627384950"));
        phoneCalls.add(new OutGoingPhoneCall("0594837261",10));
        phoneCalls.add(new OutGoingPhoneCall("0998877665",12));
        phoneCalls.add(new OutGoingPhoneCall("1324354657",4));
        phoneCalls.add(new OutGoingPhoneCall("7418529630",1));
        phoneCalls.add(new OutGoingPhoneCall("5147896320",8));
        
        for(PhoneCall aux1:phoneCalls){
            System.out.println(aux1.getInfo());
        }
        
        
        System.out.println("****************************************************Problem 3");
        
        Chevy chevy = new Chevy();
        Ford ford = new Ford();
        
        System.out.println(chevy.toString());
        System.out.println(ford.toString());
        
        
        System.out.println("****************************************************Problem 4");
        
        Division interDivision = new InternationalDivision("Mexico","Spanish","Los Aguilas","1234567890");
        Division domDivision = new DomesticDivision("Oaxaca","Los Alebrijes","0987654321");
        
        interDivision.display();
        domDivision.display();
        
        System.out.println("****************************************************Problem 5");
        
        
        Element helio = new NonMetalElement("He",2,4.0026);
        Element cobre = new MetalElement("Cu",29,63.546);
        
        System.out.println(helio.describeElement());
        System.out.println(cobre.describeElement());
        
        
        System.out.println("****************************************************Problem 6");
        
        ArrayList<NewspaperSubscriber> nPaper = new ArrayList<>();
        
        int op;
        String street;
        
        do{
            
            System.out.println("Input subscription you want:\n1. Seven Day Subscription\n2. Week Day Subscription\n3. Weekend Subscription\n4. Exit");
            op=Sc.nextInt();
            
            Sc.nextLine();
            
            if(op==1){
                System.out.println("Input street adress: ");
                street=Sc.nextLine();
                nPaper.add(new SevenDaySubscriber(street));
            }else if(op==2){
                System.out.println("Input street adress: ");
                street=Sc.nextLine();
                nPaper.add(new WeekDaySubscriber(street));
                
            }else if(op==3){
                System.out.println("Input street adress: ");
                street=Sc.nextLine();
                nPaper.add(new WeekendSubscriber(street));
            }
        }while(op<4);
        
        for(int i=0 ; i< nPaper.size() ; i++){
            for(int j=0; j<nPaper.size() ; j++){
                if((i!=j) && (nPaper.get(i).getSERVICE().equals(nPaper.get(j).getSERVICE())) && (nPaper.get(i).getStreet().equals(nPaper.get(j).getStreet()))){
                    nPaper.remove(j);
                }
            }
        }
        
        for(NewspaperSubscriber aux3:nPaper){
            System.out.println(aux3.toString());
        }
        
        
        System.out.println("****************************************************Problem 7");
        
        Novel novel = new Novel("Avatar","Luis",10);
        Novel novel2 = new Novel("Avatar","Luis",101);
        Novella novella = new Novella("La Rosa de Guadalupe","Karim",12);
        ShortStory sStory = new ShortStory("La Rosa y el Ruiseñor","Oscar Wilde",90);
        
        System.out.println(novel.toString());
        System.out.println(novel2.toString());
        System.out.println(novella.toString());
        System.out.println(sStory.toString());
        
        
        System.out.println("****************************************************Problem 8");
        
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        Lights lights = new Lights();
        Volume volume = new Volume();
        
        System.out.println(leaf.getAction());
        System.out.println(page.getAction());
        System.out.println(pancake.getAction());
        System.out.println(lights.getAction());
        System.out.println(volume.getAction());
        
        
        System.out.println("****************************************************Problem 9");
        
        Health health = new Health("abcde");
        Life life = new Life("ABCDE");
        
        life.display();
        health.display();
        
        
        System.out.println("****************************************************Problem 10");
        
        Square square = new Square(2.0,2.0);
        Triangle triangle = new Triangle(2.0,2.0);
        
        square.display();
        triangle.display();
        
        
        System.out.println("****************************************************Problem 11");
        
        Square2 square2 = new Square2(2.0,2.0);
        Triangle2 triangle2 = new Triangle2(2.0,2.0);
        
        square2.display();
        triangle2.display();
        
        
        System.out.println("****************************************************Problem 12");
        
        Child child = new Child();
        Musician musician = new Musician();
        Actor actor = new Actor();
        
        child.play();
        musician.play();
        actor.play();
        
        
        System.out.println("****************************************************Problem 13");
        
        FullTime student1 = new FullTime("Jose Sierra");
        PartTime student2 = new PartTime("Antonio Vargas");
        
        student1.display();
        student2.display();

        
        
        System.out.println("****************************************************Problem 14");
        House house = new House(5,4,200,"Se aparece la bruja de noche.");
        School school = new School(100,"Elementary",12000,"Se construy\u00f3 sobre un pante\u00f3n.");
        
        System.out.println("House:\nNumber of Rooms: "+house.getRooms()+
                "\nNumber of baths: "+house.getBaths()+
                "\nSquare footage: "+house.getsFootage()+
                "\nStorie: "+house.getStories()+"\n\n");
        
        System.out.println("School:\nNuber of classrooms: "+school.getClasrooms()+
                "\nLevel: "+school.getLevel()+
                "\nSquare footage: "+school.getsFootage()+
                "\nStorie: "+school.getStories()+"\n\n");

        
        
        System.out.println("****************************************************Problem 15");
        
        Loan loan = new BusinessLoan(10,"Toral",5000.0,long_term);
        System.out.println("Number of loans: "+loan.getLoanNumbers()+
                "\nCustomer last name: "+loan.getlName()+
                "\nTerm: "+loan.getTerm()+" years"+
                "\nAmount: $"+loan.getAmount()+
                "\nTotal: $"+loan.getTotal());
                
        
        System.out.println("****************************************************GAME ZONE 1");
        
        Martian martian = new Martian(4,5,"Green");
        Jupiterian jupiterian = new Jupiterian(8,2,"Blue");
        
        System.out.println("Martian:\n"+martian.toString()+"\n");
        System.out.println("Jupiterian:\n"+jupiterian.toString()+"\n");
        
        System.out.println("****************************************************GAME ZONE 2");
        Poker hand1 = new Poker();
        
        Bridge hand2 = new Bridge();

        hand1.display();
        System.out.println("\n\n");
        hand2.display();
    }
}
