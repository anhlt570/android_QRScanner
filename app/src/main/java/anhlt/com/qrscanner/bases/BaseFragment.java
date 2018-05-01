package anhlt.com.qrscanner.bases;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import anhlt.com.qrscanner.MainActivity;
import anhlt.com.qrscanner.NavigationManager;

public abstract class BaseFragment extends Fragment {
    protected NavigationManager navigationManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getActivity() instanceof MainActivity) {
            navigationManager = ((MainActivity) getActivity()).navigationManager;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutResource(), container, false);
    }

    @LayoutRes
    public abstract int getLayoutResource();
}
