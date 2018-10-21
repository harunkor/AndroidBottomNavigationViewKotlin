package tr.com.harunkor.androidbottomnavigationviewkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView





class FragmentHome : Fragment() {

    var fragment_home_view: View? = null
    var txt_Home: TextView?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       fragment_home_view=inflater.inflate(R.layout.fragment_home, container, false)

        txt_Home= fragment_home_view?.findViewById(R.id.home_txt)

        txt_Home?.setText("HOME FRAGMENT")






        return  fragment_home_view
    }


}
