package view;

import Controller.ThreadCsapo;

public class Principal
{

	public static void main(String[] args)
	{
		for (int id = 0; id < 5; id++)
		{
			Thread ThreadCsapos = new ThreadCsapo(100, 5, id);
			ThreadCsapos.start();
		}
	}

}