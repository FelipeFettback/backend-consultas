package com.fiap.backend_consultas.exception;

public class DadosInvalidosException extends RuntimeException {
    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
