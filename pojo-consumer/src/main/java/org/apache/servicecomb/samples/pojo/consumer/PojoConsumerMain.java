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
package org.apache.servicecomb.samples.pojo.consumer;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.provider.pojo.RpcReference;

import org.apache.servicecomb.samples.pojo.Compute;
import org.springframework.stereotype.Component;

import org.springframework.web.client.RestTemplate;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;


@Component
public class PojoConsumerMain {
  private static RestTemplate restTemplate=RestTemplateBuilder.create();
  public static void main(String[] args) throws InterruptedException {
    BeanUtils.init();

    while (1>0){
      System.out.println(sayHello("dasd"));
      Thread.sleep(5000);
    }

  }

  public static String sayHello(String name){

    String a = restTemplate.getForObject("cse://hello/provider/v0/hello?name=sdad",String.class);
    return a;
  }

}
