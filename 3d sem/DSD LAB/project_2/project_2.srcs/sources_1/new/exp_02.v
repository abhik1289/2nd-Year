`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 14.08.2024 17:02:13
// Design Name: 
// Module Name: exp_02
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


module exp_02(
    input a,
    input b,
    input c,
    output o,f
    );
    wire w1,w2,w3;
    xor X1(w1,a,b);
    xor X2(o,w1,c);
    and X3(w1,a,b);
    and A2(w3,w1,c);
    nor N1(f,w3,w2);
endmodule
