package com.iu.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanMenu {

	
	
	
	public void select(){  // 숙제 
		
		ArrayList<HumanDTO> ar = new ArrayList<>();
		HumanService hs = new HumanService();
		HumanView hv = new HumanView();
		boolean check = true;

		Scanner sc = new Scanner(System.in);
		while(check) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1) 전체 출력");
			System.out.println("2) 정보 검색");
			System.out.println("3) 명단 추가");
			System.out.println("4) 명단 삭제");
			System.out.println("5) 종    료");
			int select = sc.nextInt();


			if(select == 1 ) {
				hv.view(ar);
			
					
				

			}else if(select == 2 ) {
				System.out.println("22222");
				HumanDTO humanDTO = hs.searchHuman(ar);
				hv.view(humanDTO);
				
				
			}else if(select == 3 ) {
				HumanDTO humanDTO = hs.addHuman();
				ar.add(humanDTO);
				System.out.println(ar);
				
			}else if(select ==4) {

				System.out.println("4444444");
			//	HumanDTO humanDTO = hs.removeHuman(ar);           //내꺼
			//	hv.check(humanDTO);                             //내꺼
			boolean flag =	hs.deleteHuman(ar);
				if(flag ) {
					System.out.println("성공");
				}else 
					System.out.println("실패");
			}else {
				System.out.println("Finish");
				check = false;//break;
			}
			
		}//while 끝

		sc.close();
	
}
}