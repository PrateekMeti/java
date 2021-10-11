class MonitorRunner
{
public static void main(String[] args)
{
String Brand="Dell";
String type="Main component";
int size=20;
String color="Black";
int price=10000;
String displaytype="UHD";
String make="India";
boolean powercablepresent=true;
boolean refurbished=true;
boolean onlineorder=true;
String offer="50% offer on HDFC credit card";
boolean codeavailable=true;
int noib=7;
String ctype="VGA";
boolean micpresent=false;
//no const
new Monitor();
//cons with string,string,int
new Monitor(Brand,type,size);
//cons with String,int,string
new Monitor(color,price,displaytype);
//cons with string,boolean,boolean
new Monitor(make,powercablepresent,refurbished);
//cons with boolean,string,boolean
new Monitor(onlineorder,offer,codeavailable);
//cons with int,string,boolean
new Monitor(noib,ctype,micpresent);
}
}