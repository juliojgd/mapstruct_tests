package io.github.juliojgd.mapstruct.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FourthType {

  private String city;

  private String provinceIso;

  private String countryIso;

  private String district;

  private String municipality;

  private String stateCode;

  private String zipCode;

  private String addressName;
}
