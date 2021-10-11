class Scooter
{
String Brand="tvsjupiter";
String type="Petrol";
int power=50;
String color="Black";
int price=15000;
String make="India";
String city="Goa";
int weight=35;
boolean Selfstart=false;
boolean Headlight=true;
String offer="50% offer if registred on Deepavali";
boolean Rechargeablebattery=true;
int nop=5;
String manufacture="Tvs";
boolean GoodMilage=true;
Scooter()
{
System.out.println("No Argument constructor");
}
Scooter(String Brand,String type,int power)
{
System.out.println("\nConstructor with one string,string and int");
this.Brand=Brand;
this.type=type;
this.power=power;
System.out.println("\nBrand="+Brand+"\ntype="+type+"\npower="+power);
}
Scooter(String color,int price,String make)
{
System.out.println("\nConstructor with one string,int and string");
this.color=color;
this.price=price;
this.make=make;
System.out.println("\ncolor="+color+"\nprice="+price+"\nmake="+make);
}
Scooter(String city,int weight,boolean Selfstart)
{
System.out.println("\nConstructor with one string,int and boolean");
this.city=city;
this.weight=weight;
this.Selfstart=Selfstart;
System.out.println("\ncity="+city+"\nweight="+weight+"\nSelfstart="+Selfstart);
}
Scooter(boolean Headlight,String offer,boolean Rechargeablebattery)
{
System.out.println("\nConstructor with one boolean,string and boolean");
this.Headlight=Headlight;
this.offer=offer;
this.Rechargeablebattery=Rechargeablebattery;
System.out.println("\nHeadlight="+Headlight+"\noffer="+offer+"\nRechargeablebattery="+Rechargeablebattery);
}
Scooter(int nop,String manufacture,boolean GoodMilage)
{
System.out.println("\nConstructor with one int,string and boolean");
this.nop=nop;
this.manufacture=manufacture;
this.GoodMilage=GoodMilage;
System.out.println("\nnop="+nop+"\nmanufacture="+manufacture+"\nGoodmilage="+GoodMilage);
}
}