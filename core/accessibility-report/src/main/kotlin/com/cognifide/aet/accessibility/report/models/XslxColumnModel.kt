/*
 * AET
 *
 * Copyright (C) 2020 Cognifide Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.cognifide.aet.accessibility.report.models

enum class XslxColumnModel(val columnName: String) {
  ERROR_CODE("Error Code"),
  MESSAGE("Message"),
  PATH("Path"),
  URL("Url"),
  LINE_NUMBER("Line"),
  SNIPPET("Snippet"),
  SOLUTIONS("Solutions");

  companion object {
    private val items = listOf(*values())

    val itemsTotal = items.size

    fun forEach(consumer: (XslxColumnModel) -> Unit) {
      items.forEach(consumer)
    }
  }
}
