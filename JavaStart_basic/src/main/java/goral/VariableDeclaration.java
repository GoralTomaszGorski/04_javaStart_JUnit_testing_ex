package goral;

public class VariableDeclaration {

    public void variableWriter(){
        final int x = 258;
        final double d = 5.43;
        final byte y = 14;
        final char sign = 'r';

        System.out.println(x + y);
        System.out.println(d);
        System.out.println(y);
        System.out.println(sign);

        String word1 = "Ania";
        String word2 = "Bartek";
        String word3 = "Czarek";
        String word4 = word1 + word2 + word3;

        System.out.println(word1 + word2 + word3);
        System.out.println(word4);
        System.out.println(word4.substring(0, 10));

        System.out.println('s' + 4 + 4 + "Rea" + '4' + 2 + 'b');
    }
}
