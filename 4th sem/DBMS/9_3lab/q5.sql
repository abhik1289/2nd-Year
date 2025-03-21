DECLARE
    num1 NUMBER := &num1;
    num2 NUMBER := &num2;
    op CHAR(1) := '&op';  
    result NUMBER;
BEGIN
    CASE op
        WHEN '+' THEN result := num1 + num2;
        WHEN '-' THEN result := num1 - num2;
        WHEN '*' THEN result := num1 * num2;
        WHEN '/' THEN 
            IF num2 = 0 THEN
                DBMS_OUTPUT.PUT_LINE('Error: Division by zero!');
                RETURN;
            ELSE
                result := num1 / num2;
            END IF;
        ELSE
            DBMS_OUTPUT.PUT_LINE('Invalid operator');
            RETURN;
    END CASE;
    
    DBMS_OUTPUT.PUT_LINE('Result: ' || result);
END;
/
