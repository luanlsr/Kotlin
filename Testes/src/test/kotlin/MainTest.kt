import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertFalse(countXO("xxooo"))}
        )
    }

    @Test
    @Disabled
    fun naoImplementado(){

    }

    @Test
    fun vaiFalhar(){
        fail("não posso terminar os testes sem esse método.")
    }

    @Test
    fun assumptions(){
        Assumptions.assumeTrue(countXO("xxoo"))
        // o de baixo roda dependendo do de cima
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> { abc2() }
        // o de baixo roda dependendo do de cima
    }
}