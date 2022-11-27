package provabim1;

class HVACUnCondensadoraCompleta extends HVACSistemaDigital{
    
	public HVACUnCondensadoraCompleta(Produto compressorDecorado) {
		super(compressorDecorado);
	}

	public void build() {
        System.out.println("Novo HVAC - Unidade condensadora completa construído com: ");
		integraSistemaDeArrefecimento();
        integraUnidadeCondensadora();
		compressorDecorado.build();
	}

}
