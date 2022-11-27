package provabim1;

class HVACUnVentiladoraCompleta extends HVACSistemaDigital{

	public HVACUnVentiladoraCompleta(Produto compressorDecorado) {
		super(compressorDecorado);
	}

	public void build() {
        System.out.println("Novo HVAC - Unidade ventiladora completa construído com: ");
		integraSistemaDeArrefecimento();
        integraUnidadeCondensadora();
        integraVentilador();
		compressorDecorado.build();
	}
    
}
