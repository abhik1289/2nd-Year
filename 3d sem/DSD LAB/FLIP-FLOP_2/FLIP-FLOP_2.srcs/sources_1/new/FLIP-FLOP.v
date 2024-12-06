`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04.09.2024 17:33:58
// Design Name: 
// Module Name: FLIP-FLOP
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

//DESIGN CODE OF D FLIP-FLOP:
module d_ff(
output reg q,
input d,
input rst_n,
input clk
);
always @(posedge clk or negedge rst_n)
begin
if (!rst_n)
begin
q <= 0;
end
else
begin
q <= d;
end
end
endmodule
