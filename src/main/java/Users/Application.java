package Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Configuration --- First Step
        Configuration configuration = new Configuration();
        configuration.configure();
        //Session factory building ---> Build Session factory with configuration
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //Create Objects
        // Application
        // Using Switch Case
        System.out.println("WELCOME TO SPYDO ECONOMY");
        System.out.println("INPUT 1 ->> LOG IN AS MESS MEMBER");
        System.out.println("INPUT 2 ->> LOG IN AS MANAGER");
        System.out.println("INPUT 3 ->> LOG IN AS DEVELOPER");
        System.out.println("INPUT-->");
        int input = sc.nextInt();
        switch(input){
            case 1:
                System.out.println("PLEASE INPUT YOUR NAME");

            case 2:
                System.out.println("INPUT YOUR PASSWORD");
                String password = sc.next();
                String pass = "fuckyou1234";
                if (password.equals(pass)){
                    boolean x = true;
                    while(x){
                        System.out.println("WELCOME MANAGER");
                        System.out.println("INPUT 1->> ADD MEMBER");
                        System.out.println("INPUT 2->>DELETE MEMBER");
                        System.out.println("INPUT 5 ->> EXIT MANAGER PANEL");
                        System.out.println("INPUT->");
                        int i = sc.nextInt();
                        switch(i){
                            case 1:
                                System.out.println("MEMBER ID");
                                int mid = sc.nextInt();
                                System.out.println("MEMBER NAME->");
                                String name = sc.nextLine();
                                System.out.println("PHONE NUMBER->");
                                String phone = sc.nextLine();
                                System.out.println("EMAIL->");
                                String email = sc.nextLine();
                                Member m1 = new Member(mid,name,email,phone);
                                //Opening session
                                Session session = sessionFactory.openSession();
                                Transaction txn = session.beginTransaction();
                                session.save(m1);
                                txn.commit();
                                //Closing Session
                                session.close();
                                sessionFactory.close();
                        }


                    }



                }
        }
    }
}
