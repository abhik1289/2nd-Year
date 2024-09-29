`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 07.08.2024 16:22:52
// Design Name: 
// Module Name: exp_01
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


module exp_01(
    input a,
    input b,
    input c,
    output f
    );
    
    wire w1,w2,w3;
    nand n1(w1,a,a);
    nand n2(w2,b,a);
    nand n3(w3,w1,c);
    nand n4(f,w2,w3);
endmodule
