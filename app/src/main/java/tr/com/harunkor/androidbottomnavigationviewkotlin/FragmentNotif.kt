package tr.com.harunkor.androidbottomnavigationviewkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView





class FragmentNotif: Fragment() {

    var fragment_notif_view: View? = null
    var txt_notif: TextView?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragment_notif_view=inflater.inflate(R.layout.fragment_notif, container, false)

        txt_notif= fragment_notif_view?.findViewById(R.id.notif_txt)

        txt_notif?.setText("NATIFICATIONS FRAGMENT")






        return  fragment_notif_view
    }


}
