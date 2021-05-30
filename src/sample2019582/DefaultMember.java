package sample2019582;


public class DefaultMember implements Comparable<DefaultMember> {
    private String membershipID2019582;
    private String membername2019582;
    private String membergender2019582;
    private float memberweight2019582;
    private Date membershipdate2019582;

    public DefaultMember(String membershipID2019582, String membername2019582, String membergender2019582, float memberweight2019582,
                         Date membershipdate2019582) {
        this.membershipID2019582 = membershipID2019582;
        this.membername2019582 = membername2019582;
        this.membergender2019582 = membergender2019582;
        this.memberweight2019582 = memberweight2019582;
        this.membershipdate2019582 = membershipdate2019582;

    }

    public String getmembershipID9() {
        return membershipID2019582;
    }

    public String getmembername9() {
        return membername2019582;
    }

    public String getmembergender9() {
        return membergender2019582;
    }

    public float getmemberweight9() {
        return memberweight2019582;
    }

    public Date getmembershipdate9() {
        return membershipdate2019582;
    }

    public void setmembershipID9(String membershipID2019582) {
        this.membershipID2019582 = membershipID2019582;
    }
    public void setmembername9(String membername2019582) {
        this.membername2019582 = membername2019582;
    }
    public void setmembergender9(String membergender2019582) {
        this.membergender2019582 = membergender2019582;
    }
    public void setmemberweight9(float memberweight2019582) {
        this.memberweight2019582 = memberweight2019582;
    }
    public void setmembershipdate9(Date membershipdate2019582) {
        this.membershipdate2019582 = membershipdate2019582;
    }


    @Override
    public int compareTo(DefaultMember o) {
        return this.getmembername9().compareTo(o.getmembername9());
    }


}


