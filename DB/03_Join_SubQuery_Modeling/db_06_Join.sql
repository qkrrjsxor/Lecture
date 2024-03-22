USE `ssafy_corporation`;

# Q1. 카타시안 곱 

SELECT empno, ename, job
	FROM emp;
    
SELECT deptno, dname
	FROM dept;
    
SELECT empno, ename, job, dept.deptno, emp.deptno, dname
FROM emp, dept;

-- WHERE 사용하여 유의미한 데이터 뽑기
SELECT empno, ename, job, emp.deptno, dname
FROM emp, dept
WHERE emp.deptno = dept.deptno; 

# Q2. 사번 7788인 사원의 이름, 업무, 부서번호, 부서이름 조회

-- 우선 7788번 사원의 이름, 직책, 부서번호 먼저 조회해보자
SELECT ename, job, deptno
FROM emp
WHERE empno = 7788;

-- 7788번 사원의 부서번호가 20번이었으므로 dept table에서 20번의 부서이름 조회해보자
SELECT dname 
FROM dept
WHERE deptno = 20;

-- 조인을 이용하여 작성
SELECT ename, job, emp.deptno, dname
	FROM emp, dept
	WHERE 
		emp.deptno = dept.deptno
	 	AND empno=7788;


-- INNER JOIN 키워드 사용해보자.
SELECT ename, job, emp.deptno, dname
	FROM emp
    INNER JOIN dept
		ON emp.deptno = dept.deptno
	WHERE empno = 7788;


-- USING 사용
SELECT ename, job, deptno, dname
	FROM emp
	INNER JOIN dept
    USING (deptno)
    WHERE empno = 7788;
    
-- EMP 테이블에 데이터 추가
INSERT INTO emp
VALUES (7777, "양싸피", "MANAGER", 7839, "2024-03-21", 5000, NULL, NULL);

-- 동등조인으로 이름, 부서번호, 부서 이름 조회하기
SELECT e.ename, e.deptno,  d.dname
FROM emp AS e, dept AS d
WHERE e.deptno = d.deptno;


# Q3. OUTER JOIN 사용하기
-- LEFT OUTER JOIN
SELECT e.ename, e.deptno, d.dname
FROM emp e
LEFT OUTER JOIN dept d
ON e.deptno = d.deptno;
-- LEFT OUTER JOIN은 : emp 테이블을 왼쪽에 냅둔 채로 dept 테이블을 추가로 붙이는 느낌?
-- -> 양싸피는 emp 테이블에 있지만 deptno가 없다, 따라서 emp테이블 쫙 표시하고 dname은 null로

-- RIGHT OUTER JOIN
SELECT e.ename, d.deptno, d.dname
FROM emp e
RIGHT OUTER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.ename, d.deptno, d.dname
FROM dept d
LEFT OUTER JOIN emp e
ON e.deptno = d.deptno;
-- 이것도 위의 것과 똑같다. 순서만 바꾸고 기준을 LEFT 로,
-- 사실 이것처럼 LEFT를 기준으로 고정하고 테이블 순서만 바꾸는 걸 권장?!

# Q4. SELF JOIN 사용하기
-- 모든 사원번호, 이름, 매니저 번호, 매니저 이름 
SELECT e1.empno, e1.ename, e1.mgr, e2.ename AS 'manager name'
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;

-- INNER JOIN으로도 셀프 조인 가능
SELECT e1.empno, e1.ename, e1.mgr, e2.ename AS 'manager name'
FROM emp e1
INNER JOIN emp e2
	ON e1.mgr = e2.empno;

-- 위에 처럼 하면 KING 직원이 안나온다(MANAGER가 없어서 )
-- LEFT JOIN 으로 하면 된다
SELECT e1.empno, e1.ename, e1.mgr, e2.ename AS 'manager name'
FROM emp e1
LEFT OUTER JOIN emp e2
	ON e1.mgr = e2.empno; 

# Q5. 비 동등 조인 (Non-Equi JOIN)
-- 모든 사원의 사번, 이름, 급여, 급여등급을 조회
SELECT e.empno, e.ename, e.sal, sg.grade
FROM emp e, salgrade sg
WHERE e.sal >= sg.LOSAL AND e.sal <= sg.HISAL
ORDER BY sg.grade DESC;