`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04.09.2024 17:39:06
// Design Name: 
// Module Name: d_ff_tb
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


module d_ff_tb;
// Inputs
reg d;
reg rst_n;
reg clk;
// Outputs
wire q;
// Instantiate the D flip-flop module
d_ff uut (
.q(q),
.d(d),
.rst_n(rst_n),
.clk(clk)
);
// Clock generation
always #5 clk = ~clk;
// Testbench initialization
initial begin
// Initialize inputs
d = 0;
rst_n = 0;
clk = 0;
// Reset de-assertion after some time
#50 rst_n = 1;
// Apply input d changes
#10 d = 1;
#20 d = 0;
#30 d = 1;
// End simulation
#100 $finish;
end
endmodule
