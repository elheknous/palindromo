public class Palindromo {

    private String frase;

    public Palindromo(String frase) {
        this.frase = frase;
    }

    public boolean vericarPali(){
        this.frase = this.frase.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(this.frase);
        String invertida = stringBuilder.reverse().toString();
        if (invertida.equals(this.frase)){
            return true;
        }else {
            return false;
        }
    }
}
