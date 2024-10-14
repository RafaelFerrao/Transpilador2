package ast;

import java.util.ArrayList;

public class Prog{
    public Main main;
    public ArrayList<Fun> fun;
    public Integer identation = 0;
    public Prog(Main main, ArrayList<Fun> fun)
    {
        this.main = main;
        this.fun = fun;
    }

    public void print()
    {
        for (Fun f : fun) {
            System.out.println(f.toString(0));
        }

        System.out.println(main.toString(0));
    }

    public void export() {
        String code = "";
        for (Fun f : fun) {
            code += f.toString(0);
        }
        code += main.toString(0);
        
        // Write to file
        try {
            java.io.FileWriter myWriter = new java.io.FileWriter("output.py");
            myWriter.write(code);
            myWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
}

