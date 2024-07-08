package modelo;

public class consultoriaFinanceira {

	//Atributos
	private String nomeEmpresa;
	private int clientesAtivos;
	private double mediaRetornoInvestimento;
	private double honorarios;
	private double comissoes;
	private double retainers;
	private double salariosFuncionarios;
	
	//Constructor
	public consultoriaFinanceira(String nomeEmpresa, int clientesAtivos, double mediaRetornoInvestimento,
		double honorarios, double comissoes, double retainers, double salariosFuncionarios) {
		this.nomeEmpresa = nomeEmpresa;
		this.clientesAtivos = clientesAtivos;
		this.mediaRetornoInvestimento = mediaRetornoInvestimento;
		this.honorarios = honorarios;
		this.comissoes = comissoes;
		this.retainers = retainers;
		this.salariosFuncionarios = salariosFuncionarios;
	}

	//
	public consultoriaFinanceira(){}
	
	//Method
	public double calcularLucro(){
		return (this.honorarios + this.comissoes + this.retainers - this.salariosFuncionarios);
	}
	
	//Get and Set
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public int getClientesAtivos() {
		return clientesAtivos;
	}

	public void setClientesAtivos(int clientesAtivos) {
		this.clientesAtivos = clientesAtivos;
	}

	public double getMediaRetornoInvestimento() {
		return mediaRetornoInvestimento;
	}

	public void setMediaRetornoInvestimento(double mediaRetornoInvestimento) {
		this.mediaRetornoInvestimento = mediaRetornoInvestimento;
	}

	public double getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(double honorarios) {
		this.honorarios = honorarios;
	}

	public double getComissoes() {
		return comissoes;
	}

	public void setComissoes(double comissoes) {
		this.comissoes = comissoes;
	}

	public double getRetainers() {
		return retainers;
	}

	public void setRetainers(double retainers) {
		this.retainers = retainers;
	}

	public double getSalariosFuncionarios() {
		return salariosFuncionarios;
	}

	public void setSalariosFuncionarios(double salariosFuncionarios) {
		this.salariosFuncionarios = salariosFuncionarios;
	}
	
}


