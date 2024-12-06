`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 21.08.2024 17:16:44
// Design Name: 
// Module Name: exp_3
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


module exp_3(d0,d1,d2,d3,d4,d5,d6,d7,a,b,c);
    input a,b,c;
    output d0,d1,d2,d3,d4,d5,d6,d7;
    
    assign d0 = (~a)&(~b)&(~c);
    assign d1 = (~a)&(~b)&c;
    assign d2 = (~a)&b&(~c);
    assign d3 = (~a)&b&c;
    assign d4 = a&(~b)&(~c);
    assign d5 = a&(~b)&c;
    assign d6 = a&b&(~c);
    assign d7 = a&b&c;
    
    
endmodule
