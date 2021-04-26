package com.ktyoung.chickenstock.databinding;
import com.ktyoung.chickenstock.R;
import com.ktyoung.chickenstock.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAcntBindingImpl extends ItemAcntBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAcntBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemAcntBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvFirst.setTag(null);
        this.tvSecond.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.multiAcntItem == variableId) {
            setMultiAcntItem((com.ktyoung.chickenstock.api.model.MultiAcntModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMultiAcntItem(@Nullable com.ktyoung.chickenstock.api.model.MultiAcntModel MultiAcntItem) {
        this.mMultiAcntItem = MultiAcntItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.multiAcntItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.ktyoung.chickenstock.api.model.MultiAcntModel multiAcntItem = mMultiAcntItem;
        java.lang.String multiAcntItemThstrmAmount2 = null;
        java.lang.String multiAcntItemAccountNm = null;
        java.lang.String multiAcntItemThstrmAmount = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (multiAcntItem != null) {
                    // read multiAcntItem.thstrm_amount2
                    multiAcntItemThstrmAmount2 = multiAcntItem.getThstrm_amount2();
                    // read multiAcntItem.account_nm
                    multiAcntItemAccountNm = multiAcntItem.getAccount_nm();
                    // read multiAcntItem.thstrm_amount
                    multiAcntItemThstrmAmount = multiAcntItem.getThstrm_amount();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFirst, multiAcntItemThstrmAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSecond, multiAcntItemThstrmAmount2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, multiAcntItemAccountNm);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): multiAcntItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}