DECLARE
    num NUMBER := -5;
BEGIN
    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Positive');
    ELSIF num < 0 THEN
        DBMS_OUTPUT.PUT_LINE('Negative');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Zero');
    END IF;
END;
/
