#include<iostream>
using namespace std;
struct student
{ char name[20]; 
  string phone,email; 
  float subject1,subject2,subject3,subject4,subject5,subject6;
};
float average(struct student s[], int here[])
{ float totalmarks[10]={0}; float avg[10]={0}; float avgclass=0; int i;
  for(i=0; i<=9; i++)
  {totalmarks[i]=s[i].subject1+s[i].subject2+s[i].subject3+s[i].subject4+s[i].subject5+s[i].subject6;}
  for(i=0; i<=9; i++)
  {cout<<"total marks obtained by student no. "<<here[i]<<" are "<<totalmarks[i]<<endl;}
  for(i=0; i<=9; i++)
  {avg[i]=totalmarks[i]/6;}
  for(i=0; i<=9; i++)
  {cout<<"avg marks obtained by student no. "<<here[i]<<avg[i]<<endl;}
  for(i=0; i<=9; i++)
  {avgclass=avgclass+avg[i];}
  avgclass=avgclass/10;
  return avgclass;
}
int main()
{ int i,b=1; student s[10]={0}; int here[10]={0}; float water;
  for(i=0; i<=9; i++)
  {here[i]=b++;}
  for(i=0; i<=9; i++)
  {cout<<"enter name of student no. "<<here[i]<<endl;
  cin.ignore();
  cin.getline(s[i].name,20);
  cout<<"enter phone number of student no. "<<here[i]<<endl;
  getline(cin,s[i].phone);
  cout<<"enter email of student no. "<<here[i]<<endl;
  getline(cin,s[i].email);
  cout<<"enter marks obtained in subject1 by student no. "<<here[i]<<endl;
  cin>>s[i].subject1;
  cout<<"enter marks obtained in subject2 by student no. "<<here[i]<<endl;
  cin>>s[i].subject2;
  cout<<"enter marks obtained in subject3 by student no. "<<here[i]<<endl;
  cin>>s[i].subject3;
  cout<<"enter marks obtained in subject4 by student no. "<<here[i]<<endl;
  cin>>s[i].subject4;
  cout<<"enter marks obtained in subject5 by student no. "<<here[i]<<endl;
  cin>>s[i].subject5;
  cout<<"enter marks obtained in subject6 by student no. "<<here[i]<<endl;
  cin>>s[i].subject6;}
  water=average(s,here);
  cout<<"avg of whole class is :"<<water<<endl;
}