DECLARE
    v_message VARCHAR2(50);
BEGIN
    v_message := 'Hello from PL/SQL!';
    DBMS_OUTPUT.PUT_LINE(v_message);
END;
/
