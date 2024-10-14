package ast;

import java.util.ArrayList;

public class Fun{
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;
	
	public Fun(String nome,ArrayList<ParamFormalFun> params, String retorno,ArrayList<VarDecl> vars,ArrayList<Comando> body)
	{
		this.nome = nome;
		this.params = params;
		if (retorno == "boolean")
			retorno = "bool";
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

	public String toString(Integer identation) {
		// return "Fun [nome=" + nome + ", params=" + params + ", retorno=" + retorno + ", vars=" + vars + ", body=" + body + "]";
		// Format as a python function
		String str = "";
		str += "def " + nome + "(";
		for (int i = 0; i < params.size(); i++) {
			str += params.get(i).toString();
			if (i < params.size() - 1) {
				str += ", ";
			}
		}
		str += "):";
		str += "\n";
		for (VarDecl v : vars) {
			str += v.toString(identation + 1);
		}
		for (Comando c : body) {
			str += c.toString(identation + 1);
		}

		
		return str;
	}
}
