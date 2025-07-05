DECLARE
    CURSOR emp_cursor IS
        SELECT first_name FROM employees;
    v_name employees.first_name%TYPE;
BEGIN
    OPEN emp_cursor;
    LOOP
        FETCH emp_cursor INTO v_name;
        EXIT WHEN emp_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Employee: ' || v_name);
    END LOOP;
    CLOSE emp_cursor;
END;
/
