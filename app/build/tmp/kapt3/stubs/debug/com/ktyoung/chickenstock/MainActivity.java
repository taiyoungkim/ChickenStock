package com.ktyoung.chickenstock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0003R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ktyoung/chickenstock/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "()V", "currentNavController", "Landroidx/lifecycle/LiveData;", "Landroidx/navigation/NavController;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPreferenceStartFragment", "", "caller", "Landroidx/preference/PreferenceFragmentCompat;", "pref", "Landroidx/preference/Preference;", "onRestoreInstanceState", "onSupportNavigateUp", "setUpBottomNavigationBar", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    private androidx.lifecycle.LiveData<androidx.navigation.NavController> currentNavController;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void setUpBottomNavigationBar() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPreferenceStartFragment(@org.jetbrains.annotations.Nullable()
    androidx.preference.PreferenceFragmentCompat caller, @org.jetbrains.annotations.Nullable()
    androidx.preference.Preference pref) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}