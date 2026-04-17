import 'package:appmetrica_push_plugin/appmetrica_push_plugin.dart';

class RuStorePushProvider extends PushProvider {
  @override
  String get nativeFactoryClass => "io.appmetrica.analytics.push.rustore.flutter.RuStorePushProviderFactory";
}
