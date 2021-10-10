class Climate
{
String loc;
int temp;
String hum;
String des;
boolean cr;
// Constructor
// no argument cons
Climate()
{
System.out.println("\nNo Argument constructor");
}
//cons with one string
Climate(String location)
{
	System.out.println("\nConstructor with single String");
	loc=location;
	System.out.println("\nLocation="+loc);
}
//cons with one int and one String
Climate(int temperature,String humidty)
{
	System.out.println("\nConstructor with one int and string");
	temp=temperature;
	hum=humidty;
	System.out.println("\ntemperature="+temp);
	System.out.println("humdity="+hum);
}
//con with a string and a int
Climate(String description,int temperature)
{
	System.out.println("\nConstructor with a String and int");
	des=description;
	temp=temperature;
	System.out.println("\nDescription="+des);
	System.out.println("temperature=temp");
}
//cons with string and boolean 
Climate(String humdity,boolean Rain)
{
	System.out.println("\nConstructor with string and boolean");
	hum=humdity;
	cr=Rain;
	System.out.println("\nhumdity="+hum);
	System.out.println("Rain="+cr);
}
Climate(String Location,int temparture,boolean Rain)
{
System.out.println("\nConstructor with String and temp and boolean");
loc=Location;
temp=temparture;
cr=Rain;
System.out.println("\nLocation="+loc);
System.out.println("temparture="+temp);
System.out.println("rain="+cr);
}
Climate(boolean Rain,int temparture)
{
System.out.println("\nConstructor with boolean and int");
cr=Rain;
temp=temparture;
System.out.println("\nRain="+cr);
System.out.println("temparture="+temp);
}
Climate(boolean Rain,String Location)
{
System.out.println("\nConstructor with boolean and string");
cr=Rain;
loc=Location;
System.out.println("\nRain="+cr);
System.out.println("Location="+loc);
}
Climate(boolean Rain)
{
System.out.println("\nConstructor with boolean");
cr=Rain;
System.out.println("\nRain="+cr);
}
Climate(int temparture,String Location,boolean Rain)
{
System.out.println("\nConstructor with integer,String,boolean");
temp=temparture;
loc=Location;
cr=Rain;
System.out.println("temparture="+temp);
System.out.println("Location="+loc);
System.out.println("Rain="+cr);
}
}
