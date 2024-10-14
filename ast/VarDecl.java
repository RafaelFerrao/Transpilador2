package ast;

public class VarDecl{
   public String type;
   public String var;
   
   public VarDecl(String type, String var){
      if (type == "boolean")
         type = "bool";
   	this.type = type;
   	this.var = var;
   }

   public String toString(Integer identation) {
      // format as a python variable declaration
      //add identation
      String str = "";
      for (int i = 0; i < identation; i++) {
         str += "\t";
      }
      str += var + "= None\n";
      return str;
   }
}
