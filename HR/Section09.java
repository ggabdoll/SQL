package HR;

public class Section09 {
	
	--Section 09

	--01��

	SELECT NVL(TO_CHAR(TRUNC( e.COMMISSION_PCT, 1)),'<Ŀ�̼� ����>') AS COMMISSION, count(*)
	FROM EMPLOYEES e 
	GROUP BY NVL(TO_CHAR(TRUNC( e.COMMISSION_PCT, 1)),'<Ŀ�̼� ����>')
	ORDER BY NVL(TO_CHAR(TRUNC( e.COMMISSION_PCT, 1)),'<Ŀ�̼� ����>') DESC;

	--02��

	SELECT *
	FROM 
	(SELECT d.DEPARTMENT_NAME �μ���, e.FIRST_NAME ������, e.SALARY �޿�, TO_CHAR(TRUNC( e.COMMISSION_PCT, 2)) Ŀ�̼�
	FROM EMPLOYEES e, DEPARTMENTS d 
	WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID
	ORDER BY e.COMMISSION_PCT DESC NULLS LAST, e.SALARY DESC)
	WHERE rownum <=4;

}