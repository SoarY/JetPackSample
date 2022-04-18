package com.soar.jetpacksample.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.soar.jetpacksample.R
import com.soar.jetpacksample.ui.activity.MainActivity

/**
 * NAME：YONG_
 * Created at: 2022/4/17 23
 * Describe:
 */
class LoginFragment : Fragment() {

 lateinit var mAccount: EditText
 lateinit var mLogin: Button

 override fun onCreateView(
  inflater: LayoutInflater,
  container: ViewGroup?,
  savedInstanceState: Bundle?
 ): View? {
  return inflater.inflate(R.layout.fragment_login,container,false)
 }

 override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
  super.onViewCreated(view, savedInstanceState)

  mAccount = view.findViewById(R.id.et_account)
  mLogin = view.findViewById(R.id.btn_login)

  val name=arguments?.getString("name")
  mAccount.setText(name)

  mLogin.setOnClickListener {
   val intent = Intent(context, MainActivity::class.java)
   context?.startActivity(intent)
  }
 }
}