package br.com.casadocodigo.livraria.produtos;
@FunctionalInterface // para permitir apenas um método
public interface Promocional {
boolean aplicaDescontoDe(double porcentagem);

}
