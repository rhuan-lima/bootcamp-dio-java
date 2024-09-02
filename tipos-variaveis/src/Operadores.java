public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        numero = - numero; // transformando um número inteiro em negativo
        System.out.println(numero);
        numero = numero * -1; // transformando um número inteiro em positivo
        System.out.println(numero);
        numero++; // incrementação 
        System.out.println(numero);
        numero--; // decrementação
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel; //invertendo uma condição de variável booleana
        System.out.println(variavel);
    }
}