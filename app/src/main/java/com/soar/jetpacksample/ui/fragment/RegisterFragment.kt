package com.soar.jetpacksample.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.soar.jetpacksample.R

/**
 * NAME：YONG_
 * Created at: 2022/4/18 00
 * Describe:
 */
class RegisterFragment :Fragment() {
 override fun onCreateView(
  inflater: LayoutInflater,
  container: ViewGroup?,
  savedInstanceState: Bundle?
 ): View? {
  return inflater.inflate(R.layout.fragment_register, container, false)
 }

 override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
  super.onViewCreated(view, savedInstanceState)

  val mEmailEt:EditText = view.findViewById(R.id.et_email)

  mEmailEt.setText(arguments?.getString("EMAIL"))
 }
}