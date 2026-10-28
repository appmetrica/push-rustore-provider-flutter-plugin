package io.appmetrica.analytics.push.rustore.flutter

import org.assertj.core.api.Assertions.assertThat
import io.appmetrica.analytics.push.flutter.PushProviderFactory
import org.junit.Test

class RuStorePushProviderFactoryTest {

    @Test
    fun `factory implements PushProviderFactory`() {
        // RuStorePushServiceControllerProvider pulls RuStore SDK classes that are
        // not available on the unit-test classpath; cover factory wiring only.
        val factory: PushProviderFactory = RuStorePushProviderFactory()
        assertThat(factory).isInstanceOf(RuStorePushProviderFactory::class.java)
    }
}
