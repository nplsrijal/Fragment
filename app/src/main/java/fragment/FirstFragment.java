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
public class FirstFragment extends Fragment implements  View.OnClickListener{
    private Button btncalculate;
    private EditText txt1,txt2;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);

        txt1=view.findViewById(R.id.txt1);
        txt2=view.findViewById(R.id.txt2);
        btncalculate=view.findViewById(R.id.btnsum);
        btncalculate.setOnClickListener(this);
        return  view;


    }

    @Override
    public void onClick(View v) {
        int First = Integer.parseInt(txt1.getText().toString());
        int Second = Integer.parseInt(txt2.getText().toString());
        int result = First + Second;
        Toast.makeText(getActivity(),"Sum is : "+ result,Toast.LENGTH_SHORT).show();


    }
}
