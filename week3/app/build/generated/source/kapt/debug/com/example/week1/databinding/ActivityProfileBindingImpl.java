package com.example.week1.databinding;
import com.example.week1.R;
import com.example.week1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileBindingImpl extends ActivityProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.editTextFullName, 4);
        sViewsWithIds.put(R.id.editTextEmail, 5);
        sViewsWithIds.put(R.id.editTextPhoneNo, 6);
        sViewsWithIds.put(R.id.Fullname, 7);
        sViewsWithIds.put(R.id.Email, 8);
        sViewsWithIds.put(R.id.Phone, 9);
        sViewsWithIds.put(R.id.imageView6, 10);
        sViewsWithIds.put(R.id.imageView8, 11);
        sViewsWithIds.put(R.id.imageView7, 12);
        sViewsWithIds.put(R.id.imageButton2, 13);
        sViewsWithIds.put(R.id.imageView10, 14);
        sViewsWithIds.put(R.id.name_profile, 15);
        sViewsWithIds.put(R.id.textView15, 16);
        sViewsWithIds.put(R.id.imageView9, 17);
        sViewsWithIds.put(R.id.imageButton3, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.ImageButton) bindings[18]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            );
        this.EmailDescription.setTag(null);
        this.FullNameDescription.setTag(null);
        this.PhoneDescription.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.user == variableId) {
            setUser((com.example.week1.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.example.week1.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
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
        com.example.week1.User user = mUser;
        java.lang.String userName = null;
        java.lang.String userEmail = null;
        java.lang.String userPhoneNumber = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.name
                    userName = user.getName();
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.phoneNumber
                    userPhoneNumber = user.getPhoneNumber();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.EmailDescription, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.FullNameDescription, userName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.PhoneDescription, userPhoneNumber);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}