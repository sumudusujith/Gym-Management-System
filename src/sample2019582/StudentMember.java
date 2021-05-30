package sample2019582;

public class StudentMember extends DefaultMember{

    private String schoolName2019582;



    public StudentMember(String membershipID2019582, String membername2019582, String membergender2019582, float memberweight2019582,
                         String schoolName2019582, Date membershipdate2019582) {
        super( membershipID2019582,  membername2019582, membergender2019582, memberweight2019582, membershipdate2019582);
        this.schoolName2019582 = schoolName2019582;

    }

    public String getschoolname9() {
        return schoolName2019582;
    }

    public void setschoolname9(String schoolName2019582) {
         this.schoolName2019582 = schoolName2019582;

    }




}
