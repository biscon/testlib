package dk.ufst.libraries.testlib

class TestSdk(private val guidGenerator: GuidGenerator) {
    fun generateGuid(): String {
        return guidGenerator.generate()
    }
}