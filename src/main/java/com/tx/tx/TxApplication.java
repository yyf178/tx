package com.tx.tx;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class TxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxApplication.class, args);
    }

}
