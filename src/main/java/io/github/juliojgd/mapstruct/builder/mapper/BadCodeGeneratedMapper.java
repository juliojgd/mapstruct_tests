package io.github.juliojgd.mapstruct.builder.mapper;


import io.github.juliojgd.mapstruct.builder.*;
import org.mapstruct.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper(
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, imports = FirstEnum.class)
public interface BadCodeGeneratedMapper {


    @Mapping(source = "type", target = "fifthEnum")
    @Mapping(source = "limitedCoordinates", target = "thing3")
    @Mapping(source = "thing17", target = "thing1")
    @Mapping(source = "thing19", target = "fourthType.countryIso")
    @Mapping(source = "thing20", target = "fourthType.provinceIso")
    @Mapping(source = "thing21", target = "fourthType.zipCode")
    @Mapping(source = "thing22", target = "fourthType.district")
    @Mapping(source = "city", target = "fourthType.city")
    @Mapping(source = "thing22", target = "fourthType.addressName")
    @Mapping(source = "thing24", target = "thing7")
    @Mapping(source = "thing22", target = "thing8")
    @BeanMapping(resultType = TenthRequest.Builder.class)
    TenthRequest.Builder map(NinethRequest ninethRequest);

    default FifthEnum map(int value) {
        return FifthEnum.UNKNOWN;
    }


    @Mapping(source = "type", target = "fifthEnum")
    @Mapping(source = "code", target = "thing9")
    @Mapping(source = "thing16", target = "fourthType.countryIso")
    @Mapping(target = "thing7", constant = "0")
    @Mapping(target = "extraParams", source = "extraParams", qualifiedByName = "mapExtraParams")
    @BeanMapping(resultType = TenthRequest.class)
    TenthRequest getAndValidateRequest2LocationRequest(EightthRequest eightthRequest);

    default Map<String, String> mapExtraParams(List<Integer> extraParams) {
        return new HashMap<>();
    }


    @BeanMapping(resultType = TenthRequest.Builder.class)
    default TenthRequest.Builder builder() {
        return TenthRequest.builder();
    }

    @BeanMapping(resultType = TenthRequest.class)
    default TenthRequest listRequest2LocationRequest(final NinethRequest ninethRequest) {
        if (Objects.isNull(ninethRequest)) {
            return null;
        }
        return this.map(ninethRequest).build();
    }
}
