package ast;

import java.util.ArrayList;

public class CReturn extends Comando{
	public Exp exp;
	
	
	public CReturn(Exp exp)
	{
	  this.exp = exp;
	  
	} 


	public String toString(Integer identation) {
		String str = "";
		for (int i = 0; i < identation; i++) {
			str += "\t";
		}
		str += "return " + exp.toString() + "\n";
		return str;
	}

}
