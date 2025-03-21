DECLARE
    month_num NUMBER := &month_num;
    month_name VARCHAR2(20);
BEGIN
    CASE month_num
        WHEN 1 THEN month_name := 'January';
        WHEN 2 THEN month_name := 'February';
        WHEN 3 THEN month_name := 'March';
        WHEN 4 THEN month_name := 'April';
        WHEN 5 THEN month_name := 'May';
        WHEN 6 THEN month_name := 'June';
        WHEN 7 THEN month_name := 'July';
        WHEN 8 THEN month_name := 'August';
        WHEN 9 THEN month_name := 'September';
        WHEN 10 THEN month_name := 'October';
        WHEN 11 THEN month_name := 'November';
        WHEN 12 THEN month_name := 'December';
        ELSE
            DBMS_OUTPUT.PUT_LINE('Invalid month number');
            RETURN;
    END CASE;
    
    DBMS_OUTPUT.PUT_LINE('Month: ' || month_name);
END;
/