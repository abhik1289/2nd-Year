DECLARE
    a NUMBER ; 
    b NUMBER ;
    c NUMBER ;
    total_sum NUMBER;
BEGIN
    a := 10;
    b := 20;
    c := 30;

    
    total_sum := a + b + c;
    DBMS_OUTPUT.PUT_LINE('sum is:'|| total_sum);
END;
/