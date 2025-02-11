package ast;

import java.util.ArrayList;

public class CChamadaFun extends Comando{
	public String fun;
	public ArrayList<Exp> args;
	
	public CChamadaFun(String fun, ArrayList<Exp> args)
	{
	  this.fun = fun;
	  this.args = args;
	}


	public String toString(Integer identation) {
		String str = "";
		for (int i = 0; i < identation; i++) {
			str += "\t";
		}
		str += fun + "(";
		for (int i = 0; i < args.size(); i++) {
			str += args.get(i).toString();
			if (i < args.size() - 1) {
				str += ", ";
			}
		}
		str += ")\n";
		return str;
	}

}
