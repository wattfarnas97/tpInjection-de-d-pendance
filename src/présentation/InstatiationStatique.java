package présentation;

import dao.DaoImpl1;
import metier.MetierImpl;

public class InstatiationStatique {
public static void main(String[]args) 
{
	DaoImpl1 dao=new DaoImpl1();
	MetierImpl metier=new MetierImpl();
	metier.setDao(dao);
	System.out.println(metier.calcul());
	
}

}
