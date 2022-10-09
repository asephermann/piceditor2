package com.appexecutors.piceditor.databinding;
import com.appexecutors.piceditor.R;
import com.appexecutors.piceditor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCropRotateBindingImpl extends FragmentCropRotateBinding implements com.appexecutors.piceditor.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cropImageView, 4);
        sViewsWithIds.put(R.id.recycler_view_ratio, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCropRotateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentCropRotateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (com.theartofdev.edmodo.cropper.CropImageView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            );
        this.cancel.setTag(null);
        this.done.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rotate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 2);
        mCallback13 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 3);
        mCallback11 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 1);
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
        if (BR.fragment == variableId) {
            setFragment((com.appexecutors.piceditor.editorengine.actions.CropRotateFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.appexecutors.piceditor.editorengine.actions.CropRotateFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
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
        com.appexecutors.piceditor.editorengine.actions.CropRotateFragment fragment = mFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.cancel.setOnClickListener(mCallback11);
            this.done.setOnClickListener(mCallback13);
            this.rotate.setOnClickListener(mCallback12);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.editorengine.actions.CropRotateFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.rotateImage();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.editorengine.actions.CropRotateFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.doneCropping();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.editorengine.actions.CropRotateFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.cancel();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}