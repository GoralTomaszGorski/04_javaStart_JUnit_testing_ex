package goral;

public class PasswordResetMailContentProvider {

    private RandomProvider randomProvider;


    public PasswordResetMailContentProvider(RandomProvider randomProvider) {
        this.randomProvider = randomProvider;
    }

    public String createResetMailContent() {
        String template = "Cześć, aby przejść do resetowania hasła <a href=\"https://example.com/reset?key="+randomProvider.passwordGenerator()+"\">ten link</a>";
        String randomKey = randomProvider.passwordGenerator();
        return String.format(template, randomKey);
    }
}
