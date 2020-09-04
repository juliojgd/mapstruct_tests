package io.github.juliojgd.mapstruct.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondCResult implements Serializable {

  private static final long serialVersionUID = 8287439357389925653L;

  private SecondEnum type;

  private List<String> values;

}
