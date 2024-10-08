`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04.09.2024 17:17:11
// Design Name: 
// Module Name: jk
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

//DESIGN CODE OF JK FLIP-FLOP:
module jk_ff(
output reg q,
output reg qb,
input j,
input k,
input clk
);
always @(posedge clk) begin
if (j == 0 && k == 0)
begin
q <= q;
qb <= ~qb;
end
else if (j == 0 && k == 1)
begin
q <= 0;
qb <= 1;
end
else if (j == 1 && k == 0)
begin
q <= 1;
qb <= 0;
end
else if (j == 1 && k == 1)
begin
q <= ~q;
qb <= qb;
end
end
endmodule