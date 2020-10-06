/*
 * Geoinfo
 * Ehitisregistri geoteenused.   Kood asub: [https://git.mkm.ee/ehr/ehr-k8s-pipeline/ehr-geoservices](https://git.mkm.ee/ehr/ehr-k8s-pipeline/ehr-geoservices)
 *
 * OpenAPI spec version: 1.0.2
 * Contact: ulo.puskar@mkm.ee
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.client.model.Component;
import java.util.ArrayList;
import java.util.List;
/**
 * AddressComponent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-06T14:54:39.839716700+03:00[Europe/Helsinki]")
public class AddressComponent extends ArrayList<Component> {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressComponent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
