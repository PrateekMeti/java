class HeadsetRunner
{
public static void main(String[] args)
{
String col="blue";
String brd="Boat";
int pri=4999;
String ty="Boat2252";
int vol=25;
boolean mc=true;
new Headset();
new Headset(col);
new Headset(pri);
new Headset(col,pri);
new Headset(pri,brd);
new Headset(mc);
new Headset(brd,mc);
new Headset(vol,mc);
new Headset(col,pri,mc);
new Headset(vol,ty,mc);
}
}