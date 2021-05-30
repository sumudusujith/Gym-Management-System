package sample2019582;

public class Over60Member extends DefaultMember {

    private int memberAge2019582;

    public Over60Member(String membershipID2019582, String membername2019582, String membergender2019582, float memberweight2019582,
                        int memberAge2019582, Date membershipdate2019582 ) {
        super( membershipID2019582,  membername2019582, membergender2019582, memberweight2019582, membershipdate2019582);
        this.memberAge2019582 = memberAge2019582;
    }

    public int getmemberage9() {
        return memberAge2019582;
    }

    public void setmemberage9(int memberAge2019582) {
        if (memberAge2019582 >= 60) this.memberAge2019582 = memberAge2019582;
        else throw new IllegalArgumentException("Please Enter a valid Age");
    }
}
