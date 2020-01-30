abstract class phone
{
	abstract void cal();
	abstract void games();
	abstract void songs();
}
class Mi extends phone
{
	
	void  songs()
{}
	void cal()
{}
	void games()
{
	System.out.println("games");
}
}
class Nokia extends phone
{
void cal()
{}
void games()
{}

	
	void songs()

{
	System.out.println("songs");
}
}
class  Samsung extends phone
{
void games()
{}
void songs()
{}
	void cal()
	
{
	System.out.println("cal");
}
}


class Abs
{
public static void main(String args[])
{
	phone obj1=new Mi();
	phone obj2=new Nokia();
	phone obj3=new Samsung();
	obj1.games();
	obj2.songs();
	obj3.cal();
}
}	