package Arleys;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ContaDeGaz {

	private Date dataDeLeitura;
	private float m3Gasto;
	private float valorApagar;
	private Date dataDePagamento;
	private float media;
	public static ArrayList <ContaDeGaz> contas = new ArrayList <ContaDeGaz>();
	

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

	

	public Date getDataDeLeitura() {
		return dataDeLeitura;
	}

	public void setDataDeLeitura(Date dataDeLeitura) {
		this.dataDeLeitura = dataDeLeitura;
	}

	public Date getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Date dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	Scanner sc;
	public boolean cadastrarContaDeGaz(){ 
		System.out.println(" Digite dados da fatura: ");
		
		sc = new Scanner(System.in);
		ContaDeGaz contadegaz = new ContaDeGaz();
		
		do {
		
		System.out.println("m3Gasto");
		contadegaz.setM3Gasto(sc.nextFloat());
		
		System.out.println("valorApagar");
		contadegaz.setValorApagar(sc.nextFloat());
		
		try {
		System.out.println("dataDePagamento");
		String dataDePagamento = sc.next());
		
		
		 DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
		 Date dt;
			
	    	dt = df.parse(dataDePagamento);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}  
		   
		contadegaz.setDate(dt);
		
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
	public int verificaMenorConsumo(){
		int menorConsumo = Integer.MAX_VALUE;
		for (int k=0; k<contas.length; k++){
			if (contas.get(k).getValorAPagar() < menorConsumo){
				menorConsumo = contas.get(k).getValorAPagar();
				
			}
		}
		return menorConsumo;
	}
	public void verificaMaiorConsumo(){
		
	}
	
}
