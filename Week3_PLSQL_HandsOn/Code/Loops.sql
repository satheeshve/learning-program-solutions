BEGIN
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Value: ' || i);
    END LOOP;
END;
/
