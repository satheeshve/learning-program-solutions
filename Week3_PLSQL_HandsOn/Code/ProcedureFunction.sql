-- Procedure
CREATE OR REPLACE PROCEDURE greet_user(p_name IN VARCHAR2) IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Welcome, ' || p_name || '!');
END;
/

-- Function
CREATE OR REPLACE FUNCTION square_num(n IN NUMBER) RETURN NUMBER IS
BEGIN
    RETURN n * n;
END;
/

-- Execution Block
BEGIN
    greet_user('Satheesh');
    DBMS_OUTPUT.PUT_LINE('Square of 5: ' || square_num(5));
END;
/
