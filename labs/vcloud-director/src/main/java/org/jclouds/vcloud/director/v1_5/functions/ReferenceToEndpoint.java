/*
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.vcloud.director.v1_5.functions;

import java.net.URI;

import javax.inject.Singleton;

import org.jclouds.vcloud.director.v1_5.domain.Reference;

import com.google.common.base.Function;

/**
 * @author danikov
 */
@Singleton
public class ReferenceToEndpoint implements Function<Reference, URI> {
   
   @Override
   public URI apply(Reference from) {
      return from.getHref();
   }
}