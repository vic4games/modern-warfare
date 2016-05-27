package com.vicmatskiv.mw;


public class ClientProxy extends CommonProxy {
	
	@Override
	protected boolean isClient() {
		return true;
	}
}
