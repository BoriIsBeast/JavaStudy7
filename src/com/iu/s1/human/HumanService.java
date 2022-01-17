package com.iu.s1.human;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class HumanService {
	private Scanner sc;

	public HumanService(){

		sc = new Scanner(System.in);

	}
	
	//이름을 입력받아서 같은 이름이 있는 HumanDTO의 인덱스 번호 찾기
	//찾아서 삭제
	//리턴 삭제여부 0:성공, 1:실패
	public boolean deleteHuman(List<HumanDTO> ar){//강사님꺼
		System.out.println("이름을 입력");
		String name = sc.next();
		
		boolean result = false;
		
		HumanDTO humanDTO = null;
		
		for(int i = 0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				humanDTO = ar.remove(i);
				result = true;
				break;
				
			}
			
		}
		return result;
	}//deleteHuman
	
	
	public HumanDTO removeHuman(List<HumanDTO> ar) {
		System.out.println("이름을 입력");
		String name = sc.next();
		HumanDTO humanDTO = null;

		for(int i = 0;i<ar.size();i++){
			if(name.equals(ar.get(i).getName())) {

				humanDTO = ar.remove(i);
				break;
				

			}
			

		}//for		
		return humanDTO;
	}
	

	public HumanDTO searchHuman(List<HumanDTO> ar) {
		System.out.println("이름을 입력");
		String name = sc.next();
		HumanDTO humanDTO = null;

		for(int i = 0;i<ar.size();i++){
			if(name.equals(ar.get(i).getName())) {

				humanDTO = ar.get(i);
				break;


			}//if

		}//for		
		return humanDTO;
	}















	//	public HumanDTO searchHuman(ArrayList<HumanDTO> ar) {
	//		//이름을 입력받아서 같은 이름이 있는 HumanDTO 찾아서 리턴
	//		//정보가 있으면 출력, 없으면 정보가 없음 출력
	//		
	////		HumanView hv = new HumanView();
	////
	////
	////		System.out.println("찾을 이름을 입력하세요");
	////		
	////		
	////		
	////		String id = sc.next();
	////		HumanDTO humanDTO = null;
	////
	////		for(int i = 0;i<ar.size();i++) {
	////			if(ar.get(i).getName().equals(id)) {
	////				hv.view(humanDTO);
	////
	////			}
	////
	//		}  
	//		return humanDTO;	
	//	}

	public ArrayList<HumanDTO> print() {

		ArrayList<HumanDTO> ar =new ArrayList<>();

		for(int i = 0;i<ar.size();i++) {
			HumanDTO humanDTO = new HumanDTO();

			System.out.println(ar.get(i).getName());	
			System.out.println(ar.get(i).getNick());	
			System.out.println(ar.get(i).getEmail());	
			System.out.println(ar.get(i).getPhone());	
			System.out.println(ar.get(i).getBirth());	

		}return ar;
	}
	public HumanDTO addHuman() {
		HumanDTO humanDTO = new HumanDTO();

		System.out.println("3) 명단 추가를 선택하셨습니다.");
		System.out.println("이름을 입력하세요.");
		humanDTO.setName(sc.next());
		System.out.println("별명을 입력하세요.");
		humanDTO.setNick(sc.next());
		System.out.println("이메일을 입력하세요.");
		humanDTO.setEmail(sc.next());
		System.out.println("전화번호를 입력하세요.");
		humanDTO.setPhone(sc.next());
		System.out.println("생일을 입력하세요.");
		
		String s =sc.next();// 20001224
		
		
		int year = Integer.parseInt(s.substring(0,4));
		int month = Integer.parseInt(s.substring(4,6));
		int date = Integer.parseInt(s.substring(6));
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, date, 0, 0, 0);
		
		humanDTO.setBirth(calendar);
		return humanDTO;

	}

}
