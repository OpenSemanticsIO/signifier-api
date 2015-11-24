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

public class Callsite {

  public Callsite(Method callee, List<Method> callers) {
    this.callee = callee;
    this.callers = callers;
  }

  private Method callee;
  private List<Method> callers;

  public Method getCallee() {
    return callee;
  }
  public void setCallee(Method callee) {
    this.callee = callee;
  }
  public List<Method> getCallers() {
    return callers;
  }
  public void setCallers(List<Method> callers) {
    this.callers = callers;
  }
  
}
