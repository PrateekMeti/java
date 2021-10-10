class HandbagRunner
{
public static void main(String[] args)
{
String col="Red";
int pri=100;
String brd="Wildcraft";
int siz=25;
boolean mat=true;
new Handbag();
new Handbag(col);
new Handbag(pri);
new Handbag(col,pri);
new Handbag(pri,brd);
new Handbag(mat);
new Handbag(brd,mat);
new Handbag(siz,mat);
new Handbag(col,pri,mat);
new Handbag(siz,brd,mat);
new Handbag(mat,siz,col);
new Handbag(mat,pri,brd);
}
}