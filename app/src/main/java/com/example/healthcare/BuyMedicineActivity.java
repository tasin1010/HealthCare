package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class BuyMedicineActivity extends AppCompatActivity {

    private String[][] packages =
            {
                    {"Napa500 mg","", "", "", "1"},
                    {"Entacyd Plus200 ml","", "", "", "72"},
                    {"Alben10 ml","", "", "", "21"},
                    {"Exworm200 mg/5 ml","", "", "", "14"},
                    {"BionimGS 100","", "", "", "650"},
                    {"Huggies Dry Pant Diaper - MalaysianL SIZE 9-14 KG","", "", "", "1450"},
                    {"Hexisol250 ml","", "", "", "117"},
                    {"Sergel20 mg","", "", "", "7"},
                    {"Accu-Chek Instant50","", "", "", "1330"},

            };

    private String[] package_details = {
            "Napa is indicated for fever, common cold and influenza, headache, toothache, earache,\n"+
                    "bodyache, myalgia, neuralgia, dysmenorrhoea, sprains, colic pain, back pain, post-operative pain, \n" +
                    "postpartum pain, inflammatory pain and post vaccination pain in children. It is also indicated for rheumatic & osteoarthritic pain and stiffness of joints.",
            "This is indicated for symptomatic relief of hyperacidity associated with the peptic ulcer, \n" +
                    "gastritis, peptic oesophagitis, gastric hyperacidity, heartburn, sour stomach or hiatus hernia. It is effective in the prevention of stress ulceration and GI bleeding.",
            "Alben is indicated in single and mixed infestations of- Hookworm (Ancylostoma, Necator) Roundworm (Ascaris) Threadworm (Enterobius) \n" +
                    "Whipworm (Trichuris) Strongyloides Tapeworm Opisthorchi Hydatid.",
            "Exworm is indicated in single and mixed infestations of- Hookworm (Ancylostoma, Necator) Roundworm (Ascaris) Threadworm (Enterobius) \n" +
                    "Whipworm (Trichuris) Strongyloides Tapeworm Opisthorchi Hydatid.",

            "VivaCheck Laboratories Inc",
            "Baby Diaper",
            "For the disinfection of clean and intact skin. For pre-operative surgical hand disinfection, \n" +
                    "hand disinfection on the ward prior to aseptic procedures or after handling contaminated materials.\n " +
                    "For disinfection of the patients’ skin prior to surgery or other invasive procedures",
            "Esomeprazole is indicated: To alleviate GERD-related symptoms such as persistent heartburn and others. \n" +
                    "In order to treat erosive esophagitis. To maintain the erosive esophagitis's ability to recover.",
            "Novartis (Bangladesh) Ltd."


    };

    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;
    Button btnBack,btnGoToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine);

        lst = findViewById(R.id.listViewBMCart);
        btnBack = findViewById(R.id.buttonBMCartBack);
        btnGoToCart = findViewById(R.id.buttonBMCCartCheckout);

        btnGoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyMedicineActivity.this,CartBuyMedicineActivity.class));
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyMedicineActivity.this,HomeActivity.class));
            }
        });

        list = new ArrayList();
        for(int i =0; i<packages.length;i++) {
            item = new HashMap<String,String>();
            item.put("line1",packages[i][0]);
            item.put("line2",packages[i][1]);
            item.put("line3",packages[i][2]);
            item.put("line4",packages[i][3]);
            item.put("line5","Price : "+packages[i][4]+"৳");
            list.add(item);
        }

        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
        );
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(BuyMedicineActivity.this,BuyMedicineDetailsActivity.class);
                it.putExtra("text1",packages[position][0]);
                it.putExtra("text2",package_details[position]);
                it.putExtra("text3",packages[position][4]);
                startActivity(it);
            }
        });

    }
}