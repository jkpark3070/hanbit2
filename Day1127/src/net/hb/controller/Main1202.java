package net.hb.controller;

import net.hb.model.IndexOfEx;
import net.hb.model.Juso;
import net.hb.model.ManOrWoman;
import net.hb.model.ModifyChars;

public class Main1202 {
	public static void main(String[] args) {
		Main1202 m = new Main1202();
	//	m.arrayTest();
	//	m.indexOfEx();
	//	m.modifyChars();
		m.isManOrWoman();
	}
	public void isManOrWoman(){
		ManOrWoman mw = new ManOrWoman();
		mw.isManOrWoman();
		mw.outputSsnBack();
	}
	
	public void modifyChars(){
		ModifyChars mc = new ModifyChars();
		mc.modifyChars();
	}
	
	public void indexOfEx(){
		IndexOfEx iox = new IndexOfEx();
		iox.getIdx();
	}
	
	public void arrayTest() {
		Juso js = new Juso();
		js.arrayTest();
	}
}
