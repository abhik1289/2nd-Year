`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 07.08.2024 16:44:57
// Design Name: 
// Module Name: exp_01_test
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////


module exp_01_test();
    wire f;
    reg a,b,c;
    exp_01 ckt(a,b,c,f);
    initial
    begin
    a=0;b=0;c=0;
    #10
    a=0;b=0;c=1;
    #10
    a=0;b=1;c=0;
    #10
    a=0;b=1;c=1;
    #10
    a=1;b=0;c=0;
    #10
    a=1;b=0;c=1;
    #10
    a=1;b=1;c=0;
    #10
    a=1;b=1;c=1;
    #20
    $finish;
    end
endmodule
