#include <stdio.h>
#include <stdlib.h>

struct dob {
  int d,m,y;
};

struct student_info {

int roll_no;
char name[50];
float cgpa;
struct dob age;

};

void printByValue(struct student_info s){

printf("By value- roll %d,Name: %s,CGPA %.2f,DOB: %d-%d-%d\n",s.roll_no,s.name,s.cgpa,s.age.d,s.age.m,s.age.y);

};

void printByAddress(struct student_info *s){

printf("By Address - Roll %d,Name: %s,CGPA %.2f,DOB: %d-%d-%d\n",s->roll_no,s->name,s->cgpa,s->age.d,s->age.m,
s->age.y
);};

void main(){

struct student_info s1 ={23,"Abhik",8.7,{1,5,2005}};

printByValue(s1);
printByAddress(&s1);
// return 0;
}