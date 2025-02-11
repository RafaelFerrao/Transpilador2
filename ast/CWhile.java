package ast;

import java.util.ArrayList;

public class CWhile extends Comando{
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CWhile(Exp exp, ArrayList<Comando> bloco)
	{
	  this.exp = exp;
	  this.bloco = bloco;
	}


	public String toString(Integer identation) {
		String str = "";
		for (int i = 0; i < identation; i++) {
			str += "\t";
		}
		str += "while " + exp.toString() + ":\n";
		for (Comando c : bloco) {
			str += c.toString(identation + 1);
		}
		return str;
	}

}
