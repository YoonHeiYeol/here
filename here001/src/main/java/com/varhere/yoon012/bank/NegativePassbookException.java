package com.varhere.yoon012.bank;
/**
 * 마이너스 통장은 무분별하게 사용하면 가정을 파괴할수 있으므로
 * 체크하고 발행한다.
 */

import java.io.IOException;

public class NegativePassbookException  extends IOException {

	public NegativePassbookException(String msg) {
		super(msg);
	}

}
