package sample2019582;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import java.util.Scanner;

public class ConsoleMenu2019582 {

    private final static MyGymManager manager9 = new MyGymManager();
    private static int Mycount9 = 0;
    private static boolean Myflag9 = false;

    public static void main(String[] args){
        while (Mycount9 !=100){
            System.out.println("------------------------------------------------------------------");
            System.out.println("-----------|                                                     |");
            System.out.println("-----------|          Welcome to My Gym Manager 2019582          |");
            System.out.println("-----------|                                                     |");
            System.out.println("------------------------------------------------------------------");
            System.out.println("           |          Click_0 To_Delete_A_Member            |");
            System.out.println("           |          Click_1 To_Add_A_Member               |");
            System.out.println("           |          Click_2 To_Print_List_of_Members      |");
            System.out.println("           |          Click_3 To_Save_Members               |");
            System.out.println("           |          Click_4 To_Sort_Members               |");
            System.out.println("           |          Click_5 To_Display_GUI                |");
            System.out.println("           |          Click_6 To_Exit                       |");
            System.out.println("----------------------------------------------------------");
            System.out.println();

            Scanner scanner9 = new Scanner(System.in);

            System.out.print("-----------Please Enter a option To RUN: ");

            int Myoption = scanner9.nextInt();

            System.out.println("----------------------------------------------------------");



            switch (Myoption){//this used to select one of many code blocks to be executed.
                case 0:
                    deletemember2019582();
                    break;
                case 1:
                    addnewmember2019582();
                    break;
                case 2:
                    manager9.printmemberslist2019582();
                    break;
                case 3:
                    manager9.savelist2019582();
                    break;
                case 4:
                    manager9.sortlist2019582();
                    break;
                case 5:
                    launchGui(Gui.class);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter VALID input!!!");
            }
        }
    }
    public static void launchGui(Class <? extends Application> Gui){
        if (!Myflag9){
            Platform.setImplicitExit(false);//this is a collection of programs that helps programmers to efficiently develop and run Java applications.
            new Thread(()->Application.launch(Gui)).start();
            Myflag9 = true;
        }
        else {
            Platform.runLater(()->{
                try {
                    Application application9= Gui.newInstance();
                    Stage Mystage2019582 = new Stage();
                    application9.start(Mystage2019582);

                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }
    }

    private static void deletemember2019582() {
        Scanner scanner9 = new Scanner(System.in);
        System.out.print("Enter_MemberID_to_Delete: ");
        String membershipID2019582 = scanner9.next();
        boolean myresult = manager9.deletemember2019582(membershipID2019582);
        if (myresult) Mycount9--;
    }

    private static void addnewmember2019582() {
        Scanner scanner9 = new Scanner(System.in);
        Scanner Myname = new Scanner(System.in);
        if (Mycount9 < 100){
            System.out.println("--------------------------------------------------------");
            System.out.print("Please Enter New Membership ID No.: ");
            String membershipID2019582 = scanner9.next();
            System.out.println("--------------------------------------------------------");

            System.out.println("--------------------------------------------------------");
            System.out.print("Please Enter Member  Name: ");
            String membername2019582 = Myname.nextLine();
            System.out.println("--------------------------------------------------------");

            System.out.println("--------------------------------------------------------");
            System.out.print("Please Enter Member Gender: ");
            String membergender2019582 = scanner9.next();
            System.out.println("--------------------------------------------------------");

            System.out.println("--------------------------------------------------------");
            System.out.print("Please Enter Member Weight In KG: ");
            float memberweight2019582 = scanner9.nextFloat();
            System.out.println("--------------------------------------------------------");

            System.out.println("--------------------------------------------------------");
            System.out.print("Please_Enter_Start_Date (DD): ");
            byte date = scanner9.nextByte();
            System.out.print("Please_Enter_Start_Month (MM): ");
            byte month = scanner9.nextByte();
            System.out.print("Please_Enter_Start_Year (YYYY): ");
            short year = scanner9.nextShort();
            Date membershipdate2019582 = new Date(date, month, year);
            System.out.println("--------------------------------------------------------");

            System.out.println("           -------------------------------------------------------");
            System.out.println("\r           |            ADD_0_to_Default_Member_Type             |");
            System.out.println("\r           |            ADD_1_to_Student_Member_Type             |");
            System.out.println("\r           |            ADD_2_to_Over60_Member_Type              |");
            System.out.println("           -------------------------------------------------------");


            System.out.print("Please Enter The Membership_Type: ");

            int Myoptionmembers = scanner9.nextInt();

            System.out.println("---------------------------------------------------------------------");
            DefaultMember newMember9 = null;
            switch (Myoptionmembers){
                case 0: newMember9 = new DefaultMember(membershipID2019582,  membername2019582, membergender2019582, memberweight2019582, membershipdate2019582);
                    break;
                case 1:
                    System.out.println("---------------------------------------------------------------------");
                    System.out.print("Enter Member School: ");
                    String schoolName2019582 = scanner9.next();
                    System.out.println("---------------------------------------------------------------------");

                      newMember9 = new StudentMember(membershipID2019582,  membername2019582, membergender2019582, memberweight2019582 ,schoolName2019582,membershipdate2019582);
                    break;

                case 2:
                    System.out.println("---------------------------------------------------------------------");
                    System.out.print("Enter Member Age: ");
                    int memberAge2019582 = scanner9.nextInt();
                    System.out.println("---------------------------------------------------------------------");
                    newMember9 = new Over60Member(membershipID2019582,  membername2019582, membergender2019582, memberweight2019582, memberAge2019582, membershipdate2019582);
                    break;
                default:
                    System.out.println("Input is NOT Valid!!!");
            }
            manager9.addnewmember2019582(newMember9);
            Mycount9++;
        }else System.out.println("No_Free_Slots_Available");
    }

}
