import java.util.Scanner; //biblioteca pra ler a entrada

//classe sempre é maiuscula e identica ao arquivo
public class CalculadoraCondicional{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("== Calculadora (Condicional) ==");

        //inserir os valores
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = scanner.next();

        double resultado = 0;
        boolean erro = false;

        if (operacao.equals("+")){
            resultado = num1 + num2;
        } else if (operacao.equals("-")){
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
        } else if (operacao.equals("/")) {
            if(num2 == 0){
                System.out.println("Erro: não é possivel dividir por 0");
                erro = true;
            }else{
                resultado = num1 / num2;
            }

        } else {
            //se os operadores estiverem erradas, da erro
            System.out.println("Erro: operação inválida");
            erro = true;
        }

        //! = false
        if(!erro){
            System.out.println("Resultado:" + resultado);
        }
        scanner.close();
    }

}