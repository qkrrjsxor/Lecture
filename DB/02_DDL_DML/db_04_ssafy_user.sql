# Q1. ssafydb 데이터 베이스 생성 및 사용
CREATE DATABASE IF NOT EXISTS ssafydb;
USE ssafydb;

# Q2. ssafy_user 테이블 생성
CREATE TABLE ssafy_user(
	-- 학번 (AUTO_INCREMENT : 자동 증가 
    user_num INT AUTO_INCREMENT PRIMARY KEY,
    -- ID
    user_id VARCHAR(20) NOT NULL,
    -- 이름
    user_name VARCHAR(20) NOT NULL,
    -- PW
    user_password VARCHAR(20) NOT NULL,
    -- E-mail
    user_email VARCHAR(30),
    -- 가입 날짜
    signup_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
            
);
-- 테이블 정보 확인
DESCRIBE ssafy_user;

# Q3. INSERT 쿼리를 사용해보자.
-- 모든 컬럼 입력
INSERT INTO ssafy_user 
VALUES (1, "AAAA", "MANA", "1234", "AAAA@gmail.com", now());

-- 원하는 컬럼만 입력
INSERT INTO ssafy_user (user_id, user_name, user_password)
VALUES ("BBB", "BMAN", "123123");

-- 여러 개의 데이터 한방에 넣기
INSERT INTO ssafy_user(user_id, user_name, user_password)
VALUES ("CCC", "CMAN", "CMAN@gmail.com"),
	("d", "dMAN", "dMAN@gmail.com"),
	("e", "eMAN", "eMAN@gmail.com"),
	("f", "fMAN", "fMAN@gmail.com");
SELECT * FROM ssafy_user;
        
# Q4. 데이터를 수정해보자

# Q5. 데이터를 삭제해보자


