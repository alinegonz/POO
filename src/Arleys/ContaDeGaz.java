package Arleys;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ContaDeGaz {

	private String dataDeLeitura;
	private float m3Gasto;
	private float valorApagar;
	private String dataDePagamento;
	private float media;
	
	

	public float getM3Gasto() {
		return m3Gasto;
	}

	public void setM3Gasto(float m3Gasto) {
		this.m3Gasto = m3Gasto;
	}

	public float getValorApagar() {
		return valorApagar;
	}

	public void setValorApagar(float valorApagar) {
		this.valorApagar = valorApagar;
	}

	

	public String getDataDeLeitura() {
		return dataDeLeitura;
	}

	public void setDataDeLeitura(String dataDeLeitura) {
		this.dataDeLeitura = dataDeLeitura;
	}

	public String getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(String dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean cadastrarContaDeGaz(){ 
		System.out.println(" Digite dados da fatura: ");
		Scanner sc = new Scanner(System.in);
		ArrayList <ContaDeGaz> contas = new ArrayList <ContaDeGaz>();
		ContaDeGaz contadegaz;
		String sim;
		
		do {
			
		contadegaz = new ContaDeGaz(); 
		
		System.out.println("m3Gasto");
		contadegaz.setM3Gasto(sc.nextFloat());
		
		System.out.println("valorApagar");
		contadegaz.setValorApagar(sc.nextFloat());
		
		try {
		System.out.println("dataDePagamento");
		contadegaz.setDataDePagamento(sc.next());
		
		
		 DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
		 Date dt;
			
	    	dt = df.parse(dataDePagamento);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}  
		   
		
		System.out.println("media");// media é um atributo mesmo ou um metodo?
		contadegaz.setMedia(sc.nextFloat());
		
		
		try {
			System.out.println("dataDeLeitura");
			contadegaz.setDataDeLeitura(sc.next());
			
			
			 DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
			 Date dt;
				
		    	dt = df.parse(dataDeLeitura);
				} catch (ParseException e) {
					
					e.printStackTrace();
				}  
		
		contas.add(contadegaz);
		
		System.out.println(" Continuar Cadastrando? ");
	    sim = sc.next();
	    
		} while (sim.equals("sim"));
		sc.close();
		return true;
	}
	public void verificaMenorConsumo(){
		
	}
	public void verificaMaiorConsumo(){
		
	}
	
}
