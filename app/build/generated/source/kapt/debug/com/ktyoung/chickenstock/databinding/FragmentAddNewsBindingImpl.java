package com.ktyoung.chickenstock.databinding;
import com.ktyoung.chickenstock.R;
import com.ktyoung.chickenstock.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddNewsBindingImpl extends FragmentAddNewsBinding implements com.ktyoung.chickenstock.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_and_title, 8);
        sViewsWithIds.put(R.id.tv_or_title, 9);
        sViewsWithIds.put(R.id.tv_not_title, 10);
        sViewsWithIds.put(R.id.add_layout, 11);
        sViewsWithIds.put(R.id.or_layout, 12);
        sViewsWithIds.put(R.id.not_layout, 13);
        sViewsWithIds.put(R.id.tv_news_name, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etAddAndandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.etAnd.getValue()
            //         is viewmodel.etAnd.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etAddAnd);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.etAnd.getValue()
            java.lang.String viewmodelEtAndGetValue = null;
            // viewmodel.etAnd != null
            boolean viewmodelEtAndJavaLangObjectNull = false;
            // viewmodel.etAnd
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtAnd = null;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEtAnd = viewmodel.getEtAnd();

                viewmodelEtAndJavaLangObjectNull = (viewmodelEtAnd) != (null);
                if (viewmodelEtAndJavaLangObjectNull) {




                    viewmodelEtAnd.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etAddNotandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.etNot.getValue()
            //         is viewmodel.etNot.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etAddNot);
            // localize variables for thread safety
            // viewmodel.etNot.getValue()
            java.lang.String viewmodelEtNotGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.etNot
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtNot = null;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;
            // viewmodel.etNot != null
            boolean viewmodelEtNotJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEtNot = viewmodel.getEtNot();

                viewmodelEtNotJavaLangObjectNull = (viewmodelEtNot) != (null);
                if (viewmodelEtNotJavaLangObjectNull) {




                    viewmodelEtNot.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etAddOrandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.etOr.getValue()
            //         is viewmodel.etOr.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etAddOr);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.etOr
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtOr = null;
            // viewmodel.etOr.getValue()
            java.lang.String viewmodelEtOrGetValue = null;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;
            // viewmodel.etOr != null
            boolean viewmodelEtOrJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEtOr = viewmodel.getEtOr();

                viewmodelEtOrJavaLangObjectNull = (viewmodelEtOr) != (null);
                if (viewmodelEtOrJavaLangObjectNull) {




                    viewmodelEtOr.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNewsNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.etTitle.getValue()
            //         is viewmodel.etTitle.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNewsName);
            // localize variables for thread safety
            // viewmodel.etTitle != null
            boolean viewmodelEtTitleJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.etTitle.getValue()
            java.lang.String viewmodelEtTitleGetValue = null;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;
            // viewmodel.etTitle
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtTitle = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEtTitle = viewmodel.getEtTitle();

                viewmodelEtTitleJavaLangObjectNull = (viewmodelEtTitle) != (null);
                if (viewmodelEtTitleJavaLangObjectNull) {




                    viewmodelEtTitle.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentAddNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[7]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            );
        this.btnAddAnd.setTag(null);
        this.btnAddNot.setTag(null);
        this.btnAddOr.setTag(null);
        this.etAddAnd.setTag(null);
        this.etAddNot.setTag(null);
        this.etAddOr.setTag(null);
        this.etNewsName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.ktyoung.chickenstock.generated.callback.OnClickListener(this, 3);
        mCallback2 = new com.ktyoung.chickenstock.generated.callback.OnClickListener(this, 1);
        mCallback3 = new com.ktyoung.chickenstock.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.ktyoung.chickenstock.viewmodel.AddNewsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.ktyoung.chickenstock.viewmodel.AddNewsViewModel Viewmodel) {
        updateRegistration(3, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelEtOr((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelEtNot((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelEtAnd((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodel((com.ktyoung.chickenstock.viewmodel.AddNewsViewModel) object, fieldId);
            case 4 :
                return onChangeViewmodelEtTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelEtOr(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelEtOr, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelEtNot(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelEtNot, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelEtAnd(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelEtAnd, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(com.ktyoung.chickenstock.viewmodel.AddNewsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelEtTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelEtTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
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
        java.lang.String viewmodelEtTitleGetValue = null;
        java.lang.String viewmodelEtOrGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtOr = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtNot = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtAnd = null;
        java.lang.String viewmodelEtNotGetValue = null;
        java.lang.String viewmodelEtAndGetValue = null;
        com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEtTitle = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.etOr
                        viewmodelEtOr = viewmodel.getEtOr();
                    }
                    updateLiveDataRegistration(0, viewmodelEtOr);


                    if (viewmodelEtOr != null) {
                        // read viewmodel.etOr.getValue()
                        viewmodelEtOrGetValue = viewmodelEtOr.getValue();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.etNot
                        viewmodelEtNot = viewmodel.getEtNot();
                    }
                    updateLiveDataRegistration(1, viewmodelEtNot);


                    if (viewmodelEtNot != null) {
                        // read viewmodel.etNot.getValue()
                        viewmodelEtNotGetValue = viewmodelEtNot.getValue();
                    }
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.etAnd
                        viewmodelEtAnd = viewmodel.getEtAnd();
                    }
                    updateLiveDataRegistration(2, viewmodelEtAnd);


                    if (viewmodelEtAnd != null) {
                        // read viewmodel.etAnd.getValue()
                        viewmodelEtAndGetValue = viewmodelEtAnd.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.etTitle
                        viewmodelEtTitle = viewmodel.getEtTitle();
                    }
                    updateLiveDataRegistration(4, viewmodelEtTitle);


                    if (viewmodelEtTitle != null) {
                        // read viewmodel.etTitle.getValue()
                        viewmodelEtTitleGetValue = viewmodelEtTitle.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnAddAnd.setOnClickListener(mCallback2);
            this.btnAddNot.setOnClickListener(mCallback4);
            this.btnAddOr.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAddAnd, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etAddAndandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAddNot, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etAddNotandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAddOr, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etAddOrandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNewsName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNewsNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAddAnd, viewmodelEtAndGetValue);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAddNot, viewmodelEtNotGetValue);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAddOr, viewmodelEtOrGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNewsName, viewmodelEtTitleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onAddNotClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onAddAndClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.ktyoung.chickenstock.viewmodel.AddNewsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onAddOrClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.etOr
        flag 1 (0x2L): viewmodel.etNot
        flag 2 (0x3L): viewmodel.etAnd
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): viewmodel.etTitle
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}