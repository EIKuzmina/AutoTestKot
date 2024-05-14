import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun cardBankMast() {
        var amountd = 2000
        var amountm = 78000
        val percent = 100
        val holdM = 0.6
        val bet = 20
        val betM = 300
        val limitMast = 75_000
        val cardMast = "Mastercard"

        val transfer = cardBank(cardMast, amountd, amountm)

        assertEquals(32, transfer)
    }
    @Test
    fun cardBankMastM() {
        var amountd = 20000
        var amountm = 15000
        val percent = 100
        val holdM = 0.6
        val bet = 20
        val betM = 300
        val limitMast = 75_000
        val cardMast = "Mastercard"

        val transfer = cardBank(cardMast, amountd, amountm)

        assertEquals(0, transfer)
    }
    @Test
    fun cardBankMastMa() {
        var amountd = 140000
        var amountm = 60000
        val percent = 100
        val holdM = 0.6
        val bet = 20
        val betM = 300
        val limitMast = 75_000
        val cardMast = "Mastercard"

        val transfer = cardBank(cardMast, amountd, amountm)

        assertEquals(770, transfer)
    }
    @Test
    fun cardBankcardMaest() {
        var amountd = 200
        var amountm = 0
        val percent = 100
        val holdM = 0.6
        val bet = 20
        val betM = 300
        val limitMast = 75_000
        val cardMaest = "Maestro"

        val transfer = cardBank(cardMaest, amountd, amountm)

        assertEquals(21, transfer)
    }
    @Test
    fun cardBankVisa() {
        var amountd = 1000
        val percent = 100
        val holdV = 0.75
        val minComission = 35
        val cardVisa = "Visa"

        val transfer = cardBank(cardVisa, amountd)

        assertEquals(35, transfer)
    }
    @Test
    fun cardBankMir() {
        var amountd = 10000
        val percent = 100
        val holdV = 0.75
        val minComission = 35
        val cardMir = "Mir"

        val transfer = cardBank(cardMir, amountd)

        assertEquals(75, transfer)
    }
    @Test
    fun cardBankVK() {
        var amountd = 350
        var amountm = 30000
        val cardVK = "VK Pay"

        val transfer = cardBank(cardVK, amountd, amountm)

        assertEquals(0, transfer)
    }
    @Test
    fun cardBankNo() {
        var amountd = 2000
        var amountm = 10000
        val cardMast = "Mastercard"

        val transfer = cardBank("card", amountd, amountm)

        assertEquals("Такой карты не существует", transfer)
    }
}