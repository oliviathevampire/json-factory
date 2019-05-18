package io.github.cottonmc.jsonfactory.tests.gens

import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.gens.DecoratedContentGenerator
import io.github.cottonmc.jsonfactory.gens.Gens
import io.github.cottonmc.jsonfactory.output.Output
import io.github.cottonmc.jsonfactory.output.prefixed
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import strikt.api.expectThat
import strikt.assertions.all

object DecoratedGenerators : Spek({
    Feature("Decorated generators") {
        Scenario("generating a decorated block model") {
            val id = Identifier("minecraft", "gravel")
            lateinit var outputs: List<Output>

            When("generating") {
                outputs = DecoratedContentGenerator(Gens.basicBlockModel) { _, outputs ->
                    outputs.map { it.prefixed("super") }
                }.generate(id)
            }

            Then("outputs should be decorated") {
                expectThat(outputs)
                    .all {
                        assertThat("output should be decorated") {
                            it.nameWrapper.prefix == "super"
                        }
                    }
            }
        }
    }
})
