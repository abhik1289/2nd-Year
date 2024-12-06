`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 28.08.2024 17:45:03
// Design Name: 
// Module Name: mux
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

module mux(
    input S0,S1,S2,
    input I0,I1,I2,I3,I4,I5,I6,I7,
    output F
    );
    
    wire w0,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10;
    not NOT1(w0,S0);
    not NOT2(w1,S1);
    not NOT3(w2,S2);
    and AND1(w3,I0,w2,w1,w0);
    and AND2(w4,I1,w2,w1,S0);
    and AND3(w5,I2,w2,S1,w0);
    and AND4(w6,I3,w2,S1,S0);
    and AND5(w7,I4,S2,w1,w0);
    and AND6(w8,I5,S2,w1,S0);
    and AND7(w9,I6,S2,S1,w0);
    and AND8(w10,I7,S2,S1,S0);
    or OR1(F,w3,w4,w5,w6,w7,w8,w9,w10);
    
endmodule