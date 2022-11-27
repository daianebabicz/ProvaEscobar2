package provabim1;

class HVACArrefecimentoCompressor extends HVACSistemaDigital{

	public HVACArrefecimentoCompressor(Produto compressorDecorado) {
		super(compressorDecorado);
	}

	public void build() {

        System.out.println("Novo HVAC - Arrefecimento e Compressor construído com: ");
		integraSistemaDeArrefecimento();
		compressorDecorado.build();
	}

}