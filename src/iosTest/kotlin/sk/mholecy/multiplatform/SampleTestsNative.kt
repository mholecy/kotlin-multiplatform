package sk.mholecy.multiplatform

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsNative {
    @Test
    fun testHello() {
        assertTrue("iOS" in hello())
    }
}