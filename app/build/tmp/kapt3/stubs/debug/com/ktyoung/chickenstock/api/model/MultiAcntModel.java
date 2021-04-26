package com.ktyoung.chickenstock.api.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\bL\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u001aH\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\u00ef\u0001\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u00c6\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010i\u001a\u00020\u001aH\u00d6\u0001J\t\u0010j\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b\'\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001d\"\u0004\bK\u0010\u001fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001d\"\u0004\bM\u0010\u001f\u00a8\u0006k"}, d2 = {"Lcom/ktyoung/chickenstock/api/model/MultiAcntModel;", "", "rcept_no", "", "bsns_year", "corp_code", "stock_code", "reprt_code", "account_nm", "fs_div", "fs_nm", "sj_div", "sj_nm", "thstrm_nm", "thstrm_dt", "thstrm_amount", "thstrm_amount2", "thstrm_add_amount", "frmtrm_nm", "frmtrm_dt", "frmtrm_amount", "frmtrm_add_amount", "bfefrmtrm_nm", "bfefrmtrm_dt", "bfefrmtrm_amount", "ord", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAccount_nm", "()Ljava/lang/String;", "setAccount_nm", "(Ljava/lang/String;)V", "getBfefrmtrm_amount", "setBfefrmtrm_amount", "getBfefrmtrm_dt", "setBfefrmtrm_dt", "getBfefrmtrm_nm", "setBfefrmtrm_nm", "getBsns_year", "setBsns_year", "getCorp_code", "setCorp_code", "getFrmtrm_add_amount", "setFrmtrm_add_amount", "getFrmtrm_amount", "setFrmtrm_amount", "getFrmtrm_dt", "setFrmtrm_dt", "getFrmtrm_nm", "setFrmtrm_nm", "getFs_div", "setFs_div", "getFs_nm", "setFs_nm", "getOrd", "()I", "setOrd", "(I)V", "getRcept_no", "setRcept_no", "getReprt_code", "setReprt_code", "getSj_div", "setSj_div", "getSj_nm", "setSj_nm", "getStock_code", "setStock_code", "getThstrm_add_amount", "setThstrm_add_amount", "getThstrm_amount", "setThstrm_amount", "getThstrm_amount2", "setThstrm_amount2", "getThstrm_dt", "setThstrm_dt", "getThstrm_nm", "setThstrm_nm", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class MultiAcntModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String rcept_no;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bsns_year;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String corp_code;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stock_code;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String reprt_code;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String account_nm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fs_div;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fs_nm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sj_div;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sj_nm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String thstrm_nm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String thstrm_dt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String thstrm_amount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String thstrm_amount2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String thstrm_add_amount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String frmtrm_nm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String frmtrm_dt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String frmtrm_amount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String frmtrm_add_amount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bfefrmtrm_nm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bfefrmtrm_dt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bfefrmtrm_amount;
    private int ord;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRcept_no() {
        return null;
    }
    
    public final void setRcept_no(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBsns_year() {
        return null;
    }
    
    public final void setBsns_year(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorp_code() {
        return null;
    }
    
    public final void setCorp_code(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStock_code() {
        return null;
    }
    
    public final void setStock_code(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReprt_code() {
        return null;
    }
    
    public final void setReprt_code(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccount_nm() {
        return null;
    }
    
    public final void setAccount_nm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFs_div() {
        return null;
    }
    
    public final void setFs_div(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFs_nm() {
        return null;
    }
    
    public final void setFs_nm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSj_div() {
        return null;
    }
    
    public final void setSj_div(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSj_nm() {
        return null;
    }
    
    public final void setSj_nm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThstrm_nm() {
        return null;
    }
    
    public final void setThstrm_nm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThstrm_dt() {
        return null;
    }
    
    public final void setThstrm_dt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThstrm_amount() {
        return null;
    }
    
    public final void setThstrm_amount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThstrm_amount2() {
        return null;
    }
    
    public final void setThstrm_amount2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThstrm_add_amount() {
        return null;
    }
    
    public final void setThstrm_add_amount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrmtrm_nm() {
        return null;
    }
    
    public final void setFrmtrm_nm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrmtrm_dt() {
        return null;
    }
    
    public final void setFrmtrm_dt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrmtrm_amount() {
        return null;
    }
    
    public final void setFrmtrm_amount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrmtrm_add_amount() {
        return null;
    }
    
    public final void setFrmtrm_add_amount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBfefrmtrm_nm() {
        return null;
    }
    
    public final void setBfefrmtrm_nm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBfefrmtrm_dt() {
        return null;
    }
    
    public final void setBfefrmtrm_dt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBfefrmtrm_amount() {
        return null;
    }
    
    public final void setBfefrmtrm_amount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getOrd() {
        return 0;
    }
    
    public final void setOrd(int p0) {
    }
    
    public MultiAcntModel(@org.jetbrains.annotations.NotNull()
    java.lang.String rcept_no, @org.jetbrains.annotations.NotNull()
    java.lang.String bsns_year, @org.jetbrains.annotations.NotNull()
    java.lang.String corp_code, @org.jetbrains.annotations.NotNull()
    java.lang.String stock_code, @org.jetbrains.annotations.NotNull()
    java.lang.String reprt_code, @org.jetbrains.annotations.NotNull()
    java.lang.String account_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String fs_div, @org.jetbrains.annotations.NotNull()
    java.lang.String fs_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String sj_div, @org.jetbrains.annotations.NotNull()
    java.lang.String sj_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_dt, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_amount2, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_add_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_dt, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_add_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String bfefrmtrm_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String bfefrmtrm_dt, @org.jetbrains.annotations.NotNull()
    java.lang.String bfefrmtrm_amount, int ord) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktyoung.chickenstock.api.model.MultiAcntModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String rcept_no, @org.jetbrains.annotations.NotNull()
    java.lang.String bsns_year, @org.jetbrains.annotations.NotNull()
    java.lang.String corp_code, @org.jetbrains.annotations.NotNull()
    java.lang.String stock_code, @org.jetbrains.annotations.NotNull()
    java.lang.String reprt_code, @org.jetbrains.annotations.NotNull()
    java.lang.String account_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String fs_div, @org.jetbrains.annotations.NotNull()
    java.lang.String fs_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String sj_div, @org.jetbrains.annotations.NotNull()
    java.lang.String sj_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_dt, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_amount2, @org.jetbrains.annotations.NotNull()
    java.lang.String thstrm_add_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_dt, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String frmtrm_add_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String bfefrmtrm_nm, @org.jetbrains.annotations.NotNull()
    java.lang.String bfefrmtrm_dt, @org.jetbrains.annotations.NotNull()
    java.lang.String bfefrmtrm_amount, int ord) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}