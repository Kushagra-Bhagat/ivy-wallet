package com.ivy.domain.model.primitive

import arrow.core.raise.Raise
import arrow.core.raise.ensure
import com.ivy.domain.exact.Exact

@JvmInline
value class NotBlankTrimmedString private constructor(val value: String) {
    companion object : Exact<String, NotBlankTrimmedString> {
        override val name = "NotBlankTrimmedString"

        override fun Raise<String>.spec(raw: String): NotBlankTrimmedString {
            val trimmed = raw.trim()
            ensure(trimmed.isNotBlank()) { "Cannot be blank" }
            return NotBlankTrimmedString(trimmed)
        }
    }
}