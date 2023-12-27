package api;

import java.util.Optional;

@SuppressWarnings("ALL")
public class AppOptional8 {

    /* MUITO CUIDADO PARA USAR O OPTIONAL SOMENTE DA FORMA QUE FOI PROJETADO PARA SER USADO
    ELE FOI INTRODUZIDO NO JAVA PARA REPRESENTAR UM VALOR AUSENTE DENTRO DE UM RETORNO DE MÉTODO
    PORTANTO A FORMA CORRETA DE USO FOI DEMONSTRADO NOS EXEMPLOS ANTERIORES

    APESAR DO JAVA PERMITIR DO PONTO DE VISTA TÉCNICO, DO PONTO DE VISTA DE BOAS PRÁTICAS:

    -> NUNCA ATRIBUIR UM NULL À UM OPTIONAL, ELE NÃO FOI FEITO PARA ISSO.

    -> NUNCA UTILIZAR OPTIONAL COMO PARÂMETRO DE MÉTODO

    -> NUNCA UTILIZAR OPTIONAL PARA ATRIBUTOS DE CLASSES

    */

    private Optional<String> id; // errado

    public void sum(Optional<Integer> v1, Optional<Integer> v2) { // errado

    }

    public Optional<Integer> getNumber() {
        return null; // errado
    }
}
