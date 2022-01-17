package com.iu.s1.human;

import java.util.List;

public class HumanView {
	//문자열을 받아서 출력하는 메서드
	
	
	//한사람의 정보를 출력하는 메서드
	
	public void check (HumanDTO humanDTO) {
		if(humanDTO !=null) {
		System.out.println("삭제 성공");
		
		}else System.out.println("삭제 실패");
		
		
	}
	
	public void view (HumanDTO humanDTO) {
	
		if (humanDTO !=null) {
		System.out.println(humanDTO.getNick());	
		System.out.println(humanDTO.getNick());	
		System.out.println(humanDTO.getEmail());	
		System.out.println(humanDTO.getPhone());	
		System.out.println(humanDTO.getBirth());	
	
	
		}else 
			System.out.println("정보가 없습니다.");
	
	}
	public void view (List<HumanDTO> ar) {
		
		for(int i = 0;i<ar.size();i++) {
			HumanDTO humanDTO =ar.get(i);
			
			System.out.println(humanDTO.getName());	
			System.out.println(humanDTO.getNick());	
			System.out.println(humanDTO.getEmail());	
			System.out.println(humanDTO.getPhone());	
			System.out.println(humanDTO.getBirth());	
		//2000년 12월 24일 (수)
		
		
		
	}
}
}