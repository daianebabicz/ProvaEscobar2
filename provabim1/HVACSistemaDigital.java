package provabim1;

class HVACSistemaDigital extends HVACCompressor{
    
    public HVACSistemaDigital(Produto compressorDecorado) {
		super(compressorDecorado);
	}

	public void build() {
        System.out.println("Novo HVAC - Sistema digital construído com: ");
		integraSistemaDeArrefecimento();
        integraUnidadeCondensadora();
        integraVentilador();
        integraPainelDigital();
		compressorDecorado.build();
	}

	public void integraSistemaDeArrefecimento() {
		System.out.println("Sistema de arrefecimento integrado");
	}

    public void integraUnidadeCondensadora() {
		System.out.println("Unidade condensadora integrada");
	}

    public void integraVentilador() {
		System.out.println("Ventilador integrado");
	}

    public void integraPainelDigital() {
		System.out.println("Painel controlador digital integrado");
	}
}
