package br.com.mkacunha.camel.democamel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class TeamProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Team team = exchange.getIn().getBody(Team.class);

        System.out.println("Processor");
        System.out.println(team);


    }
}
