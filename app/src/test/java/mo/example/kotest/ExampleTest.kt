package mo.example.kotest

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ExampleTest : DescribeSpec({

    context("addition") {
        describe("2 + 2") {
            it("should be 4") {
                2 + 2 shouldBe 4
            }
        }
    }
})
