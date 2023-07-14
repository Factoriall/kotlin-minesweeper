package minesweeper2.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ColsTest : StringSpec({
    "높이의 값이 1보다 클 때 정상 생성 된다." {
        val col = Col(1)
        col.value shouldBe 1
    }

    "높이의 값은 0보다 커야 한다" {
        val exception = shouldThrow<IllegalArgumentException> { Col(0) }
        exception.message shouldBe "높이의 값은 0보다 커야 합니다."
    }
})
