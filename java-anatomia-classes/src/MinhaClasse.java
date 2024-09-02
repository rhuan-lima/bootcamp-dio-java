public class MinhaClasse {
    public static void main(String [] args) {

       String primeiroNome = "Rhuan";
       String segundoNome = "Lima";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }



}



// main = método
// void = executa e não retorna
// () = parâmetros
// String = exemplo de tipo de parâmetro
// [] = array
// args = argumento do parâmetro
// {} = corpo
// System = classe nativa da linguagem