package br.com.murillo.marvel.Services.Exception;

public class DataBaseException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public DataBaseException(String msg) {
    super(msg);
  }
}
