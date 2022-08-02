package com.varhere.yoon014;
/**
 * 웹 사이트와 URL 
 * 		웹 사이트는 정적 문서로 구성된 사이트 
 * 		URL 구성 
 * 			protocol://host:port/path/file
 * 			http://www.season.com:80/spring/april.html
 * 			http://www.season.com/spring/april.html
 * 			http://www.season.com
 * 		파라메터 
 * 			주소 뒤에 추가로 붙이는 데이터 
 * 			?를 사용하여 주소 경로와 구분 
 * 			http://www.season.com/spring/april.html?weather=sunny&temp=25
 * 
 * HTTP 메소드 (GET)
 * 		요청은 방식에 따라서 크게 GET/POST로 구분한다 
 * 		GET 요청 방식 
 * 			단순히 서버에게 자원(HTML, 이미지, 문서)을 URL을 통해 요청하는 방식 
 * 			필요한 데이터를 URL 뒤에 덧붙여서 전송한다 
 * 			데이터 크기 제약이 있으며 북마킹을 허용(지원)
 * 			브라우저 캐싱에 의한 보안 문제 야기 
 * 		POST 요청 방식 
 * 			주로 폼에서 사용되는 방식으로 웹 컨텐츠의 내용을 변경하기 위해 사용  
 * 			필요한 데이터를 HTTP요청의 메세지 바디를 통해 전송한다 
 * 			데이터의 양이 많거나 URL에 노출되지 말아야할 때 사용한다 
 * 
 * 웹 애플리케이션
 * 		웹 사이트 + Dynamic working service (CGI Processing)
 * 		CGI (Common Gatewqy Intertface)
 * 			웹 서버에 존재하는 프로그램을 호출할 수 있는 기술이다 
 * 			Perl, C 등 다양한 언어로 작성했다 
 * 			Process loading 방식이라서 요즘은 많이 안쓰인다 
 * 
 * 		ASP, NET, Servlet/JSP
 * 
 * 웹 컨테이너 
 * 		웹 컴포넌트(servlet/jsp 등) 실행 관리를 위한 프레임워크 
 * 		ex) 톰캣, 레진, Glassfish 등 
 * 		서블릿과 웹서버간의 커뮤니케이션 지원 
 * 		서블릿 라이프사이클 관리 		
 * 		요청에 대한 멀티 스레드 지원 
 * 		보안 및 오류에 대한 처리 지원 
 * 
 * Servlet 인터페이스와 서블릿 라이프사이클 
 * 		init()/service()/destroy()/getServletConfig()
 * 
 * 		1. 요청에 의해 톡정 서블릿 호출한다 
 * 		2. 해당 서블릿을 생성 및 로드한다 
 * 		3. override된 init() 메소드를 호출해준다 ( 최초 1회 호출 ) jdbc 프로펄티와 같은 초기화 작업 
 * 		4. service() 메소드를 호출한다 
 * 		5. destroy() 메소드를 호출한다 
 * 
 * 회원가입 폼 (add_user.html)
 * 		회원 아이디	:	userId
 * 		비밀번호		:	passwd
 * 		이름 			:	userName
 * 		주민번호		:	ssn (앞의 6자리만) 
 * 		이메일1		:	email1(아이디)
 * 		이메일2		:	email2(메일도메인 ex: naver.com, gamil.com...셀렉트박스)
 *		관심분야		:	concerns(체크박스 : 다중 선택가능, ex: Java, Servlet/JSP, EJB, Android, Spring
 *
 * 회원가입 서블릿(AddUserServlet.java)
 * 		회원이 등록한 정보를 받아 회원가입에서 입력한 정보를 출력 
 * 
 * 회원가입 폼 작성시, 스크립트나 css 사용가능 
 * 체크박스처럼 하나 이상의 값이 전달되는 경우 서블릿에서 파라메터 정보 받는 법 
 * 		Stirng[] concerns = request.getParameterValues("concerns");
 * add_user.do
 * 
 * JSP (Java Server Page)
 * 		사용자를 위한 동적 뷰를 제공한다
 * 		프레젠테이션 코드를 서블릿이 아닌 JSP를 통해 작성함으로써 코드 작성을 간소화 한다 
 * 		서블릿과 JSP를 상호보완적으로 사용함으로써 Mode12 아키텍처 기반의 애플리케이션을 작성한다 
 * 		웹 디자이너와 프로그래머의 역할 구분을 보다 증진시킨다 
 * 	
 * JSP 특징
 * 		기본적으로 JSP는 서블릿 인스턴스로 변환된다 
 * 		JSP페이지를 작성한 후 저장하면 컨테이너에 의해 (자바)소스로 변횐, 컴파일, 실행이 자동으로 이뤄진다
 * 			hello.jsp ---> hello.java ---> hello.class ---> 실행(서블릿) 
 * 					translation		compile			runtime
 * 		JSP는 서블릿보다 작성 과정이 간단하지만 디버깅은 상대적으로 어렵다 
 * 
 * JSP 라이프 사이클
 * 		기본적으로 서블릿과 동일 
 * 		jspInit()메소드	
 * 			초기화, 오버라이
 * 		jspDestroy()메소드
 * 			소멸, 해제, 오버라이딩 
 * 		_jspService()메소드
 * 			jsp페이지 자신, 오버라이딩 불가능 
 * 
 * JSP 파일 저장 위치 
 * 		JSP는 html과 동일 위치상에 저장 가능
 * 		WEB-INF의 하위 폴더에서도 저장 가능 
 * 
 * JSP 주요 태그 
 * 		주석		:	<%-- --%>
 * 		지시자	:	<%@page %>, <%@ include %>, <%@ taglib %> 첫줄에 사용한다 
 * 		(directive)
 * 		스크립팅	:	<%! 멤버 선언 %>, <% 자바 코드 %>, <%= 출력 %>
 * 		엘리먼트	
 * 		표현식	:	${표현식}
 * 		커스텀 태그:	JSTL
 * 
 * Page 지시자
 * 		import="java.util.*"
 * 		contentType="text/html; charset=UTF-8" MINE타입과 문자 인코딩 설정 
 * 		sesstion=true (디폴트값은 true)		   해당 페이지가 세선을 지원하려면 true
 * 		errorPage="에러를 처리할 페이지"
 * 		isErrorPage="true"	(디폴트값은 false)	   이 값이 true일 때 exception내장 객체를 사용가능 
 * 		pageEncoding						   JSP페이지의 무자 인코딩을 정의(ISO-8859-1)
 * 		isEltgnored, isThreadSafe, language, extends, buffer, autoFlush, info 
 * 		
 * 스크립틀릿
 * 		JSP페이지내에서 자바 코드를 사용할 수 있도록 한다 
 * 		주의할 점은 스크립틀릿 내의 자바코드와 HTML코드는 분리되어서 처리돠어야 한다 
 * 		스크립틀릿 코드의 남용은 코드에 대한 가독성을 떨어뜨리고 유지보수를 어렵게 한다 
 * 		<%
 * 			if(age > 10) {
 * 		%>
 * 				You need a ticket.
 * 		<%
 * 			}else {
 * 		%>
 * 				You are free.
 * 		<%
 * 			}
 * 		%>
 * 
 * 표현식		
 * 		Ten is <%= (2 * 5) %>
 * 		Thank you, <b> <%= name %> </b> for registration
 * 		The Current day and time is <%+ new java.util.Date() %>
 * 
 * MVC 패턴 
 * 		UI개발자와 비즈니스 기밸자와의 분업 개발 제공 
 * 		동시 사용자 증가에 따른 시스템 확장성 제공 
 * 		Low coupling, High cohesion 통한 시스템 유지 보수의 편리성 제공 
 * 		
 * 모델 2 아키텍쳐 
 * 		썬 마이크로시스템의 베스트 가이드 라인 
 * 		MVC패턴 구현을 위한 베스트 컴포넌트 
 * 			Model	:	(P)Java, Java Beans, EJB (S) DAO, DTO
 * 			View	:	HTML, JSP, XML	(S) Servlet
 * 			Controller: Servlet			(S) JSP
 * 
 * 컨트롤러의 주요 역할 
 * 		서블릿에 의해 구현될 컨트롤러는 다음과 같은 역할을 처리한다	
 * 			클라이언트의 요청 파라메터 정보를 구한다 겟파라메터 겟파라메터벨류 겟파라메터네임 
 * 			요청 파라메터에 대한 유효성 검증 및 데이터 변환 작업을 처리한다 
 * 			요청 처리에 필요한 비즈니스 오퍼레이션을 호출한다 
 * 			요청 처리 결과에 따라 클라이언트에게 보여줄 뷰를 선택한다 
 * 
 * 서블릿 커뮤니케이션	
 * 		서블릿은 다른 서블릿과의 커뮤니케이션이 일반 객체와 달리 제약적이다 
 * 			사용자가 서블릿 객체를 직접 생성하지 않는다 
 * 			기본적으로 특정 서비스를 위해 하나의 서블릿 인스턴스를 생성한다 
 * 		따라서 요청 처리를 다른 자원으로 위임할 수 있는 방법이 필요하다 
 * 
 * 속성 Scope와 RequestDispatcher
 * 		RequsetDispatcher인터페이스는 서블릿에서 다른 페이지로 포워드 할 수 있는 메소드를 제공한다 
 * 		속성 scope은 다른 서블릿(JSP)과 공유해야 할 데이터를 임시적으로 저장할 수 있는 기능을 제공한다 
 * 		request, session, application, page
 * 		request = 요청 -> 응답 
 * 		session scope = 한번 들어온게 나갈때까지 계속 유지 
 * 		application = 어플이 꺼질때까지 누가 들어오든 계속 유지 
 * 		page = 오직 JSP에서만 사용한다 JSP를 벗어나면 사라진다 this와 같은느낌 
 * 			setAttribute(String name, Object obj)
 * 			getAttribute(String name)
 * 
 * 			-- 서블릿 -- 
 * 			request.setAttribute("suerName", userName);
 * 			RequestDispatcher dispatcher = request.getRequertDispatcher("success.jsp");
 * 			dispatcher.forward(request, response);
 * 
 * 			
 * 			responese.sendRedirect("success.jsp"); // 주소변화, request scope 종료 
 * 			
 * 			-- JSP --
 * 			String userName = (String)request.getAttribute("userName");
 * 
 * 			<%@ page import="" session="" errorPage="" isErrorPage="" contentType="" pageEncoding="" %>
 * 
 * 자바빈즈(Java Beans)
 * 		Bean이란 재사용과 같은 어떤 목적을 가지고 지정된 규칙에 따라 만들어진 클래스 혹은 컴포넌트 
 * 		규약		
 * 			빈은 인자가 없는 생성자를 가져야 한다 
 * 			빈은 프로퍼티에 대한 네이밍 규칙을 준부해야 한다 (setter,getter를 가르키는 말이다 ) (setter,getter 를 합친게 프롬펄티이다 )
 * 			설정(setter) 메소드의 아규먼트와 접근(getter)메소드의 리턴 타입은 동일해야 한다 
 * 				public void setName(String name);
 * 				public String getName():
 * 				public void setFemale(boolean female);
 * 				public boolean isFemale();
 * 			빈의 연속성을 위해 Serializable 또는 Externalizable 인터페이스를 구현할 수 있다 
 * 			캡슐화를 유지한다 
 * 			
 * JSP 표준 액션 
 * 		JSP는 다양한 표준 액션 태그를 제공한다 
 * 		빈 관련 JSP 표준 액션 태그		
 * 			자바 빈즈를 JSP페이지에서 좀 더 쉽게 사용할 수 있도록 제공된 태그 
 * 			<jsp:useBean>, <jsp:setProperty>, <jsp:getProperty>, <jsp:include>, <jsp:forward>, <jsp:param>
 * 			<jsp:userBean id="user"
 * 						  class="com.varxyz.jv300.domain.User"
 * 						  scope="request"/>
 * 			id	  : 빈의 속성명, 구분자 
 * 			class : 해당 빈에 대한 완전한 클래스명 ( 추상클래스는 불가 )
 * 			scope : [page(default) | request | session | application]
 * 			type  : 빈 참조 타입 ( 폴리모피즘 적용시 부모타입 명시 )
 * 
 * 			<jsp:userBean id="emp"
 * 						  class="com.varxyz.jv300.domain.Manager"
 * 						  scope="request"
 * 						  type="com.varxuz.jv400.domain.Emplotee"/>
 * 
 * 			<jsp:setProperty name="user" property="userId"/>
 * 				name= "자바 빈이름(<jsp:useBean>의 id 속성과 동일명)"
 * 				property= "빈의 set프로퍼티명"
 * 
 * 			case 1)
 * 				<jsp:userBean id="user"
 * 						  class="com.varxyz.jv300.domain.User"
 * 						  scope="request"/>
 * 					<jsp:setProperty name="user" property="userId"/>
 * 			
 * 			case 2) 신규로 생성될 때만 몸체 처리 
 * 				<jsp:userBean id="user"
 * 						  class="com.varxyz.jv300.domain.User"
 * 						  scope="request">
 * 					<jsp:setProperty name="user" property="userId"/>
 * 				</jsp:userBean>
 * 
 * 			<%
 * 				user.setuserId(request.getParamerter("userId"));
 * 			%>
 * 
 * 			<jsp:setProperty name="user" property="userId" 
 * 				value="<%request.getParameter("userId") %>"/>
 * 			
 * 			<jsp:setProperty name="user" property="userId" param="userId"/>
 * 			이 때 주의할 것은 param과 value의 경우 빈타입이 String 또는 Primitive타입 
 * 
 * 			<jsp:setProperty name="user" property="*"/>
 * 
 * 		<jsp:getProperty>태그 
 * 			빈이 가지고 있는 프로퍼티 값을 JSP페이지에 출력할 때 사용 
 * 			<jsp:getProperty name="user" property="userId"/>
 * 
 * 		<jsp:include> 태그 
 * 			현재 JSP페이지내에서 지정된 제이지를 포함시킨다.
 * 			<jsp:include page="/incl/banner.jsp" />
 * 			cf) <%@ include file="..." %>
 * 
 * 		<jsp:include>				<%@ include>
 * 		실행시점에서 페이지에 포함			변환시점에 페이지에 포함 
 * 		수정시 자동 업데이트 제공 			수정시 자동 업데이트가 안됨 
 * 		정적컨텐츠, JSP, CGI포함가능 		정적컨텐츠, JSP만 가
 * 		표현식을 통해 page속성지정 가능	표현식을 통한 page속성 지정 불가능 
 * 		매개변수 추가 가능 
 * 
 * 		<jsp:param>
 * 		
 * 		-mypage1.jsp-
 * 		<jsp:include page="header.jsp" />
 * 			<jsp:param name="subtitle" value="Welcome to varxyz"/>
 * 		</jsp:include>
 * 
 * 		-header.jsp-
 * 		<img src="">${param.subtitle}
 * 
 * El (Expression Language)
 * 		Since JSP2.0 스펙에서 EL추가 
 * 		EL은 크게 두가지 형태로 사용 
 * 			커스텀 태그나 액션 태그의 속성값으로 사용 
 * 			JSP페이지내에서 텍스트 출력시 사용 
 * 		Syntax : ${addr.city}, ${user.userId}
 * 
 * 		JSP액션태그에서 
 * 			<jsp:include page="/user/${user.id}/details.jsp"/> -> /user/java/deatils.jsp
 * 		HTML 출력시 
 * 			<h3>Welcome! ${suer.userName} 님 </h3> -> <h3> Welcome 유비님 </h3>
 * 		커스텀 태그 속성값으로 
 * 			<c:set var="name" value="${user.userName}" />
 * 
 * 		${left.right}
 * 			left : El 내장객체, 자바 빈, Map 중의 하나 
 * 			right : 빈의 경우 프로퍼티, Map의 경우 key
 * 
 * 		${user.userId}
 * 		${requestScope.user.userId} // requestScope은 EL내장객체 
 * 		${user["userId"]}
 * 		// 맵
 * 		${nationMap.kr}=${nationMap["kr"]}
 * 		${header.host} = ${header["host"]}
 * 		// 배열 	
 *		${nations[0]} = ${nation["0"]}
 *		// List 처리 
 *		-> Servlet
 *			List<String> hobbies = new ArrayList<String>();
 *			hobbies.add("travel");
 * 			hobbies.add("drive");
 * 
 * 			Map<String, String> teachers = new HashMap<String, String>():
 * 			teachers.put("java", "유비");
 * 
 * 			request.setAttribute("hobbies", hobbies);
 * 			request.setAttribute("teachers", teachers);
 * 			
 * 		-> JSP
 * 			Your first hobby is ${hobbies[0]}
 * 			Your Java teacher is ${teachers["java"]}
 * 
 * EL 내장 객체 
 * 		pageScope / requestScope / sessionScope / applicationScope
 * 		param ex) ${param.userName} 
 * 		paramValues ex) ${paramValues.fruit[0]}
 * 		header / headerValues
 * 		cookie ex) ${cookie.userName.value}
 * 				-> if{cookie[i].getName().eauals("userName")){
 * 						out.pringln(cookie[i].getValue());
 * 					}
 * 		initParam
 * 		pageContext ex) ${pageContext.request.method} =${requestScope.method}
 * 
 * EL 연산 
 * 		${ 1 + 2 * 4 } -> 9
 * 		${ "1" + 10 } -> 11
 * 		${ null + 1 } -> 1
 * 		${ 3 div 4 } -> 0.75
 * 		${ 3 / 2 } -> 1.5
 * 		${ 32 % 10 } -> 2
 * 		==, eq 
 * 		!=, ne
 * 		${empty someVar}
 * 		 someVar 빈 객체인지 여부를 검사한다 
 * 		 true : null, "", 길이=0, 배열이 비어있을떄 
 * 
 * 		null값에 대한 EL처리 방법 
 * 			속성/프로퍼티가 존재하지 않을 경우 에러 대신 그 부분에 어떤 내용도 출력하지 않는다 
 * 			산수연산에서 null값은 0으로 처리한다 
 * 			논리연산에서 null값은 false로 처리한다 
 * 			가급적 에러를 안낼려고 이런다 
 * 
 * 		EL2.2부터 객체의 메소드를 호출할 수 있다	
 * 			${x.doSomething()} -> JSP 2.1이전버전에서는 컴파일에러 
 * 	
 * 			<%
 * 				Calculator calc = new Calculator();
 * 				request.setAttribute("calc", calc);
 * 			%>
 * 
 * 			${calc.setAdd(1, 3)
 * 			${calc.getAdd()}
 * 
 * JSTL과 커스텀 태그 
 * 		JSTL은 표존 태그 라이브러리(Standard Tag Libary)로서 커스텀 태그 중에서 
 * 		많이 사용하는 것들을 모아 JSTL 규약을 만들었다 
 * 		
 * 		JSTL을 사용함으로써 스크립트 코드를 사용할 떄보다 간결하고 이애하기 쉬운	
 * 		JSP코드를 작성ㅇ할 수 있다 
 * 
 * 		커스텀 태그는 사용자가 직접 개발한 사용자 정의 태그로서 특정 업무나 기능을 
 * 		가진 태그를 개발자가 직접 커스터마이징 할 수 있다 
 * 
 * 특징 
 * 		JSP에서 자바코드를 제거할 수 있다 
 * 		커스텀 태그는 재사용이 가능하다 
 * 		코드에 대한 가독성과 유지보수가 쉽다
 * 		XML기반의 태그 형식 
 * 		다양한 커스텀 태그 라이브러리를 제공한다 
 * 	
 * JSTL 태그의 종류 
 * 		코어라이브러리 : 변수지원, 흐름제어, URL처리 ( 접두어 : c )
 * 		XML라이브러리 : XML 제어, 변환 ( 접두어 : x )
 * 		국제화라이브러리: 지역, 메세지, 숫자, 날짜 형식 ( 접두어 : fmt )
 * 		데이터베이스 라이브러리 : SQL ( 접두어 : sql )
 * 		함수 라이브러리 : 컬레션, String 처리 ( 접두어 : fn )
 * 
 * JSTL 코어 라이브러리 
 * 		set/ if / forEach / url / out
 * 
 * set 태그 
 * 		EL변수의 값이나 EL변수의 프로퍼티 값을 지정할 때 사용 
 * 		<c:set var="pageTitle">회원가입 
 * 		
 * 		<html>
 * 			<head><title>${pageTitle}</title></head>
 * 			...
 * 		</html>
 * 
 * if 태그 
 * 		자바의 if블록고 ㅏ유사한 기능을 제공한다 
 * 		<c:if test="조건식"> 조건이 참일 경우 실행코드 </c:if>
 * 		<c:if test="${not empty errorMsgs}">에러처리를 여기서 </c:if>
 * 
 * forEach 태그 
 * 		배열, 컬렉션, 맵의 데이터를 순차적으로 처리할 때 사용한다 
 * 		<c:forEach var="message" items="${errorMsgs}">
 * 			<li>${message}</li>
 * 		</c:forEach>
 *		
 *		<c:forEach var="num" begin="1" end="10">
 *			${nul} -> 1부터 1-까지 값 출력 
 *		</c:forEach>
 *
 *url 태그 
 *		컨텍스트 경로를 포함한 URL을 생성해 준다 
 *		value 속성은 절대경로/상대경로로 모두 가능 
 *		<form action='<c:url value="add_user.do"/>' method="post">
 *
 *out 태그 
 *		데이터를 출력할 때 사용되는 태그로서 특수문자를 변경할 수 있는 기능을 제공한다 
 *		<c:out value="${param.eamil}" default="no email provided" secapeXml="true" />
 *		<c:out  ...> 출력내용 </c:out>
 *
 *세션 관리 (Session Management)
 *		HTTP프로토콜은 stateless 프로토콜 
 *		특정 사용자에 대한 상태 정보를 저장해야 할 경우 문제 대두 
 *		세션이란 여러 HTTP요청들 간에 특정 클라이언트 정보를 저장 유지하는 매커니즘이다 
 *		웹 컨테이너 벤더는 세션 유지와 관련된 지원을 반드시 제공해야한다 html hidden form 사용?으로 조금 충당가능 -> 쿠키로 넘어옴 
 *		
 *세션 (Session)
 *		세션 정보(객체)는 요청 객체로부터 획득 가능		
 *			ex : HTTPSession = request.getSession();
 *		세션 객체는 여러 개의 특정 정보를 저장, 검색할 수 있는 메소드를 제공한다 
 *			ex : sessio.setAttribute("MyCart", cart);
 *
 *Session 생성
 *		HTTPSession getSession();
 *		HTTPSession getSEssion(boolean flag); 회원 비회원 구분할때 쓰인다 
 *
 *Session 제거 
 *		void invalidate(); -> 주로 로그아웃때 호출한다      //서블릿에서 사용한다 	
 *		
 *		<session-config>							  // Web.xml에서 사용한다 
 *			<session-timeout>30</session-timeout>
 *		</session-config>
 *
 *쿠키(Cookie)란?
 *		쿠키는 세션을 지원하기 위한 고안된 것으로 일종의 문자 데이터
 *		요청에 대한 응답 과정에서 클라이언트 장치(ex:브라우저)에 저장할 수 있는 정보 
 *		클라이언트의 브라우저 종료시 쿠키정보는 기본적으로 삭제된다 
 *		서버와 클라이언트는 요청-응답 과정에서 쿠키(이름/값)를 교환한다  
 *		쿠키이름은 아스키 코드의 알파벳과 숫자만을 포함한다 
 *		콤마, 세미콜론, 공백은 포함할 수 없다 
 *		$로 시작할 수 없다 
 *		setMaxAge(60 * 30)
 *		URLencoder.encode("서울","UTF-8");
 *
 *		1.프로젝트 명	
 *		2.그룹ID
 *		3.프로젝트ID
 *		4.[Essential] usecases	
 *		5.[High value] usecases	있어야하고 여기까지 수행하겠다 
 *		6.[Follow] usecases	시간이 있어서 할 수 있으면 하고 못한다면 넘겨두겠다 하지만 일단 정해두겠다 
 *		7.Usecase별 담당자 해당 usecase를 누가 담당할것인지 usecase하나를 던지고 디비까지 한번에 우리나라 이렇게 많이한다
 * 		책임자를 빨리 찾을수있어서 각 레이어별로 나눌수도있음 팀원마다 상황이 다르니 팀장이 결정하지만 쌤의 의견으로는 다같이 해보면 좋겠다 
 * 		의욕과 프로젝트의 결과를 혼동하지말고 자기때문에 딜레이되거나 그런 피해를 주지말자 맡은거 용기내서 하겠다하면 사생결단해라 
 *		8.이슈 
 *
 *
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author here
 *
 */

public class Memo {
	
}
