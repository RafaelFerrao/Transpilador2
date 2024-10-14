package ast;


public class CReadInput extends Comando{
	public String var;
	
	
	public CReadInput(String var)
	{
	  this.var = var;
	}


	public String toString(Integer identation) {
		// format as a python read input
		// add identation when needed
		String str = "";
		for (int i = 0; i < identation; i++) {
			str += "\t";
		}
		str += var + " = float(input())\n";
		return str;
	}

}
