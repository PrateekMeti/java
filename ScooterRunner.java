class ScooterRunner
{
public static void main(String[] args)
{
String Brand="BajajChetak";
String type="Electric";
int power=100;
String color="Black";
int price=30000;
String make="India";
String city="Chennai";
int weight=50;
boolean Selfstart=true;
boolean Headlight=true;
String offer="50% offer if registred on Diwali";
boolean Rechargeablebattery=true;
int nop=10;
String manufacture="Bajaj";
boolean GoodMilage=true;
//no const
new Scooter();
//cons with string,string,int
new Scooter(Brand,type,power);
//cons with String,int,string
new Scooter(color,price,make);
//cons with string,int,boolean
new Scooter(city,weight,Selfstart);
//cons with boolean,string,boolean
new Scooter(Headlight,offer,Rechargeablebattery);
//cons with int,string,boolean
new Scooter(nop,manufacture,GoodMilage);
}
}