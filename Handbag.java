class Handbag
{
String col;
int pri;
String brd;
int siz;
boolean mat;
Handbag()
{
System.out.println("No Arguments Constructor");
}
Handbag(String colour)
{
System.out.println("\nConstructor with one string");
col=colour;
System.out.println("\nColour="+col);
}
Handbag(int Price)
{
System.out.println("\nConstructor with Integer");
pri=Price;
System.out.println("Price="+pri);
}
Handbag(String colour,int Price)
{
System.out.println("\nConstructor with one String and integer");
col=colour;
pri=Price;
System.out.println("\ncolour="+col);
System.out.println("Price="+pri);	
}
Handbag(int Price,String Brand)
{
System.out.println("\nConstructor with one integer and String");
pri=Price;
brd=Brand;
System.out.println("Price="+pri);
System.out.println("Brand="+brd);	
}
Handbag(boolean Material)
{
System.out.println("\nConstructor with a boolean");
mat=Material;
System.out.println("Material is a leather="+mat);
}
Handbag(String Brand,boolean Material)
{
System.out.println("\nConstructor with one String and boolean");
brd=Brand;
mat=Material;
System.out.println("Brand="+brd);
System.out.println("Materialisaleather="+mat);	
}
Handbag(int size,boolean Material)
{
System.out.println("\nConstructor with one integer and boolean");
siz=size;
mat=Material;
System.out.println("size="+siz);
System.out.println("Material is a leather="+mat);	
}
Handbag(String colour,int Price,boolean Material)
{
System.out.println("\nConstructor with String  integer and boolean");
col=colour;
pri=Price;
mat=Material;
System.out.println("colour="+col);
System.out.println("Price="+pri);
System.out.println("Material is a leather="+mat);
}
Handbag(int size,String Brand,boolean Material)
{
System.out.println("\nConstructor with integer String and boolean");
siz=size;
brd=Brand;
mat=Material;
System.out.println("size="+siz);
System.out.println("Brand="+brd);
System.out.println("Material is a leather="+mat);
}
Handbag(boolean Material,int size,String colour)
{
System.out.println("\nConstructor is boolean,int and string");
mat=Material;
siz=size;
col=colour;
System.out.println("Material is a leather="+mat);
System.out.println("size="+siz);
System.out.println("colour="+col);
}
Handbag(boolean Material,String Brand,int Price)
{
System.out.println("\nConstructor is boolean,String and int");
mat=Material;
brd=Brand;
pri=Price;
System.out.println("Material is leather="+mat);
System.out.println("Brand="+brd);
System.out.println("Price="+pri);
}
}