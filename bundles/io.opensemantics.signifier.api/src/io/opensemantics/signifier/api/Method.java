/**
 * Copyright 2015 OpenSemantics.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.opensemantics.signifier.api;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public class Method {

  @NotNull
  private String typeName;
  private List<String> parameters;
  private Boolean constructor;
  private String name;
  private transient String body;
  
  @XmlElement(name="type")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  public Boolean isConstructor() {
    return constructor;
  }

  public void setConstructor(Boolean constructor) {
    this.constructor = constructor;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "Method [typeName=" + typeName + ", parameters=" + parameters
        + ", constructor=" + constructor + ", name="
        + name + "]";
  }
}
