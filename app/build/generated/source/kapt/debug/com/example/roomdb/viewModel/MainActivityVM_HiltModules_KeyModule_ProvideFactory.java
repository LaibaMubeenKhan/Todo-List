// Generated by Dagger (https://dagger.dev).
package com.example.roomdb.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityVM_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static MainActivityVM_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(MainActivityVM_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final MainActivityVM_HiltModules_KeyModule_ProvideFactory INSTANCE = new MainActivityVM_HiltModules_KeyModule_ProvideFactory();
  }
}