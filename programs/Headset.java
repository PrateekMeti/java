class Headset
{
String col;
String brd;
int pri;
String ty;
int vol;
boolean mc;
Headset()
{
System.out.println("No Arguments Constructor");
}
Headset(String colour)
{
System.out.println("\nConstructor with one string");
col=colour;
System.out.println("\nColour="+col);
}
Headset(int Price)
{
System.out.println("\nConstructor with integer");
pri=Price;
System.out.println("Price="+pri);
}
Headset(String colour,int Price)
{
System.out.println("\nConstructor with one String and integer");
col=colour;
pri=Price;
System.out.println("\ncolour="+col);
System.out.println("Price="+pri);	
}
Headset(int Price,String Brand)
{
System.out.println("\nConstructor with one integer and String");
pri=Price;
brd=Brand;
System.out.println("Price="+pri);
System.out.println("Brand="+brd);	
}
Headset(boolean Mic)
{
System.out.println("\nConstructor with a boolean");
mc=Mic;
System.out.println("HeadsetwithaMic="+mc);
}
Headset(String Brand,boolean Mic)
{
System.out.println("\nConstructor with one String and boolean");
brd=Brand;
mc=Mic;
System.out.println("Brand="+brd);
System.out.println("Headset with a Mic="+mc);	
}
Headset(int Volume,boolean Mic)
{
System.out.println("\nConstructor with one integer and boolean");
vol=Volume;
mc=Mic;
System.out.println("Volume="+vol);
System.out.println("Headset with a Mic="+mc);	
}
Headset(String colour,int Price,boolean Mic)
{
System.out.println("\nConstructor with String  integer and boolean");
col=colour;
pri=Price;
mc=Mic;
System.out.println("colour="+col);
System.out.println("Price="+pri);
System.out.println("Headset with a Mic="+mc);
}
Headset(int Volume,String Type,boolean Mic)
{
System.out.println("\nConstructor with integer String and boolean");
vol=Volume;
ty=Type;
mc=Mic;
System.out.println("Volume="+vol);
System.out.println("Type="+ty);
System.out.println("Headset with a Mic="+mc);
}
}