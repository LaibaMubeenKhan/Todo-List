// Generated by Dagger (https://dagger.dev).
package com.example.roomdb.activities;

import com.example.roomdb.singleton.RingAlarm;
import com.example.roomdb.singleton.SingletonHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpdateActivity_MembersInjector implements MembersInjector<UpdateActivity> {
  private final Provider<SingletonHelper> singletonHelperProvider;

  private final Provider<RingAlarm> ringAlarmProvider;

  public UpdateActivity_MembersInjector(Provider<SingletonHelper> singletonHelperProvider,
      Provider<RingAlarm> ringAlarmProvider) {
    this.singletonHelperProvider = singletonHelperProvider;
    this.ringAlarmProvider = ringAlarmProvider;
  }

  public static MembersInjector<UpdateActivity> create(
      Provider<SingletonHelper> singletonHelperProvider, Provider<RingAlarm> ringAlarmProvider) {
    return new UpdateActivity_MembersInjector(singletonHelperProvider, ringAlarmProvider);
  }

  @Override
  public void injectMembers(UpdateActivity instance) {
    injectSingletonHelper(instance, singletonHelperProvider.get());
    injectRingAlarm(instance, ringAlarmProvider.get());
  }

  @InjectedFieldSignature("com.example.roomdb.activities.UpdateActivity.singletonHelper")
  public static void injectSingletonHelper(UpdateActivity instance,
      SingletonHelper singletonHelper) {
    instance.singletonHelper = singletonHelper;
  }

  @InjectedFieldSignature("com.example.roomdb.activities.UpdateActivity.ringAlarm")
  public static void injectRingAlarm(UpdateActivity instance, RingAlarm ringAlarm) {
    instance.ringAlarm = ringAlarm;
  }
}