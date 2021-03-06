/*
 * Copyright 2020 link-time GmbH
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.linkedplanet.lib.graphlib

/**
 * Universal Identity function
 */
fun <A> A.id(): A = this

fun <A> List<A>.orEmptyList() =
        when(this) {
            null -> emptyList()
            else -> this
        }

fun Boolean?.orFalse() =
        when(this) {
            null -> false
            else -> this
        }
