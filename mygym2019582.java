package sample1;
import java.util.Scanner;

public class mygym2019582 {


        public static void main(String[] args) {

            DefaultMembers defaultme = new DefaultMembers();
            StudentMember studentMe  = new StudentMember();
            Over60Members over60Me   = new Over60Members();

            while(true) {

                Scanner Inputmain = new Scanner(System.in);
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Add new members...");
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Please enter the default members for 1 and 2  for student member and 3 for over 60 members :");
                int selectnum = Inputmain.nextInt();

                if (selectnum == 1) {
                    defaultme.Default();
                } else if (selectnum == 2) {
                    studentMe.Students_Details();
                } else if (selectnum == 3) {
                    over60Me.Over60();
                } else {
                    if (selectnum > 3 || selectnum < 0) {
                        System.out.println("Please enter the 0 to 3 number");
                    } else {
                        System.out.println("Syntax error");
                    }
                }
            }






        }
    }

