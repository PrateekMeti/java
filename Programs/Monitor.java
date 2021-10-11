class Monitor
{
String Brand="HP";
String type="Main component";
int size=22;
String color="Blue";
int price=10000;
String displaytype="UHD";
String make="India";
boolean powercablepresent=true;
boolean refurbished=false;
boolean onlineorder=true;
String offer="50% offer on HDFC credit card";
boolean codeavailable=true;
int noib=5;
String ctype="VGA";
boolean micpresent=true;
Monitor()
{
System.out.println("No Argument constructor");
}
Monitor(String Brand,String type,int size)
{
System.out.println("\nConstructor with one string,string and int");
this.Brand=Brand;
this.type=type;
this.size=size;
System.out.println("\nBrand="+Brand+"\ntype="+type+"\nsize="+size);
}
Monitor(String color,int price,String displaytype)
{
System.out.println("\nConstructor with one string,int and string");
this.color=color;
this.price=price;
this.displaytype=displaytype;
System.out.println("\ncolor="+color+"\nprice="+price+"\ndisplaytype="+displaytype);
}
Monitor(String make,boolean powercablepresent,boolean refurbished)
{
System.out.println("\nConstructor with one string,int and boolean");
this.make=make;
this.powercablepresent=powercablepresent;
this.refurbished=refurbished;
System.out.println("\nmake="+make+"\npowercablepresent="+powercablepresent+"\nrefurbished="+refurbished);
}
Monitor(boolean onlineorder,String offer,boolean codeavailable)
{
System.out.println("\nConstructor with one boolean,string and boolean");
this.onlineorder=onlineorder;
this.offer=offer;
this.codeavailable=codeavailable;
System.out.println("\nonlineorder="+onlineorder+"\noffer="+offer+"\ncodeavailable="+codeavailable);
}
Monitor(int noib,String ctype,boolean micpresent)
{
System.out.println("\nConstructor with one int,string and boolean");
this.noib=noib;
this.ctype=ctype;
this.micpresent=micpresent;
System.out.println("\nnoib="+noib+"\nctype="+ctype+"\nmicpresent="+micpresent);
}
}