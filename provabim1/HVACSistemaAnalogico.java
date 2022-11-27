package provabim1;

class HVACSistemaAnalogico extends HVACSistemaDigital{

    public HVACSistemaAnalogico(Produto compressorDecorado) {
		super(compressorDecorado);
	}

	public void build() {
        System.out.println("Novo HVAC - Sistema analógico construído com: ");
        integraSistemaDeArrefecimento();
        integraUnidadeCondensadora();
        integraVentilador();
        integraPainelAnalogico();
		compressorDecorado.build();
	}
    
    public void integraPainelAnalogico() {
		System.out.println("Painel controlador analógico integrado");
	}
}
