package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {

    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Dr. Md. Saiful Ahsan Rana", "Hospital Address: Mugda Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801711125150", "800"},
                    {"Doctor Name : Prof. Dr. Md. Siraj Uddin", "Hospital Address: Square Hospital, Dhaka", "Exp : 10yrs", "Mobile No:01711-921930", "1000"},
                    {"Doctor Name : Prof. Dr. Pradip Kumar Dutta", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 11yrs", "Mobile No:8809612247247", "800"},
                    {"Doctor Name : Dr. Ratan Kanti Saha", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 7yrs", "Mobile No:8801713998199", "900"},
                    {"Doctor Name : Dr. Munir Ahsan Khan", "Hospital Address: Bangabandhu Memorial Hospital, USTC, Chittagong", "Exp : 8yrs", "Mobile No:8801713998199", "800"},
                    {"Doctor Name : Dr. Saroj Kanti Chowdhury", "Chittagong Medical College & Hospital", "Exp : 5yrs", "Mobile No:8809613787810", "800"},
                    {"Doctor Name : Prof. Dr. Uzzwal Kanti Das", "Hospital Address: BGC Trust Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801755666969", "1200"},
                    {"Doctor Name : Dr. Md. Shahadat Hussain", "Hospital Address: Chevron Clinical Laboratory, Chittagong", "Exp : 9yrs", "Mobile No:8801755666969", "800"},
                    {"Doctor Name : Dr. Animesh Mallick", "Hospital Address: Shahjalal Diagnostic Clinic, Chittagong", "Exp : 6yrs", "Mobile No:8801819311367", "700"},
                    {"Doctor Name : Dr. Muhammad Shamsul Arefin", "Hospital Address: National Institute of Neurosciences & Hospital", "Exp : 15yrs", "Mobile No:01829448844", "1500"},

            };

    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Dr. Md. Saiful Ahsan Rana", "Hospital Address: Mugda Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801711125150", "800"},
                    {"Doctor Name : Prof. Dr. Md. Siraj Uddin", "Hospital Address: Square Hospital, Dhaka", "Exp : 10yrs", "Mobile No:01711-921930", "1000"},
                    {"Doctor Name : Prof. Dr. Pradip Kumar Dutta", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 11yrs", "Mobile No:8809612247247", "800"},
                    {"Doctor Name : Dr. Ratan Kanti Saha", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 7yrs", "Mobile No:8801713998199", "900"},
                    {"Doctor Name : Dr. Munir Ahsan Khan", "Hospital Address: Bangabandhu Memorial Hospital, USTC, Chittagong", "Exp : 8yrs", "Mobile No:8801713998199", "800"},
                    {"Doctor Name : Dr. Saroj Kanti Chowdhury", "Chittagong Medical College & Hospital", "Exp : 5yrs", "Mobile No:8809613787810", "800"},
                    {"Doctor Name : Prof. Dr. Uzzwal Kanti Das", "Hospital Address: BGC Trust Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801755666969", "1200"},
                    {"Doctor Name : Dr. Md. Shahadat Hussain", "Hospital Address: Chevron Clinical Laboratory, Chittagong", "Exp : 9yrs", "Mobile No:8801755666969", "800"},
                    {"Doctor Name : Dr. Animesh Mallick", "Hospital Address: Shahjalal Diagnostic Clinic, Chittagong", "Exp : 6yrs", "Mobile No:8801819311367", "700"},
                    {"Doctor Name : Dr. Muhammad Shamsul Arefin", "Hospital Address: National Institute of Neurosciences & Hospital", "Exp : 15yrs", "Mobile No:01829448844", "1500"},

            };

    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Dr. Md. Saiful Ahsan Rana", "Hospital Address: Mugda Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801711125150", "800"},
                    {"Doctor Name : Prof. Dr. Md. Siraj Uddin", "Hospital Address: Square Hospital, Dhaka", "Exp : 10yrs", "Mobile No:01711-921930", "1000"},
                    {"Doctor Name : Prof. Dr. Pradip Kumar Dutta", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 11yrs", "Mobile No:8809612247247", "800"},
                    {"Doctor Name : Dr. Ratan Kanti Saha", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 7yrs", "Mobile No:8801713998199", "900"},
                    {"Doctor Name : Dr. Munir Ahsan Khan", "Hospital Address: Bangabandhu Memorial Hospital, USTC, Chittagong", "Exp : 8yrs", "Mobile No:8801713998199", "800"},
                    {"Doctor Name : Dr. Saroj Kanti Chowdhury", "Chittagong Medical College & Hospital", "Exp : 5yrs", "Mobile No:8809613787810", "800"},
                    {"Doctor Name : Prof. Dr. Uzzwal Kanti Das", "Hospital Address: BGC Trust Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801755666969", "1200"},
                    {"Doctor Name : Dr. Md. Shahadat Hussain", "Hospital Address: Chevron Clinical Laboratory, Chittagong", "Exp : 9yrs", "Mobile No:8801755666969", "800"},
                    {"Doctor Name : Dr. Animesh Mallick", "Hospital Address: Shahjalal Diagnostic Clinic, Chittagong", "Exp : 6yrs", "Mobile No:8801819311367", "700"},
                    {"Doctor Name : Dr. Muhammad Shamsul Arefin", "Hospital Address: National Institute of Neurosciences & Hospital", "Exp : 15yrs", "Mobile No:01829448844", "1500"},

            };

    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Dr. Md. Saiful Ahsan Rana", "Hospital Address: Mugda Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801711125150", "800"},
                    {"Doctor Name : Prof. Dr. Md. Siraj Uddin", "Hospital Address: Square Hospital, Dhaka", "Exp : 10yrs", "Mobile No:01711-921930", "1000"},
                    {"Doctor Name : Prof. Dr. Pradip Kumar Dutta", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 11yrs", "Mobile No:8809612247247", "800"},
                    {"Doctor Name : Dr. Ratan Kanti Saha", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 7yrs", "Mobile No:8801713998199", "900"},
                    {"Doctor Name : Dr. Munir Ahsan Khan", "Hospital Address: Bangabandhu Memorial Hospital, USTC, Chittagong", "Exp : 8yrs", "Mobile No:8801713998199", "800"},
                    {"Doctor Name : Dr. Saroj Kanti Chowdhury", "Chittagong Medical College & Hospital", "Exp : 5yrs", "Mobile No:8809613787810", "800"},
                    {"Doctor Name : Prof. Dr. Uzzwal Kanti Das", "Hospital Address: BGC Trust Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801755666969", "1200"},
                    {"Doctor Name : Dr. Md. Shahadat Hussain", "Hospital Address: Chevron Clinical Laboratory, Chittagong", "Exp : 9yrs", "Mobile No:8801755666969", "800"},
                    {"Doctor Name : Dr. Animesh Mallick", "Hospital Address: Shahjalal Diagnostic Clinic, Chittagong", "Exp : 6yrs", "Mobile No:8801819311367", "700"},
                    {"Doctor Name : Dr. Muhammad Shamsul Arefin", "Hospital Address: National Institute of Neurosciences & Hospital", "Exp : 15yrs", "Mobile No:01829448844", "1500"},

            };

    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Dr. Md. Saiful Ahsan Rana", "Hospital Address: Mugda Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801711125150", "800"},
                    {"Doctor Name : Prof. Dr. Md. Siraj Uddin", "Hospital Address: Square Hospital, Dhaka", "Exp : 10yrs", "Mobile No:01711-921930", "1000"},
                    {"Doctor Name : Prof. Dr. Pradip Kumar Dutta", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 11yrs", "Mobile No:8809612247247", "800"},
                    {"Doctor Name : Dr. Ratan Kanti Saha", "Hospital Address: Max Hospital & Diagnostic, Chittagong", "Exp : 7yrs", "Mobile No:8801713998199", "900"},
                    {"Doctor Name : Dr. Munir Ahsan Khan", "Hospital Address: Bangabandhu Memorial Hospital, USTC, Chittagong", "Exp : 8yrs", "Mobile No:8801713998199", "800"},
                    {"Doctor Name : Dr. Saroj Kanti Chowdhury", "Chittagong Medical College & Hospital", "Exp : 5yrs", "Mobile No:8809613787810", "800"},
                    {"Doctor Name : Prof. Dr. Uzzwal Kanti Das", "Hospital Address: BGC Trust Medical College & Hospital", "Exp : 6yrs", "Mobile No:8801755666969", "1200"},
                    {"Doctor Name : Dr. Md. Shahadat Hussain", "Hospital Address: Chevron Clinical Laboratory, Chittagong", "Exp : 9yrs", "Mobile No:8801755666969", "800"},
                    {"Doctor Name : Dr. Animesh Mallick", "Hospital Address: Shahjalal Diagnostic Clinic, Chittagong", "Exp : 6yrs", "Mobile No:8801819311367", "700"},
                    {"Doctor Name : Dr. Muhammad Shamsul Arefin", "Hospital Address: National Institute of Neurosciences & Hospital", "Exp : 15yrs", "Mobile No:01829448844", "1500"},

            };

    TextView tv;
    Button btn;
    String[][] doctor_details={};
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewODTitle);
        btn= findViewById(R.id.buttonBMCartBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for(int i =0; i < doctor_details.length; i++) {
            item = new HashMap<String, String>();
            item.put("line1",doctor_details[i][0]);
            item.put("line2",doctor_details[i][1]);
            item.put("line3",doctor_details[i][2]);
            item.put("line4",doctor_details[i][3]);
            item.put("line5","Cons fee:"+doctor_details[i][4]+" ৳");
            list.add(item);
        }

        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
            );

        ListView lst = findViewById(R.id.listViewBMCart);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) { //i means postion and l means id
                Intent it = new Intent(DoctorDetailsActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);
            }
        });


    }
}