package FusionMarket.DAO;

import FusionMarket.DAO.ConPooling;




public class Banco {

	public static ConPooling cn = ConPooling.getInstance();


 
       
	public static void main(String args[]) {

		System.out.println("Funcionou!");
	}
}