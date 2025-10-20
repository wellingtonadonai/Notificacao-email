package br.com.notificacao.demo.infraestructure.exception;

public class EmailException extends RuntimeException {

    public EmailException(String menssagem){
        super(menssagem);
    }
    public EmailException(String menssagem, Throwable throwable){
        super(menssagem, throwable);
    }
}
