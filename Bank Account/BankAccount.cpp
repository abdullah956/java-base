#include<iostream>
using namespace std;
struct customer_account
{ string name; int accountnumber; float balance;
};
void show(string customername, int customeraccountnumber, float totalbalance)
{ cout<<"Name : "<<customername<<endl;
  cout<<"Account Number : "<<customeraccountnumber<<endl;
  cout<<"Balance : "<<totalbalance<<endl;
}
float transfer(int account2, float customerbalance, float transfer_amount)
{ float totalamount;
  customerbalance=customerbalance-transfer_amount;
  cout<<transfer_amount<<" is added in account number : "<<account2<<endl;
  return customerbalance;
}
float deposite(float customerbalance, float depositeamountt)
{ float transfer_amount, total1;
  int account2;
  customerbalance=customerbalance+depositeamountt;
  cout<<"enter the account number of account you want to transfer money\n";
  cin>>account2;
  cout<<"enter amount you want to transfer\n";
  cin>>transfer_amount;
  total1=transfer(account2,customerbalance,transfer_amount);
  return total1;
}
float withdraw(float customerbalance, float withdraw_amount)
{ float deposite_amount, total2;
  customerbalance=customerbalance-withdraw_amount;
  cout<<"enter the amount you want to deposite\n";
  cin>>deposite_amount;
  total2=deposite(customerbalance,deposite_amount);
  return total2;
}
int main()
{ customer_account customer;
  float totalbalance;
  float withdraw_amount;
  cout<<"enter you name\n";
  getline(cin,customer.name);
  cout<<"enter account number\n";
  cin>>customer.accountnumber;
  cout<<"enter you balance\n";
  cin>>customer.balance;
  cout<<"enter the amount you want to withdraw\n";
  cin>>withdraw_amount;
  totalbalance=withdraw(customer.balance,withdraw_amount);
  show(customer.name, customer.accountnumber,totalbalance);
}
