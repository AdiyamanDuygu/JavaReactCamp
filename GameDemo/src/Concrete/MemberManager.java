package Concrete;

import Abstract.MemberCheckService;
import Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService {

	MemberCheckService memberCheckService;
	
	
	public MemberManager(MemberCheckService memberCheckService) {
		this.memberCheckService = memberCheckService;
	}

	@Override
	public void add(Member member) {
		if(this.memberCheckService.checkIfRealPerson(member)) {
			System.out.println(member.getFirstName() + " " + member.getLastName() + " sisteme eklendi");
		}
		else {
			System.out.println("Geçerli bir insan bilgisi deðil");
		}
	}

	@Override
	public void update(Member member) {
		System.out.println(member.getFirstName() + " " + member.getLastName() + " güncellendi");
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getFirstName() + " " + member.getLastName() + " sistemden silindi");
		
	}

}
