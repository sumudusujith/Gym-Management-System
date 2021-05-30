package sample2019582;

import org.junit.jupiter.api.BeforeEach; //Import 20191013
import org.junit.jupiter.api.Test;//Import 20191013

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    private MyGymManager mygymmanager2019582;
    private DefaultMember defaultMember2019582;
    private StudentMember studentMember2019582;
    private Over60Member over60Member2019582 ;

    @BeforeEach
    void initEach() {
        mygymmanager2019582 = new MyGymManager();

        Date date = new Date(11,07,2020);

        defaultMember2019582 = new DefaultMember("1234","Sathuja","M",65,date);

        studentMember2019582 = new StudentMember("5002","sriyanka","M",65,"kck college",date);
        over60Member2019582 = new Over60Member("5003","sanidu","F",67,70,date);


    }

    @Test
    void testingAddingNewDefaultMember() {
        assertEquals("Sathuja", defaultMember2019582.getmembername9(), "Default Member:");

    }

    @Test
    void testingAddingNewStudentMember() {
        assertEquals("sriyanka", studentMember2019582.getmembername9(), "Student Member:");
    }

    @Test
    void testingAddingNewOver60Member() {
        assertEquals("sanidu", over60Member2019582.getmembername9(), "Over60 Member:");
    }

    @Test
    void deletingMember() {
        mygymmanager2019582.deletemember2019582(defaultMember2019582.getmembershipID9());
        assertEquals(0, mygymmanager2019582.membersCount, "Removed Member");
    }

    @Test
    void printingEmptyMemberList() {
        mygymmanager2019582.printmemberslist2019582();
        assertTrue(mygymmanager2019582.memberlist2019582.isEmpty(), "Printing list");
    }

    @Test
    void printingMembers() {
        mygymmanager2019582.addnewmember2019582(defaultMember2019582);
        mygymmanager2019582.addnewmember2019582(studentMember2019582);
        mygymmanager2019582.addnewmember2019582(over60Member2019582);
        mygymmanager2019582.printmemberslist2019582();
        assertFalse(mygymmanager2019582.memberlist2019582.isEmpty());
    }



    @Test
    void savingList() {
        mygymmanager2019582.addnewmember2019582(defaultMember2019582);
        mygymmanager2019582.addnewmember2019582(over60Member2019582);
        mygymmanager2019582.addnewmember2019582(studentMember2019582);
        mygymmanager2019582.savelist2019582();
    }


}