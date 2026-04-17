package io.appmetrica.analytics.push.rustore.flutter;

import android.app.Application;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.push.flutter.PushProviderFactory;
import io.appmetrica.analytics.push.provider.api.PushServiceControllerProvider;
import io.appmetrica.analytics.push.provider.rustore.RuStorePushServiceControllerProvider;

public class RuStorePushProviderFactory implements PushProviderFactory {

    @NonNull
    @Override
    public PushServiceControllerProvider create(Application application) {
        return new RuStorePushServiceControllerProvider(application);
    }
}
