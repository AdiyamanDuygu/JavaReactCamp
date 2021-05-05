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
			System.out.println("Ge�erli bir insan bilgisi de�il");
		}
	}

	@Override
	public void update(Member member) {
		System.out.println(member.getFirstName() + " " + member.getLastName() + " g�ncellendi");
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getFirstName() + " " + member.getLastName() + " sistemden silindi");
		
	}

}
