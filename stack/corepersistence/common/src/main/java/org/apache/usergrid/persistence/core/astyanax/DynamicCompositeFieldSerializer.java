/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.usergrid.persistence.core.astyanax;


import com.netflix.astyanax.model.DynamicComposite;


/**
 * This interface is for re-using multiple components in a composite. 
 * Implementing this allows many different types to be serialized 
 * together in a single composite
 *
 * @author tnine
 */
public interface DynamicCompositeFieldSerializer<K> {

    /**
     * Add this to the composite
     * @param composite The composite to add data to
     * @param value The value to write
     */
    public void toComposite( DynamicComposite composite, K value );


    /**
     * Create an instance from the composite
     * @param composite The dynamic composite containing the data that iterates each element
     * @param startIndex The start index
     */
    public K fromComposite( DynamicComposite composite, int startIndex);
}
