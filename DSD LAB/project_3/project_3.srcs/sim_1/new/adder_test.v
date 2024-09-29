`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 14.08.2024 17:32:53
// Design Name: 
// Module Name: adder_test
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


module adder_test();

   reg a,b,c;
   wire sum,cout;
    
    adder CKT(sum,cout,a,b,c);
    
    initial
    begin
    a=0;b=0;c=0; #10
    a=0;b=0;c=1; #10
    a=0;b=1;c=0; #10
    a=0;b=1;c=1; #10
    a=1;b=0;c=0; #10
    a=1;b=0;c=1; #10
    a=1;b=1;c=0; #10
    a=1;b=1;c=1; #10
    $finish;
    end
endmodule
