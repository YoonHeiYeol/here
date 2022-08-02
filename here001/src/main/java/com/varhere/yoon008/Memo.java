//package com.varhere.yoon008;
//
//public class Memo {
//
//}

//implements 뒤에는 interface가 온다

//package com.varhere.yoon008;
//
//public class FlyerTest {
//	
//	public static void main(String[] args) {
//		Flyer f = new Airplane(); // Flyer f = new getFlyer();//		f.takeOff();
//	}
//}

//대학의 모든 도서정보는 하나의 도서관(저장소)에 보관 및 등록된다고 가정하자
//각 학과(학부)에서 구매한 책들은 모두 이 도서관 도서정보에 등록되어야 한다고 가정하자 
//책을 대출할 때 책의 고유번호(serial)를 통해 검색되어 대출된다고 가정하자
//도서관에서 책을 보관할 수 있는 정보의 최대치는 100권이며 초과시 자동으로 이전 저장소 
//크기의 2배로 증가된다고 가정하자
//
//	도서관 = Libray
//	책 = Book
//	책정보 등록 = addBook(Book book)
//	책 대출 = getBook(int serial)

//hint
//new Libray를 못하게해라 생성자에 private를 써라 하나뿐인 도서관에 static을 사용해보자 

//대학 도서관 도서 학부 

//java singleton을 알아보자 

//finally 보통 연결을 끊을때 사용한다 

//public void a() {
//	b();
//}
//
//public void b() {
//	c();
//}
//
//public void c() {
//	if() {
//		~
//	}else {
//		throw mew HardException;
//	}
//}
//
//c에 입력하면 a까지 전달 a에 전달된 오류 다시 내림 a가 던지고 b가 던지고 c가 catch한다.
//ex) 은행>중앙처리>atm 일때 돈을 찾으려 비번을 치는데 에러가 에러가 에이티엠에서 뜨면 atm에서 에러를 고치면 거기서 끝나는거기 때문에 다시 역순으로 위로 올라가서 다시 처리하며 내려오면서 돈을 찾을수있는것이다.
//check exception 이 에러를 잡아야한다.