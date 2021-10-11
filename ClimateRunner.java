class ClimateRunner
{
public static void main(String[] args)
{
String loc="Mysore";
int temp=25;
String hum="Lightly Humid";
String des="Rainy day";
boolean cr=true;
new Climate();
new Climate(loc);
new Climate(temp,hum);
new Climate(des,temp);
new Climate(hum,cr);
new Climate(loc,temp,cr);
new Climate(cr,temp);
new Climate(cr,loc);
new Climate(cr);
new Climate(temp,loc,cr);
}
}