package com.valmaraz.mvp.view;

import android.content.Context;

public interface BaseView {
    Context getContext();

    void showTemporaryMessage(String message);
}
