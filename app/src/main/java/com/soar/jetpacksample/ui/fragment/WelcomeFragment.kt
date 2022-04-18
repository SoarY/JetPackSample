package com.soar.jetpacksample.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.soar.jetpacksample.R

/**
 * A simple [Fragment] subclass.
 *
 */
class WelcomeFragment : Fragment() {

    lateinit var btnLogin:View
    lateinit var btnRegister: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin=view.findViewById(R.id.btn_login)
        btnRegister = view.findViewById(R.id.btn_register)

        btnLogin.setOnClickListener{

            // 设置动画参数
            val navOption = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            // 参数设置
            val bundle = Bundle()
            bundle.putString("name","TeaOf")
            findNavController().navigate(R.id.login,bundle,navOption)
        }

        btnRegister.setOnClickListener {
            // 参数设置
            val bundle = Bundle()
            bundle.putString("EMAIL","TeaOf1995@Gamil.com")
            findNavController().navigate(R.id.register,bundle)
        }
    }
}
