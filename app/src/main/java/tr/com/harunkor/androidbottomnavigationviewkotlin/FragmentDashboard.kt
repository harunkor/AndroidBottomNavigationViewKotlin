package tr.com.harunkor.androidbottomnavigationviewkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView





class FragmentDashboard : Fragment() {

    var fragment_dasboard_view: View? = null
    var txt_dasboard: TextView?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragment_dasboard_view=inflater.inflate(R.layout.fragment_dasboard, container, false)

        txt_dasboard= fragment_dasboard_view?.findViewById(R.id.dasboard_txt)

        txt_dasboard?.setText("DASHBOARD FRAGMENT")






        return  fragment_dasboard_view
    }


}
