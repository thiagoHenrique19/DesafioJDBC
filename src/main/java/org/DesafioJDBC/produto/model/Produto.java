package org.DesafioJDBC.produto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
     Integer id;
     String nome;
     float valor;
}
