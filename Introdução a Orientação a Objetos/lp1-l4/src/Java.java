//2. Crie uma classe Java com um método estático min3(), que recebe três valores inteiros como argumentos e retorna o valor do menor número. Adicione a esta classe uma sobrecarga do método min3(), que faz a mesma operação com valores do tipo Double.

public class Java{
    public Integer numero1;
    public Integer numero2;
    public Integer numero3;
    public Double numero4;
    public Double numero5;
    public Double numero6;

    public static Integer min3(Integer a, Integer b, Integer c) {
        if(a < b) {
            if(a < c) {
                return a;
            } else return c;
        }
        else {
            if(b < c) {
                return b;
            } else return c;
        }
    }

    public static Double min3(Double a, Double b, Double c) {
        if(a < b) {
            if(a < c) {
                return a;
            } else return c;
        }
        else {
            if(b < c) {
                return b;
            } else return c;
        }
    }
}