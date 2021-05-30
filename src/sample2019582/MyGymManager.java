package sample2019582;

import java.io.*;
import java.util.*;


public class MyGymManager implements GymManager {

    public static List<DefaultMember> memberlist2019582 = new ArrayList<>();
    public int membersCount = 0;

    @Override
    public void addnewmember2019582(DefaultMember newMember9) {
        membersCount++;
        System.out.println("----------------------------------------------------------------");
        System.out.println("Count of Members: " + membersCount);
        System.out.println("Count Of Free Slots: " + (100 - membersCount));
        System.out.println("----------------------------------------------------------------");
        if (membersCount < 100) {
            memberlist2019582.add(newMember9);
        }
        else System.out.println("There are No Available Slots!!!!");
    }

    @Override
    public boolean deletemember2019582(String membershipID2019582) {
        boolean flag = false;
        for (DefaultMember defaultMember: memberlist2019582){
            if (defaultMember.getmembershipID9().equals(membershipID2019582)){
                flag = true;
                memberlist2019582.remove(defaultMember);
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Selected Member " + membershipID2019582 + " Was deleted Successfully!!!!");
                System.out.println("--------------------------------------------------------------------");
                membersCount--;
                break;
            }
            else System.out.println("This Id No. is  Not Found!!!!");
        }
        return flag;
    }

    @Override
    public void printmemberslist2019582() {
        for (DefaultMember defaultMember : memberlist2019582) {
            for (int i = 0; i < memberlist2019582.size(); i++){
                System.out.println(Arrays.toString(memberlist2019582().toArray()));
            }
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Membership_ID: " + defaultMember.getmembershipID9());
            System.out.println("Member_Name: " + defaultMember.getmembername9());
            System.out.println("Member_Start_Date: " + defaultMember.getmembershipdate9().getDay() + "/" +
                    defaultMember.getmembershipdate9().getMonth() + "/" + defaultMember.getmembershipdate9().getYear());
            System.out.println("Member_Gender: " + defaultMember.getmembergender9());
            System.out.println("Member_Weight_in_KG: " + defaultMember.getmemberweight9());


            if (defaultMember instanceof StudentMember) {
                System.out.println("Member_School: " + ((StudentMember) defaultMember).getschoolname9());
                System.out.println("Membership_Type: Student_Member");

            }

            else if (defaultMember instanceof Over60Member) {
               System.out.println("Member_Age: " + ((Over60Member) defaultMember).getmemberage9());
               System.out.println("Membership_Type: Over60_Member");
            }
            else System.out.println("Membership_Type: Default_Member");

            System.out.println("-------------------------------------------------------------------");
        }
        if (memberlist2019582.size() == 0) {
            System.out.println("Empty_List!!!!");
            System.out.println("-------------------------------------------------------------------");
        }
    }
    @Override
    public void sortlist2019582(){

        ArrayList<String> membername2019582 = new ArrayList<>();//this is used to store dynamically sized collection of elements.
        ArrayList<String> membershipID2019582 = new ArrayList<>();

        for (int i=0; i<memberlist2019582.size(); i++){
            membername2019582.add(i, memberlist2019582.get(i).getmembername9());
            membershipID2019582.add(i, memberlist2019582.get(i).getmembershipID9());
        }

        for (int i=0; i<memberlist2019582.size()-1; i++){
            for (int j=0; j<memberlist2019582.size()-1-i; j++){
                if (membershipID2019582.get(j).compareTo(membershipID2019582.get(j+1)) > 0){
                    String name22 = membershipID2019582.get(j);
                    membershipID2019582.set(j, membershipID2019582.get(j+1));
                    membershipID2019582.set((j+1), name22);

                    DefaultMember member11 = memberlist2019582.get(i);
                    memberlist2019582.set(j, memberlist2019582.get(j+1));
                    memberlist2019582.set((j+1), member11);
                }
            }
        }

        for (int i=0; i<memberlist2019582.size()-1; i++){
            for (int j=0; j<memberlist2019582.size()-1-i; j++){
                if (membername2019582.get(j).compareTo(membername2019582.get(j+1)) > 0){
                    String name33 = membername2019582.get(j);
                    membername2019582.set(j, membername2019582.get(j+1));
                    membername2019582.set((j+1), name33);

                    DefaultMember member22 = memberlist2019582.get(i);
                    memberlist2019582.set(j, memberlist2019582.get(j+1));
                    memberlist2019582.set((j+1), member22);
                }
            }
        }

        for (int i=0; i<memberlist2019582.size(); i++){
            System.out.println("Member_ID No.: " + membershipID2019582.get(i));
            System.out.println("Member_Name: " + membername2019582.get(i) + "\n");
        }
    }


