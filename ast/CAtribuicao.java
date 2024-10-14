package ast;


public class CAtribuicao extends Comando{
	public String var;
	public Exp exp;
	
	public CAtribuicao(String var, Exp exp)
	{
	  this.var = var;
	  this.exp = exp;
	}

	
	public String toString(Integer identation) {
		// format as a python variable declaration
		//add identation
		String str = "";
		for (int i = 0; i < identation; i++) {
			str += "\t";
		}
		str += var + " = " + exp.toString() + "\n";
		return str;
	}

}
