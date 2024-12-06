`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 21.08.2024 17:34:34
// Design Name: 
// Module Name: decoder_3_test
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


module decoder_3_test();
    reg a,b,c;
    wire d0,d1,d2,d3,d4,d5,d6,d7;
    
    exp_3 ckt(d0,d1,d2,d3,d4,d5,d6,d7,a,b,c);
    
    initial
    begin
    
    a=0;b=0;c=0;#10
    a=0;b=0;c=1;#10
    a=0;b=1;c=0;#10
    a=0;b=1;c=1;#10
    a=1;b=0;c=0;#10
    a=1;b=0;c=1;#10
    a=1;b=1;c=0;#10
    a=1;b=1;c=1;#10    
    $finish;
    end
    
endmodule
