package com.ktyoung.chickenstock.databinding;
import com.ktyoung.chickenstock.R;
import com.ktyoung.chickenstock.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCompareBindingImpl extends FragmentCompareBinding implements com.ktyoung.chickenstock.generated.callback.OnClickListener.Listener, com.ktyoung.chickenstock.generated.callback.OnItemClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.widget.AdapterView.OnItemClickListener mCallback6;
    @Nullable
    private final android.widget.AdapterView.OnItemClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener autoCompleteTextViewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.selectedText.getValue()
            //         is viewmodel.selectedText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(autoCompleteTextView);
            // localize variables for thread safety
            // viewmodel.selectedText.getValue()
            java.lang.String viewmodelSelectedTextGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.selectedText != null
            boolean viewmodelSelectedTextJavaLangObjectNull = false;
            // viewmodel.selectedText
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSelectedText = null;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSelectedText = viewmodel.getSelectedText();

                viewmodelSelectedTextJavaLangObjectNull = (viewmodelSelectedText) != (null);
                if (viewmodelSelectedTextJavaLangObjectNull) {




                    viewmodelSelectedText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener autoCompleteTextView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.selectedText2.getValue()
            //         is viewmodel.selectedText2.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(autoCompleteTextView2);
            // localize variables for thread safety
            // viewmodel.selectedText2.getValue()
            java.lang.String viewmodelSelectedText2GetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.selectedText2 != null
            boolean viewmodelSelectedText2JavaLangObjectNull = false;
            // viewmodel.selectedText2
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSelectedText2 = null;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSelectedText2 = viewmodel.getSelectedText2();

                viewmodelSelectedText2JavaLangObjectNull = (viewmodelSelectedText2) != (null);
                if (viewmodelSelectedText2JavaLangObjectNull) {




                    viewmodelSelectedText2.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener companyProfileGradeSpinnerandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.spinnerSelectedPosition.getValue()
            //         is viewmodel.spinnerSelectedPosition.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = companyProfileGradeSpinner.getSelectedItemPosition();
            // localize variables for thread safety
            // viewmodel.spinnerSelectedPosition
            androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelSpinnerSelectedPosition = null;
            // viewmodel.spinnerSelectedPosition != null
            boolean viewmodelSpinnerSelectedPositionJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.spinnerSelectedPosition.getValue()
            java.lang.Integer viewmodelSpinnerSelectedPositionGetValue = null;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSpinnerSelectedPosition = viewmodel.getSpinnerSelectedPosition();

                viewmodelSpinnerSelectedPositionJavaLangObjectNull = (viewmodelSpinnerSelectedPosition) != (null);
                if (viewmodelSpinnerSelectedPositionJavaLangObjectNull) {




                    viewmodelSpinnerSelectedPosition.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener reportCodeSpinnerandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.reposrtSelectedPosition.getValue()
            //         is viewmodel.reposrtSelectedPosition.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = reportCodeSpinner.getSelectedItemPosition();
            // localize variables for thread safety
            // viewmodel.reposrtSelectedPosition
            androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelReposrtSelectedPosition = null;
            // viewmodel.reposrtSelectedPosition.getValue()
            java.lang.Integer viewmodelReposrtSelectedPositionGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.reposrtSelectedPosition != null
            boolean viewmodelReposrtSelectedPositionJavaLangObjectNull = false;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelReposrtSelectedPosition = viewmodel.getReposrtSelectedPosition();

                viewmodelReposrtSelectedPositionJavaLangObjectNull = (viewmodelReposrtSelectedPosition) != (null);
                if (viewmodelReposrtSelectedPositionJavaLangObjectNull) {




                    viewmodelReposrtSelectedPosition.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener yearPickerandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.selectedYear.getValue()
            //         is viewmodel.selectedYear.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(yearPicker);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.selectedYear
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSelectedYear = null;
            // viewmodel.selectedYear.getValue()
            java.lang.String viewmodelSelectedYearGetValue = null;
            // viewmodel.selectedYear != null
            boolean viewmodelSelectedYearJavaLangObjectNull = false;
            // viewmodel
            com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSelectedYear = viewmodel.getSelectedYear();

                viewmodelSelectedYearJavaLangObjectNull = (viewmodelSelectedYear) != (null);
                if (viewmodelSelectedYearJavaLangObjectNull) {




                    viewmodelSelectedYear.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentCompareBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentCompareBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.AutoCompleteTextView) bindings[1]
            , (android.widget.AutoCompleteTextView) bindings[2]
            , (android.widget.Spinner) bindings[4]
            , (android.widget.ImageButton) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.Spinner) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.EditText) bindings[3]
            );
        this.autoCompleteTextView.setTag(null);
        this.autoCompleteTextView2.setTag(null);
        this.companyProfileGradeSpinner.setTag(null);
        this.compare.setTag(null);
        this.multiAcnt.setTag(null);
        this.reportCodeSpinner.setTag(null);
        this.rvItems.setTag(null);
        this.yearPicker.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.ktyoung.chickenstock.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.ktyoung.chickenstock.generated.callback.OnItemClickListener(this, 1);
        mCallback7 = new com.ktyoung.chickenstock.generated.callback.OnItemClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewmodel((com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel Viewmodel) {
        updateRegistration(6, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelReposrtSelectedPosition((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewmodelSpinnerSelectedPosition((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeViewmodelSelectedText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelSelectedText2((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelSelectedYear((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelAcntList((androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>>) object, fieldId);
            case 6 :
                return onChangeViewmodel((com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelReposrtSelectedPosition(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewmodelReposrtSelectedPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSpinnerSelectedPosition(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewmodelSpinnerSelectedPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSelectedText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelSelectedText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSelectedText2(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelSelectedText2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSelectedYear(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelSelectedYear, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAcntList(androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>> ViewmodelAcntList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelReposrtSelectedPosition = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelSpinnerSelectedPosition = null;
        java.lang.Integer viewmodelReposrtSelectedPositionGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelReposrtSelectedPositionGetValue = 0;
        java.lang.String viewmodelSelectedYearGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSelectedText = null;
        java.lang.String viewmodelSelectedText2GetValue = null;
        java.lang.Integer viewmodelSpinnerSelectedPositionGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSelectedText2 = null;
        java.lang.String viewmodelSelectedTextGetValue = null;
        java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel> viewmodelAcntListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSelectedYear = null;
        androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>> viewmodelAcntList = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelSpinnerSelectedPositionGetValue = 0;
        com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.reposrtSelectedPosition
                        viewmodelReposrtSelectedPosition = viewmodel.getReposrtSelectedPosition();
                    }
                    updateLiveDataRegistration(0, viewmodelReposrtSelectedPosition);


                    if (viewmodelReposrtSelectedPosition != null) {
                        // read viewmodel.reposrtSelectedPosition.getValue()
                        viewmodelReposrtSelectedPositionGetValue = viewmodelReposrtSelectedPosition.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.reposrtSelectedPosition.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelReposrtSelectedPositionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelReposrtSelectedPositionGetValue);
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.spinnerSelectedPosition
                        viewmodelSpinnerSelectedPosition = viewmodel.getSpinnerSelectedPosition();
                    }
                    updateLiveDataRegistration(1, viewmodelSpinnerSelectedPosition);


                    if (viewmodelSpinnerSelectedPosition != null) {
                        // read viewmodel.spinnerSelectedPosition.getValue()
                        viewmodelSpinnerSelectedPositionGetValue = viewmodelSpinnerSelectedPosition.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.spinnerSelectedPosition.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelSpinnerSelectedPositionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelSpinnerSelectedPositionGetValue);
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedText
                        viewmodelSelectedText = viewmodel.getSelectedText();
                    }
                    updateLiveDataRegistration(2, viewmodelSelectedText);


                    if (viewmodelSelectedText != null) {
                        // read viewmodel.selectedText.getValue()
                        viewmodelSelectedTextGetValue = viewmodelSelectedText.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedText2
                        viewmodelSelectedText2 = viewmodel.getSelectedText2();
                    }
                    updateLiveDataRegistration(3, viewmodelSelectedText2);


                    if (viewmodelSelectedText2 != null) {
                        // read viewmodel.selectedText2.getValue()
                        viewmodelSelectedText2GetValue = viewmodelSelectedText2.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedYear
                        viewmodelSelectedYear = viewmodel.getSelectedYear();
                    }
                    updateLiveDataRegistration(4, viewmodelSelectedYear);


                    if (viewmodelSelectedYear != null) {
                        // read viewmodel.selectedYear.getValue()
                        viewmodelSelectedYearGetValue = viewmodelSelectedYear.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.acntList
                        viewmodelAcntList = viewmodel.getAcntList();
                    }
                    updateLiveDataRegistration(5, viewmodelAcntList);


                    if (viewmodelAcntList != null) {
                        // read viewmodel.acntList.getValue()
                        viewmodelAcntListGetValue = viewmodelAcntList.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.autoCompleteTextView.setOnItemClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.autoCompleteTextView, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoCompleteTextViewandroidTextAttrChanged);
            this.autoCompleteTextView2.setOnItemClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.autoCompleteTextView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoCompleteTextView2androidTextAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.companyProfileGradeSpinner, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, companyProfileGradeSpinnerandroidSelectedItemPositionAttrChanged);
            this.compare.setOnClickListener(mCallback8);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.reportCodeSpinner, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, reportCodeSpinnerandroidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.yearPicker, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, yearPickerandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.autoCompleteTextView, viewmodelSelectedTextGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.autoCompleteTextView2, viewmodelSelectedText2GetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.companyProfileGradeSpinner, androidxDatabindingViewDataBindingSafeUnboxViewmodelSpinnerSelectedPositionGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.reportCodeSpinner, androidxDatabindingViewDataBindingSafeUnboxViewmodelReposrtSelectedPositionGetValue);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            com.ktyoung.chickenstock.util.BindingManagers.setBindItem2(this.rvItems, viewmodelAcntList);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.yearPicker, viewmodelSelectedYearGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {



            viewmodel.onCompare(compare.getResources().getString(R.string.dart_key));
        }
    }
    public final void _internalCallbackOnItemClick(int sourceId , android.widget.AdapterView callbackArg_0, android.view.View callbackArg_1, int callbackArg_2, long callbackArg_3) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.onItemClick(callbackArg_0, callbackArg_2);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.onItemClick2(callbackArg_0, callbackArg_2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.reposrtSelectedPosition
        flag 1 (0x2L): viewmodel.spinnerSelectedPosition
        flag 2 (0x3L): viewmodel.selectedText
        flag 3 (0x4L): viewmodel.selectedText2
        flag 4 (0x5L): viewmodel.selectedYear
        flag 5 (0x6L): viewmodel.acntList
        flag 6 (0x7L): viewmodel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}