-- Package Spec
CREATE OR REPLACE PACKAGE math_pkg IS
    PROCEDURE show_message;
    FUNCTION cube_num(n NUMBER) RETURN NUMBER;
END math_pkg;
/

-- Package Body
CREATE OR REPLACE PACKAGE BODY math_pkg IS
    PROCEDURE show_message IS
    BEGIN
        DBMS_OUTPUT.PUT_LINE('Using Package Procedure');
    END;

    FUNCTION cube_num(n NUMBER) RETURN NUMBER IS
    BEGIN
        RETURN n * n * n;
    END;
END math_pkg;
/

-- Execution
BEGIN
    math_pkg.show_message;
    DBMS_OUTPUT.PUT_LINE('Cube of 3: ' || math_pkg.cube_num(3));
END;
/
