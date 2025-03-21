DECLARE
    num NUMBER := &num;
    rev NUMBER := 0;
    temp NUMBER;
    digit NUMBER;
BEGIN
    temp := num;
    
    WHILE temp > 0 LOOP
        digit := MOD(temp, 10);
        rev := rev * 10 + digit;
        temp := TRUNC(temp / 10);
    END LOOP;
    
    IF num = rev THEN
        DBMS_OUTPUT.PUT_LINE(num || ' is a Palindrome');
    ELSE
        DBMS_OUTPUT.PUT_LINE(num || ' is NOT a Palindrome');
    END IF;
END;
/