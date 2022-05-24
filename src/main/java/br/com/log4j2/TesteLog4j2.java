package br.com.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TesteLog4j2 {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        log.info("Log de info");
        log.error("Log de erro");
        log.warn("Log de WARN");
        log.trace("Log de trace");
    }
}
