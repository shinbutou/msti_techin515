// Generated by view binder compiler. Do not edit!
package com.google.firebase.codelab.friendlychat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.firebase.codelab.friendlychat.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MessageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView messageTextView;

  @NonNull
  public final ImageView messengerImageView;

  @NonNull
  public final TextView messengerTextView;

  private MessageBinding(@NonNull ConstraintLayout rootView, @NonNull TextView messageTextView,
      @NonNull ImageView messengerImageView, @NonNull TextView messengerTextView) {
    this.rootView = rootView;
    this.messageTextView = messageTextView;
    this.messengerImageView = messengerImageView;
    this.messengerTextView = messengerTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MessageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.messageTextView;
      TextView messageTextView = ViewBindings.findChildViewById(rootView, id);
      if (messageTextView == null) {
        break missingId;
      }

      id = R.id.messengerImageView;
      ImageView messengerImageView = ViewBindings.findChildViewById(rootView, id);
      if (messengerImageView == null) {
        break missingId;
      }

      id = R.id.messengerTextView;
      TextView messengerTextView = ViewBindings.findChildViewById(rootView, id);
      if (messengerTextView == null) {
        break missingId;
      }

      return new MessageBinding((ConstraintLayout) rootView, messageTextView, messengerImageView,
          messengerTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}