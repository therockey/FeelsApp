package com.pwr.feels.data.repository

import org.junit.Test

class TestRepositoryTest {
    @Test
    fun getTest() {
        val testRepository = TestRepository()
        assert(testRepository.getTest() == "Test")
    }
}