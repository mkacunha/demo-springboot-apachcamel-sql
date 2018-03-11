package br.com.mkacunha.camel.democamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DemoTeste extends RouteBuilder{

    public DemoTeste() {
        System.out.println("Inicializando componente");
    }

    @Override
    public void configure() throws Exception {
        from("sql:select * from team?consumer.delay=4000")
                .bean("teamTranslate", "translate")
                .process(new TeamProcessor());
    }

    private void teste(){
        System.out.println("Deu certo");
    }
}
