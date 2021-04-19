package com.example.week1.databinding;
import com.example.week1.R;
import com.example.week1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignupBindingImpl extends ActivitySignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView5, 4);
        sViewsWithIds.put(R.id.tvSignIn, 5);
        sViewsWithIds.put(R.id.textView2, 6);
        sViewsWithIds.put(R.id.textView3, 7);
        sViewsWithIds.put(R.id.textView4, 8);
        sViewsWithIds.put(R.id.LoginButton, 9);
        sViewsWithIds.put(R.id.textView5, 10);
        sViewsWithIds.put(R.id.tvLogin, 11);
        sViewsWithIds.put(R.id.textView7, 12);
        sViewsWithIds.put(R.id.button2, 13);
        sViewsWithIds.put(R.id.button3, 14);
        sViewsWithIds.put(R.id.imageView, 15);
        sViewsWithIds.put(R.id.imageView3, 16);
        sViewsWithIds.put(R.id.imageView4, 17);
        sViewsWithIds.put(R.id.imageView2, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivitySignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[14]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            );
        this.editTextEmail.setTag(null);
        this.editTextTextPassword.setTag(null);
        this.editTextTextPersonName.setTag(null);
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
        if (BR.account == variableId) {
            setAccount((com.example.week1.Account) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccount(@Nullable com.example.week1.Account Account) {
        this.mAccount = Account;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.account);
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
        java.lang.String accountUsername = null;
        java.lang.String accountEmail = null;
        com.example.week1.Account account = mAccount;
        java.lang.String accountPassword = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (account != null) {
                    // read account.username
                    accountUsername = account.getUsername();
                    // read account.email
                    accountEmail = account.getEmail();
                    // read account.password
                    accountPassword = account.getPassword();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextEmail, accountEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextTextPassword, accountPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextTextPersonName, accountUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): account
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}