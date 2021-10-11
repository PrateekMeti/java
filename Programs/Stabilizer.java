class Stabilizer
{
String Brand="LG";
String type="Main component";
int size=21;
String color="Blue";
int price=4000;
String make="China";
String city="bad";
int weight=6;
boolean highvoltagecutoff=false;
boolean mainsturnondelay=false;
String offer="20% offer via code apply";
boolean codeavailable=false;
int noib=5;
String manufacture="LG";
boolean Batteriesinculded=true;
Stabilizer()
{
System.out.println("No Argument constructor");
}
Stabilizer(String Brand,String type,int size)
{
System.out.println("\nConstructor with one string,string and int");
this.Brand=Brand;
this.type=type;
this.size=size;
System.out.println("\nBrand="+Brand+"\ntype="+type+"\nsize="+size);
}
Stabilizer(String color,int price,String make)
{
System.out.println("\nConstructor with one string,int and string");
this.color=color;
this.price=price;
this.make=make;
System.out.println("\ncolor="+color+"\nprice="+price+"\nmake="+make);
}
Stabilizer(String city,int weight,boolean highvoltagecutoff)
{
System.out.println("\nConstructor with one string,int and boolean");
this.city=city;
this.weight=weight;
this.highvoltagecutoff=highvoltagecutoff;
System.out.println("\ncity="+city+"\nweight="+weight+"\nhighvoltagecutoff="+highvoltagecutoff);
}
Stabilizer(boolean mainsturnondelay,String offer,boolean codeavailable)
{
System.out.println("\nConstructor with one boolean,string and boolean");
this.mainsturnondelay=mainsturnondelay;
this.offer=offer;
this.codeavailable=codeavailable;
System.out.println("\nmainsturnondelay="+mainsturnondelay+"\noffer="+offer+"\ncodeavailable="+codeavailable);
}
Stabilizer(int noib,String manufacture,boolean Batteriesinculded)
{
System.out.println("\nConstructor with one int,string and boolean");
this.noib=noib;
this.manufacture=manufacture;
this.Batteriesinculded=Batteriesinculded;
System.out.println("\nnoib="+noib+"\nmanufacture="+manufacture+"\nBatteriesinculded="+Batteriesinculded);
}
}


