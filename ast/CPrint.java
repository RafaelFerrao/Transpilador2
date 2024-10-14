package ast;

import java.util.ArrayList;

public class CPrint extends Comando{
	public Exp exp;
	
	
	public CPrint(Exp exp)
	{
	  this.exp = exp;
	  
	}


	public String toString(Integer identation) {
		// format as a python print
		// add identation when needed
		String str = "";
		for (int i = 0; i < identation; i++) {
			str += "\t";
		}
		str += "print(" + exp.toString() + ")\n";
		return str;
	}

}
