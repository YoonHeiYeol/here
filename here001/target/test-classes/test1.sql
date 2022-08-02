DROP TABLE Sample10;
CREATE TABLE Customer (
	cid 		BIGINT 			PRIMARY KEY AUTO_INCREMENT,
	name 		VARCHAR(10)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, regDate)
VALUES ('이름 (name)', '문자열,최대 10자', '홍길동'),
('주민번호 (ssn)', '14자 고정', '801225-1234567'),
('가입일 (regDate)', '날짜정보', 'yyyy-MM-dd구조')

UPDATE Customer SET name='james Bond', ssn='900101-1234567' WHERE cid=1001;

CREATE TABLE Account (
	aid 				BIGINT 				PRIMARY AUTO_INCREMENT,
	accType				VARCHAR(1)			NOT NULL	DEFAULT 'S',
	balance				DOUBLE				NOT NULL	DEFAULT 0.0,
	interestRate		DOUBLE				NOT NULL	DEFAULT 0.0,
	overdraftAmount   	DOUBLE				NOT NULL	DEFAULT 0.0,
	customerId			VARCHAR(20)			NOT NULL,
	regDate				TIMESTAMP			NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;

INSERT INTO Account (accType, balance, interestRate, overdraftAmount, customerId, regDate)
VALUES ('개좌유형(accType)','하나의 문자, 기본값 s','s,c 등'),
('잔고(balance)','실수형 금액, 기본값 0.0',2000.0),
('이자율(interestRate)','실수형 비율액, 기본값 0.0',0.03),
('한도액(overdraftAmount)','실수형 금액,  기본값 0.0',2000.0),
('고객정보(customerId)','고객id이며 고객 테이블에 반드시 존재',''),
('개설일(refDate)','날짜정보','yyyy-MM-dd HH:mm:ss 구조');