package com.ktyoung.chickenstock.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ktyoung/chickenstock/util/YearPickerDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "listener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "", "Companion", "app_debug"})
public final class YearPickerDialog extends androidx.fragment.app.DialogFragment {
    private android.app.DatePickerDialog.OnDateSetListener listener;
    private static final int MAX_YEAR = 2099;
    @org.jetbrains.annotations.NotNull()
    public static final com.ktyoung.chickenstock.util.YearPickerDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    android.app.DatePickerDialog.OnDateSetListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public YearPickerDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ktyoung/chickenstock/util/YearPickerDialog$Companion;", "", "()V", "MAX_YEAR", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}