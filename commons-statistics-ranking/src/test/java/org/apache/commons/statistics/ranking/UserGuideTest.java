/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.statistics.ranking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test code used in the ranking section of the user guide.
 */
class UserGuideTest {
    @Test
    void testRanking() {
        NaturalRanking ranking = new NaturalRanking();
        Assertions.assertArrayEquals(new double[] {1, 2, 3, 4}, ranking.apply(new double[] {5, 6, 7, 8}));
        Assertions.assertArrayEquals(new double[] {4, 1, 3, 2}, ranking.apply(new double[] {8, 5, 7, 6}));
        Assertions.assertArrayEquals(new double[] {2.5, 1, 2.5, 4}, ranking.apply(new double[] {6, 5, 6, 7}));
    }
}
