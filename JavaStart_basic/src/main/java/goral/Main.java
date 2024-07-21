package goral;

public class Main {


    public static void main(String[] args) {

        NumberCompare numberCompare = new NumberCompare();
        numberCompare.compareWriter();

        NameWriter nameWriter = new NameWriter();
        nameWriter.nameWriter();

        VariableDeclaration variableDeclaration = new VariableDeclaration();
        variableDeclaration.variableWriter();

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.calculatorWriter();
    }


}