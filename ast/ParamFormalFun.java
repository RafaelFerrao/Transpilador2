package ast;

public class ParamFormalFun{
   public String type;
   public String var;
   
   public ParamFormalFun(String type,String var){
      if (type == "boolean")
         type = "bool";
   	this.type = type;
   	this.var = var;
   }

   @Override
   public String toString() {
      return var;
   }

}
