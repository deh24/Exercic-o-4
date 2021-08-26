package Controller;

import java.util.Random;

public class ThreadCsapo extends Thread
{
	
	private int puladaM, percorrer, id;
	static int i = 1;


	public ThreadCsapo(int percorrer, int puladaM, int id)
	{
		this.percorrer = percorrer;
		this.puladaM = puladaM;
		this.id = id;
	}

	
	@Override
	public void run() 
	{
		puloSapo();
	}


	private void puloSapo() {
		// TODO Auto-generated method stub
		
	}