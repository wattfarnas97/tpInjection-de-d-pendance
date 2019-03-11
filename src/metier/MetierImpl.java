package metier;

import dao.IDao;

public class MetierImpl  implements IMetier{
IDao dao;

public void setDao(IDao dao) {
	this.dao = dao;
}

public double calcul() 
{

return 10*dao.getData();
}
}