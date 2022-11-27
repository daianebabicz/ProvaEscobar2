package provabim1;

abstract class HVACCompressor extends Produto{

    protected Produto compressorDecorado;

	public HVACCompressor(Produto compressorDecorado) {
		this.compressorDecorado = compressorDecorado;
	}


}
