import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Caetano Veloso", Rank.CAPTAIN );
    }

    @Test
    public void rankTest(){
        assertEquals(Rank.CAPTAIN, cabinCrewMember1.getRank());
    }

    @Test
    public void announcementTest(){
        assertEquals("Would the passengers please return to their seats?", cabinCrewMember1.announcement());
    }

}
