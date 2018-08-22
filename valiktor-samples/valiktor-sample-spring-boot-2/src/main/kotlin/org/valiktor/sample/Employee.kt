/*
 * Copyright 2018 https://www.valiktor.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.valiktor.sample

import java.time.LocalDate
import java.time.LocalTime
import javax.money.MonetaryAmount

data class Employee(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val email: String,
    val dateOfBirth: LocalDate,
    val salary: MonetaryAmount,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val company: Company,
    val dependents: List<Dependent>
)

data class Company(
    val name: String,
    val foundedDate: LocalDate
)

data class Dependent(
    val name: String,
    val age: Int
)