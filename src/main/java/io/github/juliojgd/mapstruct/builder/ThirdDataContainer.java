package io.github.juliojgd.mapstruct.builder;

import lombok.Data;

import java.util.List;

/**
 * The Class PurchaseAttemptData.
 */
@Data
public class ThirdDataContainer {

  private List<Integer> thing11;

  private List<String> thing12;

  private List<FifthEnum> thing13;

  private List<SecondEnum> thing14;
}
