package mo.example.kotest

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class CalculatorTest : DescribeSpec({

    lateinit var calculator: Calculator

    beforeTest {
        calculator = Calculator()
    }

    context("addition") {
        describe("2 + 2") {
            it("should be 4") {
                calculator.add(2, 2) shouldBe 4
            }
        }
    }
})
