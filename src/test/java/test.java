import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {

    @Test void testPalindromo(){
        String frase = "olo";
        Palindromo p = new Palindromo(frase);
        Assertions.assertTrue(p.vericarPali());
    }
}