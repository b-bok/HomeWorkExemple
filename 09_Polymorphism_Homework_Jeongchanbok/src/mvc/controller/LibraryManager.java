package mvc.controller;

import mvc.model.vo.*;

public class LibraryManager {
	
	private Member mem = null;
	private Book[] bList =  new Book[5];
	
	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		}
	
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	
	public Member myinfo() {
		
		// 회원 레퍼런스(mem) 주소 값 리턴
		return mem;
	}
	
	public Book[] selectAll() {
		
		// 도서 목록 레퍼런스(bList) 주소 값 리턴
		return bList;
	}

	public Book[] searchBook(String keyword) {
		
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
		
		Book[] searchList = new Book[5];
		
		int count = 0;
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		for(int i = 0; i<searchList.length;i++) {
			// 전달받은 keyword를 포함하고 있으면  HINT : String 클래스의 contains() 참고
			if(bList[i].getTitle().contains(keyword)) {
				// 검색결과의 도서목록에 담기  HINT : count 이용
	
				searchList[count++] = bList[i];
				
				/*
				count = i;
				카운트에  i 값을 담아준다!
				
				아래와 같은 방식은 차곡차곡 정보를 담아주지 못한다.
				예를 들어 키워드 검색에 루피의 원피스를 입력했을 경우,
				찾는 키워드가 bList[2]에 있고 searchList[2]에 저장 되기 때문이다. 
				searchList[0]부터 차례대로 담기지 않고, null 값이 담기다가
				searchList[2]에만 bList[2]가 담긴다!
				즉, searchList를 모두 출력했을 때 {null,null,bList[2]의 값, null, null,null}
				이렇게 담긴다!
				
				searchList[count++] = bList[i]; 이렇게 입력해야!
				searchList[0]부터 검색한 키워드가 있을 경우 차곡 차곡 담긴다!
				
				
				if(bList[i] instanceof AniBook) {
					searchList[count] = new AniBook(bList[count].getTitle(), bList[count].getAuthor(), bList[count].getPublisher(), ((AniBook)bList[count]).getAccessAge());
				}
				
				if(bList[i] instanceof CookBook) {
					searchList[count] = new CookBook(bList[count].getTitle(), bList[count].getAuthor(), bList[count].getPublisher(), ((CookBook)bList[count]).isCoupon());
				}
				
	
				
				*/
			}
		}

		// 해당 검색결과의 도서목록 주소 값 리턴
		return searchList;
	}
	
	
	public int rentBook(int index) {
		int result = 0;
		
		int memAge = mem.getAge();
		int couponCount = mem.getCouponCount();
		
		// 전달 받은 index의 bList 객체가 실제 AniBook 객체를 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		if(bList[index] instanceof AniBook && ((AniBook)bList[index]).getAccessAge() > memAge) {
			// result를 1로 초기화  나이 제한으로 대여 불가하다는 의미
			result  = 1;
		}
		// 전달 받은 index의 bList 객체가 실제 CookBook 객체를 참조하고 있고
		// 해당 요리책의 쿠폰유무가 “true”일 경우
		else if(bList[index] instanceof CookBook && ((CookBook)bList[index]).isCoupon() == true) {
			// 회원의 couponCount 1 증가 처리 후
			couponCount += 1;
			mem.setCouponCount(couponCount);
			// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰이 발급됐다는 의미
			result = 2;
		}
		
		
		// result 값 리턴
		return result;
		

	}
}
