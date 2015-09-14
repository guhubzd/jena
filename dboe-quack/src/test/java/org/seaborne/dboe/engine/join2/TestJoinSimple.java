/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  See the NOTICE file distributed with this work for additional
 *  information regarding copyright ownership.
 */

package org.seaborne.dboe.engine.join2;

import org.apache.jena.sparql.algebra.Table ;
import org.apache.jena.sparql.engine.QueryIterator ;
import org.apache.jena.sparql.engine.ref.TableJoin ;
import org.apache.jena.sparql.expr.ExprList ;
import org.seaborne.dboe.engine.JoinKey ;

public class TestJoinSimple extends AbstractTestInnerJoin {

    @Override
    public QueryIterator join(JoinKey joinKey, Table left, Table right, ExprList conditions) {
        return TableJoin.join(left.iterator(null), right, null, null) ;
    }

}

