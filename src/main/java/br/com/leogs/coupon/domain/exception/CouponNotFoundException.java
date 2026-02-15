package br.com.leogs.coupon.domain.exception;

public class CouponNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_MESSAGE = "Erro: Esse cupom já foi deletado anteriormente.";
	
    public CouponNotFoundException() {
        super(DEFAULT_MESSAGE);
    }
}
