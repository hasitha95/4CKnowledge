package Test;

import java.util.ArrayList;

import org.junit.Test;

import com.sliit.datamodel.MemberDao;
import com.sliit.entities.Member;

public class MyTest {

	@Test
	public void canGetAllMembers() {
		MemberDao dao = new MemberDao();
		ArrayList<Member> members =(ArrayList<Member>) dao.getAllMembers();
		
		for(Member me: members) {
		System.out.println(me.getFname());
		}
		
	}
	
}
