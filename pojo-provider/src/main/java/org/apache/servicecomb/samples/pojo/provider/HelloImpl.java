/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.servicecomb.samples.pojo.provider;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestSchema(schemaId = "helloWorld")
@RequestMapping(value = "provider/v0")
public class HelloImpl{
  @RequestMapping(value = "/hello",method=RequestMethod.GET)
  public String sayHello(@RequestParam(value = "name",required = true) String name){
    return "bbbbb:"+name;
  }
}

/*
import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.apache.servicecomb.samples.common.schema.Hello;
import org.apache.servicecomb.samples.common.schema.models.Person;

@RpcSchema(schemaId = "hello")
public class HelloImpl implements Hello {

  @Override
  public String sayHi(String name) {
    return "Hello " + name;
  }

  @Override
  public String sayHello(Person person) {
    return "Hello person " + person.getName();
  }
}
*/

