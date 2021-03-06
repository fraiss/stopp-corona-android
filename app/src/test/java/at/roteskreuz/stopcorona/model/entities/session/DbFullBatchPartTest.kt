package at.roteskreuz.stopcorona.model.entities.session

import org.junit.Test

class DbFullBatchPartTest {

    @Test
    fun `just a random test to make sure sortedBy sorts ascending`() {
        val part1 = DbFullBatchPart(
            sessionId = 1,
            batchNumber = 1,
            intervalStart = 1,
            fileName = "/"
        )
        val part2 = DbFullBatchPart(
            sessionId = 1,
            batchNumber = 2,
            intervalStart = 1,
            fileName = "/"
        )
        val unsortedList = arrayListOf(part2, part1)
        val sorted = unsortedList.sortedBy { it.batchNumber }
        assert(sorted[0].batchNumber < sorted[1].batchNumber) { "sorting failed" }
    }
}