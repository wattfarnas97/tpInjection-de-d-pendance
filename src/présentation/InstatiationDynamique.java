package présentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class InstatiationDynamique {

	public static void main(String[] args) {
	 try {
		Scanner scan=new Scanner(new File("C:\\Users\\FAROUK\\eclipse-workspace\\TpInjectionDeControle\\src\\config\\config.txt"));
		
		/*on recupere la première ligne du fichier config 
		  qui correspond au nom de la classse du dao implementer
		*/	 
		String daoClassName=scan.nextLine();
		/*on recupere la seconde ligne du fichier config 
		  qui correspond au nom de la classse du metier implementer
		*/	 
		String metierClassName=scan.nextLine();
		/*creation  dynamique de l objet dao*/
		Class cdao=Class.forName(daoClassName);
		IDao dao=(IDao)cdao.newInstance();
		
		/*creation  dynamique de l objet dao*/
		Class cmetier=Class.forName(metierClassName);
		IMetier metier=(IMetier) cmetier.newInstance();
		
		Method meth=cmetier.getMethod("setDao", new Class[] {IDao.class});
		meth.invoke(metier,new Object[] {dao});
		System.out.println(metier.calcul());
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
