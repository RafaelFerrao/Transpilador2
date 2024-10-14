package ast;

import java.util.ArrayList;

public class CIf extends Comando{
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CIf(Exp exp, ArrayList<Comando> bloco)
	{
	  this.exp = exp;
	  this.bloco = bloco;
	}


	public String toString(Integer identation) {
		// format as a python if
		// add identation when needed
		String str = "";
		for (int i = 0; i < identation; i++) {
			str += "\t";
		}
		str += "if " + exp.toString() + ":\n";
		for (Comando c : bloco) {
			str += c.toString(identation + 1);
		}
		return str;
	}

}
