public class MathHelper {
    public int numeroSeguinte(int numero){
        return numero + 1;
    }

    public String juntarNomes(String nome, String apelido){
        return nome + " " + apelido;
    }

    public int maior(int[] numeros){
        int maiorTemp = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > numeros[0]){
                maiorTemp = numeros[i];
            }
        }
        return maiorTemp;
    }

    public int soma(int[] numeros){
        int somaTotal = 0;
        for(int num : numeros){
            somaTotal +=  num;
        }
        return somaTotal;
    }


}