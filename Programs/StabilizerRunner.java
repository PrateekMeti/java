class StabilizerRunner
{
public static void main(String[] args)
{
String Brand="VGuard";
String type="Main component";
int size=20;
String color="Black";
int price=5000;
String make="India";
String city="Mumbai";
int weight=4;
boolean highvoltagecutoff=true;
boolean mainsturnondelay=true;
String offer="50% offer via code apply";
boolean codeavailable=true;
int noib=7;
String manufacture="VGuard";
boolean Batteriesinculded=false;
//no const
new Stabilizer();
//cons with string,string,int
new Stabilizer(Brand,type,size);
//cons with String,int,string
new Stabilizer(color,price,make);
//cons with string,int,boolean
new Stabilizer(city,weight,highvoltagecutoff);
//cons with boolean,string,boolean
new Stabilizer(mainsturnondelay,offer,codeavailable);
//cons with int,string,boolean
new Stabilizer(noib,manufacture,Batteriesinculded);
}
}