package practicaJava;

public class InterfaceCajeroFactory {
	
	
	public InterfaceCajero Tramite(String tipoTramite){
		InterfaceCajero cajero=null;
		
		if(tipoTramite.equals("Transferencia")){
			cajero= new transBanc();
		}
		if(tipoTramite.equals("Deposito")){
			cajero= new deposito();
		}
		if(tipoTramite.equals("Consulta")){
			cajero= new ConSaldo();
		}
		
		
		return cajero;
		
	}

}
