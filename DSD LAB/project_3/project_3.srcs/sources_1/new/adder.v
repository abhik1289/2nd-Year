`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 14.08.2024 17:17:44
// Design Name: 
// Module Name: adder
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


module adder(
    output sum,cout,
    input a,b,c
    );
    wire w1,w2,w3;
    xor X1(w1,a,b);
    and A1(w3,a,b);
    xor X2(sum,w1,c);
    and A2(w2,w1,c);
    or  O1(cout,w2,w3);
endmodule
