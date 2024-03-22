# Q1. ssafy DB를 생성해보자.
CREATE DATABASE ssafy;
CREATE DATABASE IF NOT EXISTS ssafy;

# Q2. DB 목록을 조회해보자.
SHOW DATABASES;

# Q3. ssafy DB를 사용해보자.
USE ssafy;
-- 위 명령어를 사용하지 않고 DB를 사용하는 방법은 ? -> 스키마 직접 더블클릭

# Q4. ssafy DB를 삭제해보자.
DROP DATABASE ssafy;
DROP DATABASE IF EXISTS ssafy;

# Q5. 문자집합 설정해보자.
ALTER DATABASE ssafy
DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci
