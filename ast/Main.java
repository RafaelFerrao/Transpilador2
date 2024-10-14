package ast;

import java.util.ArrayList;

public class Main{

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms)
	{
		this.vars = vars;
		this.coms = coms;
	}

	public String toString(Integer identation) {

		// format as a python main

		String str = "";
		str += "\n";
		for (VarDecl v : vars) {
			str += v.toString(identation);
		}
		for (Comando c : coms) {
			str += c.toString(identation);
		}
		return str;
	}

}
