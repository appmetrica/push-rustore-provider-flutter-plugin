import 'package:appmetrica_push_rustore_provider_plugin/src/rustore_push_provider.dart';
import 'package:flutter_test/flutter_test.dart';

void main() {
  test('RuStorePushProvider.nativeFactoryClass', () {
    expect(
      RuStorePushProvider().nativeFactoryClass,
      'io.appmetrica.analytics.push.rustore.flutter.RuStorePushProviderFactory',
    );
  });
}
