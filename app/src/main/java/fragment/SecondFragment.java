package fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {
    private Button btnradius;
    private EditText txtrad;



    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        btnradius=view.findViewById(R.id.btnradius);
        txtrad=view.findViewById(R.id.txtrad);
        btnradius.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
    float Rad=Float.parseFloat(txtrad.getText().toString());
    float area= 3.14f * Rad * Rad;
        Toast.makeText(getActivity(),"Area of Circle is : "+ area,Toast.LENGTH_SHORT).show();


    }
}