    @Override
    public void savelist2019582() {

        try {
            FileWriter Writer9 = new FileWriter("My_Gym_System_2019582.txt");// this is used to write character oriented data to a file.
            BufferedWriter save9 = new BufferedWriter(Writer9);//this  is used to provide buffering for Writer instances.
            for (int i = 0; i < memberlist2019582.size(); i++) {
                save9.write("Member_Name   :"+memberlist2019582.get(i).getmembername9() + "\n");
                save9.write("Member_ID     :"+memberlist2019582.get(i).getmembershipID9()+"\n");
                save9.write("Member_DATE   :"+memberlist2019582.get(i).getmembershipdate9()+"\n"+"\n");

                save9.newLine();
            }
            save9.close();
            System.out.println(" Your_Data_Saved");
        }
        catch (Exception e) {
            System.out.println("Please_Enter_A_Valid_Input");
        }
    }
    public static List<List<String>> memberlist2019582() {
        List<String> listForID2019582 = new ArrayList<>();
        List<String> listForname2019582 = new ArrayList<>();
        List<String> listForgender2019582 = new ArrayList<>();
        List<String> listForweight2019582 = new ArrayList<>();
        List<String> listFordate2019582 = new ArrayList<>();

        List<String> listForschoolname2019582 = new ArrayList<>();

        List<String> listForage2019582 = new ArrayList<>();
        List<String> listFortype2019582 = new ArrayList<>();

        for (DefaultMember defaultMember : memberlist2019582){
            listForID2019582.add(defaultMember.getmembershipID9());
            listForname2019582.add(defaultMember.getmembername9());
            listForgender2019582.add(defaultMember.getmembergender9());
            listForweight2019582.add(String.valueOf(defaultMember.getmemberweight9()));
            listFordate2019582.add(defaultMember.getmembershipdate9().getDay()
                    + "/" + defaultMember.getmembershipdate9().getMonth() + "/" +
                    defaultMember.getmembershipdate9().getYear() );

            if (defaultMember instanceof StudentMember){
                listForschoolname2019582.add(((StudentMember) defaultMember).getschoolname9());

                listFortype2019582.add("Student");
            }
            else if (defaultMember instanceof Over60Member){
                listForage2019582.add(String.valueOf(((Over60Member) defaultMember).getmemberage9()));
                listFortype2019582.add("Over60");
            }
            else listFortype2019582.add("Default");
        }
        List<List<String>> defaultMemberlist2019582 = new ArrayList<>();
        defaultMemberlist2019582.add(listForID2019582);
        defaultMemberlist2019582.add(listForname2019582);
        defaultMemberlist2019582.add(listForgender2019582);
        defaultMemberlist2019582.add(listForweight2019582);
        defaultMemberlist2019582.add(listFordate2019582);

        defaultMemberlist2019582.add(listForschoolname2019582);

        defaultMemberlist2019582.add(listForage2019582);
        defaultMemberlist2019582.add(listFortype2019582);


        return defaultMemberlist2019582;
    }

    @Override
    public DefaultMember findmembershipID2019582(String membershipID2019582) {
        return null;
    }

    @Override
    public DefaultMember findmembername2019582(String membername2019582) {
        return null;
    }

    @Override
    public DefaultMember findmembershipdate2019582(Date membershipdate2019582) {
        return null;
    }
}
